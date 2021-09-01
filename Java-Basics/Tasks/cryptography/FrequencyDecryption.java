package cryptography;

public class FrequencyDecryption {

	
	public static void main(String[] args)
	{
		
		//get the character counts for the plaintext and encrypted text
		int[] plainTextCounts = getLetterCounts(getPlainTextMessage());
		int[] encryptedCounts = getLetterCounts(getEncryptedMessage());
		
		//convert to ordered lists of characters
		char[] plainTextList = getOrderedFrequencies(plainTextCounts);
		char[] encryptedList = getOrderedFrequencies(encryptedCounts);
		
		//find the key
		String key = getKey(plainTextList, encryptedList);
		
		//decrypt and print the message
		printTaskDescription(key);
		
	}
	
	
	public static String getPlainTextMessage()
	{
		String plainTextMessage = "This is some sample text to use as a reference. " 
			+ "Have you heard of quokkas?"
			+ "They're really cute Australian animals that seem like little roos with big puffy cheeks!"
			+ "If you want to see one, the best way is to fly to Perth, then catch a ferry over to Rottness island."
			+ "There are apparently about 10,000 on Rottness island. Wow!"
			+ "Sometimes, if you have superb selfie skills, you can take a selfie with them!"
			+ "They often look like they're smiling, which makes them very photogenic!"
			+ "Tortoises are also very q-ute. They have shells, you see. Tortoises might eat juicy fish."
			+ "Did you hear fish is 'poisson' in French?"
			+ "Tortoises are better than fish."
			+ "Juice is tastier than wine."
			+ "Is juice a good prize?"
			+ "Nnnnnooooooooooooo!"
			+ "This sentence is still strange."
			+ "quip, quid, quiz, quote, quit"
			+ "Good dogs/ pups meet bugs under beds."
			+ "Ponds."
			+ "Pepper."
			+ "Mind mood.";
		
		return plainTextMessage;
	}
	
	public static String getEncryptedMessage()
	{
		String encryptedMessage = "Uq hyygd hugk wyr'sk ckbuzakjkc qaud ikddmok. Byxojmq - rhmquyxd!  \n"
			+ "Lk jkmhhw ayzk wyr'sk kxfywkc cyuxo qaud mdduoxikxq. \n"
			+ "(Lk bkjqmuxhw kxfywkc ljuquxo uq!) \n"
			+ "Lk qayroaq uq lyrhc tk xubk qy amsk dyik zjuekd nyj qak nujdq qajkk zkyzhk qy nuxuda qak mdduoxikxq. \n"
			+ "Cy wyr qauxg wyr byrhc tk yxk yn qaydk zkyzhk? \n\n"
		 				
			+ "Qy tk khuouthk, wyr irdq amsk zmddkc mhh yn qak xyx-aucckx qkdqd yx ZMDQM. \n"
			+ "Un wyr amsk zmddkc qakdk qkdqd, qakx prubghw bakbg zumeem. Amd mxwyxk imck m zydq qamq dmwd... \n "
			+ "'Au kskjwyxk. Qaud iuoaq tk m tuq jmxcyi, trq prujgw pryggmd mjk p-rjuyrdhw p-rqk!!!'' \n\n"
		
			+ "Un xyq, wyr iuoaq tk qak nujdq qy nuxuda! \n \n"
		
		 	+ "Qy bhmui wyrj zjuek, imgk drjk wyr'sk zmddkc mhh qak ZMDQM qkdqd. \n"
		 	+ "Un wyr amsk, qakx imgk m zydq qamq dmwd kvmbqhw qak dmik qauxo md mtysk.\n "
		 	+ "Qamq ud, imgk m zydq qamq dmwd: \n"
			+"'Au kskjwyxk. Qaud iuoaq tk m tuq jmxcyi, trq prujgw pryggmd mjk p-rjuyrdhw p-rqk!!!' \n"
			+ "XYQK: Nkkh njkk qy zydq mxyxwiyrdhw, trq imgk drjk qaud zydq ud zrthub, dy yqakjd gxyl wyr'sk nuxudakc. \n\n"
		 
			+ "Qak dkbjkq ikddmok nyj dkbyxc zhmbk ud: 'Pryggmd pryqk pryggmd pruqk prubghw.'. \n"
			+ "Zhkmdk zydq qaud ux nyhhyl-rz cudbrdduyx dkbquyx yn qak nujdq zydq un wyr mjk dkbyxc! :) \n"
			+ "Nuxmhhw, qak dkbjkq ikddmok nyj qaujc zhmbk ud: 'Zkcmxqub zjyojmiikjd zkjnyji zjmbqumhhw zkjnkbqhw... zkjamzd'.\n\n" 
		 
			+ "Momux, zhkmdk zydq qaud ux nyhhyl-rz cudbrdduyx dkbquyx yn qak nujdq zydq un wyr mjk qaujc! :) \n"
			+ "Xyq nujdq, dkbyxc yj qaujc, trq dquhh lmxq qy fyux ux yx qak nrx? Imgk rz wyrj ylx qmrqyojmi mxc zydq uq ux qak "
			+ "nyhhyl-rz cudbrdduyx dkbquyx. \n\n"
		 
			+ "Nuxmhhw, qakjk mjk frdq m nkl qauxod lk lmxqkc qy dmw. \n"
			+ "Dyikquikd, wyr iuoaq nuxc qamq qak yjckjkc hudq yn iydq byiiyx hkqqkjd ux yxk qkvq \n"
			+ "ud dhuoaqhw cunnkjkxq njyi qak yqakj. \n"
			+ "Qamq'd ygmw qayroa! Wyr bmx dquhh rdk qaud ikqayc, trq luhh mhdy xkkc qy rdk dyik frcokikxq qy nuv mxw kjjyjd. \n\n"

			+ "Lk ayzk wyr amc nrx, mxc luda wyr oyyc hrbg nyj qak jkdq yn qak byrjdk! :) \n"
			+ "Mhh juoaq, qamq'd kskjwqauxo! \n\n";
		
		return encryptedMessage;
	}
	
	
	
