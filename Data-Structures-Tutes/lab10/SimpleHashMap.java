package lab10;

import java.util.ArrayList;
import java.util.List;

public class SimpleHashMap implements HashMap{
	
	private HashMapEntry[] items;
	private int noOfItems;
	
	public SimpleHashMap(int size){
		this.items = new HashMapEntry[size];
		this.noOfItems = 0;
	}
	
	public int size(){
		return noOfItems;
	}
	
	public boolean isEmpty(){
		if(noOfItems == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public Object get(Object key){
		int index = hash(key) % items.length;
		
		HashMapEntry entry = items[index];
		if(entry == null){
			return null;
		}
		if(!entry.key.equals(key)){
			return null;
		}
		
		return entry.value;
	}
	
	public void put(Object key, Object value){
		int index = hash(key) % items.length;
		
		if(items[index] == null){
			noOfItems++;
		}
		
		items[index] = new HashMapEntry(key, value);
	}
	
	public Object remove(Object key){
		int index = hash(key) % items.length;
		
		HashMapEntry entry = items[index];
		if(entry == null){
			return null;
		}
		if(!entry.key.equals(key)){
			return null;
		}
		if(entry.key.equals(key)){
			noOfItems--;
			items[index] = null;
		}
		
		return entry.value;
	}
	
	public List<Object> keys(){
		List<Object> keys = new ArrayList<Object>();
		for(HashMapEntry entry : items){
			if(entry != null){
				keys.add(entry.key);
			}
		}
		return keys;
	}
	
	public List<Object> values(){
		List<Object> values = new ArrayList<Object>();
		for(HashMapEntry entry : items){
			if(entry != null){
				values.add(entry.value);
			}
		}
		return values;
	}
	
	private int hash(Object key){
		return Math.abs(key.hashCode());
	}
	
	

}
