package kadai_21;

public class DictionaryExec_Chapter21 {
	
	public static void main(String[]args) {
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		dictionary.wordPut();
		
		//検索ワード配列
		String[] wordsSearch = {"apple", "banana", "grape", "orange"};
		
        for(String word : wordsSearch) {
        	dictionary.setSearchWord(word);
        	dictionary.search();
        }
		
		
		
	}

}