	/**
	 * Counts the number of times each letter of the alphabet appears in the given string.
	 * Capital letters are included in the count. 
	 * Any characters in the string that are not letters, such as '!', ' ', '^' etc. are ignored.
	 * 
	 * @param inputString - the string whose letters should be counted
	 * @return - null if the input String is null
	 * Otherwise, a 1D int array of size 26. The count for 'a' is stored in position 0, 
	 * the count for 'b' is in position 1, 'c' is in position 2 etc. ('z' is in position 25)
	 * 
	 */
	public static int[] getLetterCounts(String inputString)
	{
		if (inputString == null)
			return null;
		
		int[] letterCounts = new int[26];
		
		//count the number of times each letter appears in the string
		for (int i = 0; i< inputString.length(); i++)
		{
			char currentCharacter = inputString.charAt(i);
			
			//skip non-letters
			if (!Character.isLetter(currentCharacter))
				continue;
			
			//convert to lower case
			currentCharacter = Character.toLowerCase(currentCharacter);
			
			//find this character's position in the alphabet. Eg. 'a' is in position 0
			int alphabetPosition = currentCharacter - 'a';
			letterCounts[alphabetPosition] ++;
			
		}
		return letterCounts;
		
	}
	
	
	/**
	 * Takes an integer array containing counts for each letter of the alphabet, 
	 * and returns a list of these letters in order from most frequent to least frequent.
	 * If there are any ties, then these tied letters will appear in alphabetical order. 
	 * The input array is not modified.
	 * 
	 * @param letterCounts - a 1D int array with counts for each letter of the alphabet. 
	 * The count for 'a' should be stored in position 0,  the count for 'b' should be in position 1, 
	 * 'c' should be in position 2 etc. ('z' would be in position 25)
	 * 
	 * @return null if the input is invalid (ie. the array is null, the length is not 26, or the array contains negative numbers)
	 * Otherwise, returns a 1D character array of lower case letters, 
	 * where the most frequent letter is in position 0, the next most frequent is in position 1 etc.
	 */
	public static char[] getOrderedFrequencies(int[] letterCounts)
	{
		//check the input is valid - not null, length of 26 and no negative numbers
		if (letterCounts == null)
			return null;
		if (letterCounts.length != 26)
			return null;
		for (int i = 0; i< letterCounts.length; i++)
			if (letterCounts[i] < 0)
				return null;
		
		char[] orderedFrequencies = new char[26];
		
		//create copy array so we don't modify the original
		int[] letterCountsCopy = new int[26];
		for (int i = 0; i< letterCounts.length; i++)
		{
			letterCountsCopy[i] = letterCounts[i];
		}
		
		//add each letter to the frequency list, starting with the most common letter
		for (int i =0; i<letterCounts.length; i++)
		{
			int highestFrequency = letterCountsCopy[0];
			char mostFrequentLetter = 'a';
			for (int j = 1; j<letterCountsCopy.length; j++)
			{
				int currentFrequency = letterCountsCopy[j];
				if (currentFrequency > highestFrequency)
				{
					mostFrequentLetter = (char)('a' + j);
					highestFrequency = currentFrequency;
				}
			}
			
			//add most frequent letter to list, 
			//and change value in copy array so it is no longer the most frequent
			orderedFrequencies[i] = mostFrequentLetter;
			letterCountsCopy[mostFrequentLetter-'a'] = Integer.MIN_VALUE;
			
		}
		
		return orderedFrequencies;
	}
	
