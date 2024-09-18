import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        
        String[] word1 = s1.split(" ");
        String[] word2 = s2.split(" ");

        String[] words = new String[word1.length + word2.length];
        System.arraycopy(word1, 0, words, 0, word1.length);
        System.arraycopy(word2, 0, words, word1.length, word2.length);

        Map<String, Integer> wordFrequency = new HashMap<>();
        for(String word : words){
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        List<String> uncommonwords = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : wordFrequency.entrySet()){
            if(entry.getValue() == 1){
                uncommonwords.add(entry.getKey());
            }
        }

        return uncommonwords.toArray(new String[0]);
    }
    public static void main(String[] args){
        Solution solution = new Solution();
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";
        String[] uncommon = solution.uncommonFromSentences(s1, s2);
        for(String word : uncommon){
            System.out.println(word);
            }
    }
}