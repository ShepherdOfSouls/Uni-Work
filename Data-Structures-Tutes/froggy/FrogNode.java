package froggy;

/*
 * Minimal frog list
 */
public class FrogNode
{
	public Frog frog;
	public FrogNode next;

	public FrogNode(Frog f) {
		frog = f;
	}
	
	// adds the node n after the current. If the node n has futher links they are removed
	public void addAfter(FrogNode n) {
		if (next != null)
			n.next = next;
		next = n;
	}
}