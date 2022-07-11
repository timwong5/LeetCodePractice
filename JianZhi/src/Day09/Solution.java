package Day09;


import java.util.*;


public class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {

//        Set<String> dictionarySet = new HashSet<>();
//        dictionarySet.addAll(dictionary);
//
//        String[] words = sentence.split(" ");
//
//        for (int i = 0; i < words.length; i++) {
//            String word = words[i];
//            for (int j = 0; j < word.length(); j++) {
//                if (dictionarySet.contains(word.substring(0, j+1))) {
//                    words[i] = word.substring(0, 1 + j);
//                    break;
//                }
//            }
//        }
//
//        return String.join(" ", words);

        return "";

    }

}

class Trie {
    Map<Character, Trie> children;

    public Trie() {
        children = new HashMap<Character, Trie>();
    }
}

