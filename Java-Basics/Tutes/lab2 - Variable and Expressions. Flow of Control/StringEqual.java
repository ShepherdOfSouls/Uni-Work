package lab2;

public class StringEqual 
{

	//The brief here was to check if the original program correctly compared the strings and if not to change it.
	public static void main(String[] args) 
	{
		String str1 = "abcd";
		String str2 = "abcdefg";
		String str3 = str1 + "efg";
		
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);
		
		//This was the original if statement, I changed the printing to actually say what it was doing.
		if (str2 == str3)
		{
			System.out.println("The strings have the same memory address");
		}
		else
		{
			System.out.println("The strings do not have the same memory address");
		}
		
		//The if statement that I added to properly compare strings.
		if (str2.equals(str3))
		{
			System.out.println("The strings are equal");
		}
		else
		{
			System.out.println("The strings are not equal");
		}
	}

}
