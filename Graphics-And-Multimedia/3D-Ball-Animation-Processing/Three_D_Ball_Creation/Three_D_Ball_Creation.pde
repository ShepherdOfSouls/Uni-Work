
import java.util.ArrayList;
int framectr = 0;
float radius = 25;
ArrayList<ClickSphere> balls = new ArrayList<ClickSphere>();
  PImage img_1, img_2, img_3, img_4, img_5;
  PImage[] img_Arr;
void setup(){
  size(800, 800, P3D);
  noFill();
  img_1 = loadImage("earth.jpg");
  img_2 = loadImage("moon.jpg");
  img_3 = loadImage("berries.jpg");
  img_4 = loadImage("gnt.jpg");
  img_5 = loadImage("nuts.JPG");
  img_Arr = new PImage[5];
  img_Arr[0] = img_1;
  img_Arr[1] = img_2;
  img_Arr[2] = img_3;
  img_Arr[3] = img_4;
  img_Arr[4] = img_5;
}

void draw(){
  background(0);
  beginShape();
  stroke(255);
  vertex(0, 0, 0);
  vertex(0, 0, -width);
  vertex(0, width, -width);
  vertex(0, width, 0);
  
  vertex(0, 0, 0);
  vertex(0, 0, -width);
  vertex(width, 0, -width);
  vertex(width, 0, 0);
  
  vertex(width, 0, 0);
  vertex(width, 0, -width);
  vertex(width, width, -width);
  vertex(width, width, 0);
  
  vertex(width, width, 0);
  vertex(width, width, -width);
  vertex(0, width, -width);
  vertex(0, width, 0);
  endShape();
  noStroke();
  for (ClickSphere ball : balls){
    ball.display();
    ball.checkEdges();
    for (int i = (balls.indexOf(ball)+1); i < balls.size(); i++){
     ball.checkCollision(balls.get(i)); 
    }
    ball.update();
  }
  framectr++;
}

void mousePressed(){
  balls.add(new ClickSphere(mouseX, mouseY));
}

class ClickSphere{
  PVector location;
  PVector velocity;
  PVector acceleration;
  PShape sphere;
  ClickSphere(float posX, float posY){
    location = new PVector(posX, posY, 0);
    velocity = new PVector( random(-20,20), random(-20, 20), random(-20,-1));
    acceleration = new PVector( -0.002*velocity.x, 0.1 - 0.002*velocity.y, -0.002*velocity.z);
    sphere = createShape(SPHERE, 25);
    sphere.setTexture(img_Arr[framectr % 5]);
    
  }
  void update(){
    acceleration.set( -0.002*velocity.x, 0.1 - 0.002*velocity.y, -0.002*velocity.z);
    velocity.add(acceleration);
    location.add(velocity);
  }
  void display(){
    pushMatrix();
    translate(location.x, location.y, location.z);
    shape(sphere);
    popMatrix();
  }
  void checkEdges(){
    if (location.x <= radius){
      location.x = radius;
      velocity.x = 0.9 * velocity.x * -1;
    }
    else if(location.x >= width - radius) {
      location.x = width - radius;
      velocity.x = 0.9 * velocity.x * -1;
    }
    if (location.y <= radius){
      location.y = radius;
      velocity.y = 0.9 * velocity.y * -1;
    }
    else if(location.y >= width - radius) {
      location.y = width - radius;
      velocity.y = 0.9 * velocity.y * -1;
    }
    if (location.z >= radius){
      location.z = radius;
      velocity.z = 0.9 * velocity.z * -1;
    }
    else if (location.z <= radius - width) {
      location.z = radius - width;
      velocity.z = 0.9 * velocity.z * -1;
    }
  }
  
  void checkCollision(ClickSphere other){
   PVector distanceVect = PVector.sub(other.location, location);
   float distanceVectMag = distanceVect.mag();
   float minDistance = radius * 2;
   
   if (distanceVectMag < minDistance) {
      float distanceCorrection = (minDistance-distanceVectMag)/2.0;
      PVector d = distanceVect.copy();
      PVector correctionVector = d.normalize().mult(distanceCorrection);
      other.location.add(correctionVector);
      location.sub(correctionVector);
      
      PVector normal = distanceVect.copy().normalize();
      PVector reflect = PVector.mult(normal, velocity.dot(normal));
      reflect.mult(-2).add(velocity).mult(0.9);
      velocity.set(reflect);
      
      PVector normal_other = PVector.mult(normal, -1);
      PVector reflect_other = PVector.mult(normal_other, other.velocity.dot(normal_other));
      reflect_other.mult(-2).add(other.velocity).mult(0.9);
      other.velocity.set(reflect_other);
    }
  }
  
}
