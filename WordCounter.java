import java.util.TreeMap;

public class WordCounter {
	
    public static TreeMap<String, Integer> countWords(String[] words) {
    	
        TreeMap<String, Integer> wordCount = new TreeMap<>();

        for (String word : words) {
            word = word.toLowerCase();
            if (wordCount.containsKey(word)) 
                wordCount.put(word, wordCount.get(word) + 1); 
            else
                wordCount.put(word, 1); 
        }
        return wordCount;
    }

    public static void main(String[] args) {
    	
        String[] words = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        System.out.println(countWords(words));
    }
}
