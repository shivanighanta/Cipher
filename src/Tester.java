
public class Tester {

	public static void main(String[] args) {
		String plainText = "Nima's pants are on fire!!!?!!";
		String cipherText = OldCipher.rotationCipherEncrypt(plainText, 3);
	
		System.out.println("Plaintext: " + plainText);
		System.out.println("Cipertext: " + cipherText);
	}

}