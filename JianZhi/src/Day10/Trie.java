package Day10;

import Day08.TreeNode;

/**
 * @author timwong5
 * @date 2022-07-10 15:28
 */
public class Trie {
    private Trie[] children;
    private boolean isEnd;


    public Trie() {
        children = new Trie[26];
        isEnd = false;
    }


    public void insert(String word) {
        Trie node = this;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            if (node.children[index] == null){
                node.children[index] = new Trie();
            }
            node = node.children[index];
        }
        node.isEnd = true;

    }

    public boolean search(String word) {
        Trie node = searchPrefix(word);
        return node!= null && node.isEnd;
    }

    /**
     * 检测前缀
     * @param prefix
     * @return
     */
    private Trie searchPrefix(String prefix) {
        Trie node = this;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            int index = c - 'a';
            if (node.children[index] == null){
                return null;
            }
            node = node.children[index];
        }
        return node;
    }

    public boolean startsWith(String prefix) {
        return searchPrefix(prefix) != null;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */