package froggy;

public class Frog
{
	private static int frogid = 0;
	private String name;
	private int value;
	private int id;
	
	public Frog(String name, int v) { this.name = name; value = v; init(); }
	private void init() { id = frogid++; }

	// clone
	public Frog(Frog f) { 
		value = f.getValue();
		name = f.getName();
		id = getID();
	}
	
	public String getName() { return name; }
	public int getID() { return id; }
	public int getValue() { return value; }
	
	public void ribbit() {
		System.out.printf("id: %d name: %s value: %d ", 
			getID(), getName(), getValue()); 
		for (int i = 0; i < getValue(); i++)
			System.out.printf("ribbit");
		System.out.println("");
	}
}
