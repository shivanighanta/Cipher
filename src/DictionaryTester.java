
public class DictionaryTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Dictionary d = Dictionary.buildDictionary("/Volumes/SHIVANI 2/CipherBlankTemplate/words.txt");
		System.out.println(d.isWord("dandiya"));
	}

}
