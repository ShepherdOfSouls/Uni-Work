package lab8;

public interface Heap {
	public void insert(int key, Object value);
	public Object removeRoot();
	public int size();
	public boolean isEmpty();

}
