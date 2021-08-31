package cryptography;

import java.util.Scanner;

public class SecretMessages {

	public static Encrypter key = new Encrypter ("zabcdefghijklmnopqrstuvwxy", false);
	
	public static void main(String[] args) 
	{		
			int choice = 0;
			
			while (choice != -1)
			{
			printOptions();
			
			choice = getUserChoice();
			
			if (choice == 1)
			{
				doEncryption(key);
			}
			else if (choice == 2)
			{
				doDecryption(key);
			}
			else if (choice == 3)
			{
				printKey(key);
			}
			else if (choice == 4)
			{
				changeKey(key);
			}
			else if (choice == 5)
			{
				changeSpaceMode(key);
			}
			else if (choice == -1)
			{
				System.out.println("Quitting. Goodbye.");
			}
			}
			
			
	}
	
	/**
	 * Prints out the different options the user has when running this program
	 */
	public static void printOptions()
	{
		
		System.out.println("What would you like to do?");
		System.out.println("1 - encrypt a message");
		System.out.println("2 - decrypt a message");
		System.out.println("3 - check the key");
		System.out.println("4 - change the key");
		System.out.println("5 - change space mode");
		System.out.println("other - quit");
	}
	
	/**
	 * Gets the user's choice on what to do next. 
	 * @return - an integer between 1 and 5 if this is what the user inputs
	 * - if the user inputs a number outside this range, or something that is
	 * not an integer, returns -1
	 */
	public static int getUserChoice()
	{
			Scanner keyboard = new Scanner(System.in);
			
			if (keyboard.hasNextInt())
			{
			int choice = keyboard.nextInt();
			keyboard.close();
			if (choice > 0 && choice < 6)
			{
				return choice;
			}
			
			else
			{
				return -1;
			}
			}
			
			else
			{
				keyboard.close();
				return -1;
			}
			
		
		
	}
	
	/**
	 * Asks the user to enter a message to encrypt, 
	 * uses the given encrypter to encrypt that message,
	 * then prints the encrypted message
	 * 
	 * @param e - the encrypter to be used when encrypting
	 */
	public static void doEncryption(Encrypter e)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a message to encrypt: ");
		String message = keyboard.nextLine();
		keyboard.close();
		System.out.println(e.encryptString(message));
	}
	
	/**
	 * Asks the user to enter a message to decrypt, 
	 * uses the given encrypter to decrypt that message,
	 * then prints the decrypted message
	 * 
	 * @param e - the encrypter to be used when encrypting
	 */
	public static void doDecryption(Encrypter e)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a message to decrypt: ");
		String message = keyboard.nextLine();
		keyboard.close();
		System.out.println(e.decryptString(message));
	}
	
	/**
	 * Asks the user to enter a new key to replace the given encrypter's old key.
	 * Will not replace the key if the new key is invalid.
	 * Prints whether the key was successfully replaced or not
	 * 
	 * @param e - the encrypter whose key should be replaced
	 */
	public static void changeKey(Encrypter e)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a new key: ");
		String newKey = keyboard.nextLine();
		keyboard.close();
		e.setKey(newKey);
		
		if (e.setKey(newKey))
		{
			System.out.println("Key has been replaced.");
		}
		else if (!e.setKey(newKey))
		{
			System.out.println("Key has not been replaced. New key invalid.");
		}
	}
	
	/**
	 * Prints the key of the give encrypter
	 * 
	 * @param e - the encrypter whose key should be printed
	 */
	public static void printKey(Encrypter e)
	{
		System.out.println(e.getKey());
	}
	
	/**
	 * Swaps the space removal mode of the given encrypter. 
	 * That is, if the encrypter is currently removing spaces when encrypting, 
	 * it changes this so that it no longer removes spaces.
	 * If it is not removing spaces, then changes it so that is does remove spaces.
	 * 
	 * @param e - the encrypter whose mode should be changed.
	 */
	public static void changeSpaceMode(Encrypter e)
	{
		if (e.isRemovingSpaces())
		{
			e.setSpaceRemoval(false);
		}
		else if (!e.isRemovingSpaces())
		{
			e.setSpaceRemoval(true);
		}
	}
	

}
