import java.util.HashSet;

public class Vowel {

    public static boolean containsAllVowels(String str) {
        HashSet<Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        for (char c : str.toLowerCase().toCharArray()) {
            if (vowels.contains(c)) {
                vowels.remove(c);}
                if (vowels.isEmpty()) 
                    return true;
            }
        return false;
    }
    
    public static void main(String[] args) {
    	
    	String s1 = "The quick brown fox jumps over the lazy dog";
    	String s2 = "Hello, World";
        System.out.println(containsAllVowels(s1));
        System.out.println(containsAllVowels(s2));    
   }
}