	/**
	 * Creates and encryper with the given key, then uses it do decrypt and print
	 * the task description
	 * @param key - the key used to encrypt the task description
	 */
	public static void printTaskDescription(String key)
	{
		Encrypter e = new Encrypter(key, false);
		
		System.out.println(e.decryptString(getEncryptedMessage()));
	}
	
	
	/**
	 * Takes two lists of letters, ordered by frequency, and uses these to create a key. 
	 * One list is a list of characters from most frequent to least frequent in some normal text.
	 * The other is a list of characters from most frequent to least frequent in some encrypted text.
	 * The assumption is that the most frequent letter in the normal text should correspond to 
	 * the most frequent letter in the encrypted text, the second most frequent should correspond to
	 * the other second most frequent etc. 
	 * 
	 * @param plainTextChars - a 1D character array of length 26 containing the lower case letters 
	 * a-z, ordered from most frequent (position 0) to least frequent (position 25) based on the 
	 * number of times they appear in some normal text. 
	 * 
	 * @param encryptedChars - a 1D character array of length 26 containing the lower case letters 
	 * a-z, ordered from most frequent (position 0) to least frequent (position 25) based on the 
	 * number of times they appear in some encrypted text. 
	 * 
	 * @return - null if the input is invalid (ie. one of the arrays is null, or arrays don't contain exactly 
	 * one of each lower case letter from a-z, and nothing else).
	 * Otherwise, returns a 26 character string representing the key (probably) used to encrypt the encrypted text.
	 * The first letter in the string indicates what 'a' should be replaced by when encrypting,
	 * the second 'b', the third 'c' etc.
	 * For example, with the key "bcdefghijklmnopqrstuvwxyza", 
	 * 'a' is replaced with 'b', 'b' with 'c', 'c' with d'' and so on.
	 */
	public static String getKey(char[] plainTextChars, char[] encryptedChars)
	{
		if (plainTextChars == null || encryptedChars == null)
		{
			return null;
		}
		for (int i = 0; i < plainTextChars.length; i++)
		{
			if (!Character.isLetter(plainTextChars[i]) || !Character.isLetter(encryptedChars[i]))
			{
				return null;
			}
			for (int j = 0; j < plainTextChars.length; j++)
			{
				if ((plainTextChars[i] == plainTextChars[j] && i != j) || (encryptedChars[i] == encryptedChars[j] && i != j))
				{
					return null;
				}
			}
		}
		
		String key = "abcdefghijklmnopqrstuvwxyz";
		
		for (int i = 0; i < plainTextChars.length; i++)
		{
			int position = plainTextChars[i] - 'a';
			
			if (position == 0)
			{
				key = encryptedChars[i] + key.substring(position + 1);
			}
			else if (position == 25)
			{
				key = key.substring(0, position) + encryptedChars[i];
			}
			else
			{
				key = key.substring(0, position) + encryptedChars[i] + key.substring(position + 1);
			}
		}
		
		return key;
	}
}
