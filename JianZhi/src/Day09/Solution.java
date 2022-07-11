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

        Trie trie = new Trie();
        for (String word : dictionary) {
            Trie cur = trie;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                cur.children.putIfAbsent(ch, new Trie());
                cur = cur.children.get(ch);
            }
            cur.children.put('#', new Trie());
        }
            String[] words = sentence.split(" ");
            for (int i = 0; i < words.length; i++) {
                words[i] = findRoot(words[i], trie);
            }
            return String.join(" ", words);
        }


    /**
     * 查找单词里是否有词根root
     * @return
     */
    private String findRoot(String word, Trie trie) {
        StringBuffer root = new StringBuffer();
        Trie cur = trie;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (cur.children.containsKey('#')){
                return root.toString();
            }
            if (!cur.children.containsKey(ch)){
                return word;
            }
            root.append(ch);
            cur = cur.children.get(ch);

        }
        return root.toString();
    }

}

class Trie {
    Map<Character, Trie> children;

    public Trie() {
        children = new HashMap<Character, Trie>();
    }
}

