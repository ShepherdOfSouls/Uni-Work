# Cryptography Task
Small example of very basic encryption using a key.
* Encrypter.java
    Contains the Encrypter class. Once instantiated as an object, stores the current key and allows you to use it to encrypt or decrypte Strings. You can also set whether it removes spaces or not.
* SecretMessages.java
    Accepts input to allow users to encrypt or decrypt their own messages. Has a menu of options for the user to navigate or exit using input numbers. Starts with a default key.
    User can:
    1. Enter a string to be encrypted with the current key
    2. Enter a string to be decrypted with the current key
    3. Print the current key
    4. Set a new key
    5. Swap the space removing behaviour of Encrypter object
    6. Exit menu loop
* FrequencyDecryption.java
    A that involves creating the right key to decrypt a set message. It uses the frequency of letters to create a key by comparing an unencrypted and encrypted message. Using that key it decrypts the message, showing some instructions for the students of the class.