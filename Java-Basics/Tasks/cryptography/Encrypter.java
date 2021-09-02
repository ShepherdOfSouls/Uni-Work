package cryptography;

public class Encrypter {

	private String key;
	private boolean removeSpaces;
	
	/**
	 * Creates an encrypter that uses the given key to encrypt and decrypt messages.
	 * 
	 * Checks if the given key is a valid key; if yes - creates an encrypter with the given key;
     * if not - creates an encryper with a key "abcdefghijklmnopqrstuvwxyz"
     *  
	 *
	 * @param key - a 26 character String of lower case letters representing the key 
	 * (*may assume this is not null*)
	 * 
	 * @param excludeSpaces - if true, indicates that the encrypter should remove spaces when encrypting.
	 * if false, the encrypter does not remove spaces.
	 */
	public Encrypter(String key, boolean excludeSpaces) {
		if(isKeyValid(key)) {
			this.key = key;
		} else if(!isKeyValid(key)) {
			this.key = "abcdefghijklmnopqrstuvwxyz";
		}
		
		this.removeSpaces = excludeSpaces;
	}
	
	/**
	 * Gets the key used by the encrypter for encryption and decryption
	 * 
	 * @return - the 26 character String of lower case letters representing the key
	 */
	public String getKey() {
		return this.key;
	}
	
	/**
	 * Checks if the encrypter is currently set to remove spaces 
	 * when encrypting. 
	 * 
	 * @return true if the encrypter is removing spaces, false otherwise
	 */
	public boolean isRemovingSpaces() {
		return this.removeSpaces; 
	}
	
	
	/**
	 * Changes the encrypter settings to make it either remove spaces
	 *  or stop removing spaces when encrypting
	 * 
	 * @param removeSpaces - true if the encrypter should remove spaces, 
	 * false if the encrypter should not remove spaces
	 */
	public void setSpaceRemoval(boolean removeSpaces) {
		this.removeSpaces = removeSpaces;
	}
	
	
	
	/**
	 * Changes the key used by the encrypter when encrypting and decrypting. 
	 * If the key is not valid, does nothing. 
	 * 
	 * @param newKey - a 26 character String of lower case letters representing a new key.
	 * (*may assume this is not null*)
	 * 
	 * @return - true if the key was changed, false if the key was not changed
	 */
	public boolean setKey(String newKey) {
		boolean valid = true;
		if (isKeyValid(newKey)) {
			this.key = newKey;
		} else if(!isKeyValid(newKey)) {
			valid = false;
		}
		
		return valid;
	}
	
	/**
	 * Checks if a given String is a valid key. 
	 * That is, if it has a length of 26, contains only lower case letters and contains exactly 1 of each letter
	 * 
	 * @param key - the String to check (*may assume this is not null*)
	 * @return true if the String is a valid key, false otherwise
	 */
	public static boolean isKeyValid(String key) {
		boolean[] checker = new boolean[26];
		
		if(key.length() != 26) {
			return false;
		}
		
		for(int i = 0; i < key.length(); i++) {
			int position = key.charAt(i) - 'a';
			
			if (position < 0 || position > 25) {
				return false;
			} else if (!checker[position]) {
				checker[position] = true;
			} else if (checker[position]) {
				return false;
			}
		}
		
		return true; 
	}
	
	/**
	 * Encrypts a single character using the key. If the character is not a letter,
	 * it does nothing to it. If the character is an upper case letter, then it should
	 * still be encrypted, and an upper case letter should be returned. 
	 * 
	 * @param characterToEncrypt - the character to be encrypted
	 * @return - the same character, if the input character is not a letter
	 * - an encrypted version of the input character if it is a letter. 
	 */
	public char encryptCharacter(char characterToEncrypt) {
		
		if(!Character.isLetter(characterToEncrypt)) {
			return characterToEncrypt;
		}
		
		char lowerCase = Character.toLowerCase(characterToEncrypt);
		int position = lowerCase -'a';
		char returnChar = key.charAt(position);
		
		if(Character.isUpperCase(characterToEncrypt)) {
			return Character.toUpperCase(returnChar);
		} else {
			return returnChar;
		}
	}
	
	/**
	 * Decrypts a single character using the key. If the character is not a letter,
	 * it does nothing to it. If the character is an upper case letter, then it should
	 * still be decrypted, and an upper case letter should be returned. 
	 * 
	 * @param characterToDecrypt - the character to be decrypted
	 * @return - the same character, if the input character is not a letter
	 * - a decrypted version of the input character if it is a letter. 
	 */
	public char decryptCharacter(char characterToDecrypt) {
		
		if(!Character.isLetter(characterToDecrypt)) {
			return characterToDecrypt;
		}
		
		char lowerCase = Character.toLowerCase(characterToDecrypt);
		char returnChar = 'a';
		
		for(int i = 0; i < key.length(); i++) {
			if(lowerCase == key.charAt(i)) {
				returnChar = (char) (i + 'a');
			}	
		}
		
		if(Character.isUpperCase(characterToDecrypt)) {
			return Character.toUpperCase(returnChar);
		} else {
			return returnChar;
		}
	}
	
	/**
	 * Takes a String a returns an encrypted version of that String using the key. 
	 * Only letters are encrypted. If the encrypter is set to remove spaces, then
	 * all whitespace should be removed from the string. Any other characters, such 
	 * as punctuation marks, should remain as they are.
	 * 
	 * @param plainText - the string to be encrypted (*may assume this is not null*)
	 * @return - an encrypted version of the input string
	 */
	public String encryptString(String plainText) {
		if(removeSpaces) {
			plainText = plainText.trim();
		}
		
		char letter;
		
		for(int i = 0; i < plainText.length(); i++) {
			letter = encryptCharacter(plainText.charAt(i));
			
			if (removeSpaces && Character.isWhitespace(letter)) {
				plainText = plainText.substring(0, i) + plainText.substring(i+1);
			}
				
			letter = encryptCharacter(plainText.charAt(i));
				
			if (i==0) {
				plainText = letter + plainText.substring(i+1);
			} else if (i == plainText.length()-1) {
				plainText = plainText.substring(0, i) + letter;
			} else {
				plainText = plainText.substring(0, i) + letter + plainText.substring(i+1);
			}
		
		}
		return plainText; 
	}
	
	
	/**
	 * Takes a String a returns a decrypted version of that String using the key. 
	 * Only letters are decrypted.  Any other characters, such as punctuation marks, should remain as they are.
	 * Whitespace should not be removed when decrypting.
	 * 
	 * @param cipherText - the string to be encrypted (*may assume this is not null*)
	 * @return - an encrypted version of the input string
	 */
	public String decryptString(String cipherText) {
		char letter;
		
		for(int i = 0; i < cipherText.length(); i++) {
			letter = (char) cipherText.charAt(i);
			
			if(i == 0) {
				cipherText = decryptCharacter(letter) + cipherText.substring(i+1);
			} else if(i == (cipherText.length()-1)) {
				cipherText = cipherText.substring(0, i) + decryptCharacter(letter);
			} else {
				cipherText = cipherText.substring(0, i) + decryptCharacter(letter) + cipherText.substring(i+1);
			}
		}
		return cipherText;
	}
}
