package co.riqui.javacodingproblems.datastructure;

/**
 * @author ricardoquiroga on 10-10-22
 */
public class Main {

    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("cat");
        System.out.println("Contains 'cat': " + trie.contains("cat"));
    }
}
