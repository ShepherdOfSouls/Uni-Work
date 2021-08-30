package lab2;

import java.util.ArrayList;

public class Hailstone {
	public static ArrayList<Integer> hailstone(int n)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (n == 1)
		{
			list.add(n);
		}
		else if (n % 2 == 0)
		{
			list.add(n);
			list.addAll(hailstone(n/2));
		}
		else if (n % 2 != 0)
		{
			list.add(n);
			list.addAll(hailstone(3*n + 1));
		}
		
		return list;
	}

}
