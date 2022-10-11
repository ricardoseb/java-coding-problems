package co.riqui.javacodingproblems.datastructure;

import lombok.extern.slf4j.Slf4j;

import java.awt.event.WindowFocusListener;
import java.util.function.Function;

/**
 * @author ricardoquiroga on 10-10-22
 */
@Slf4j
public class Trie {

    private final Node root;

    public Trie() {
        root = new Node();
    }

    public boolean contains(String word) {

        Node node = root;

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);
            node = node.getChildren().get(ch);
            log.info("contains node  {}",node);
            if (node == null) {
                return false;
            }
        }

        return node.isWord();
    }

    @SuppressWarnings("unchecked")
    public void insert(String word) {
        Node node = root;
        log.info("insert node: {}", node);
        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);
            Function function = k -> new Node();

            node = node.getChildren().computeIfAbsent(ch, function);
            log.info("insert node 2 {}",node);
        }

        node.setWord(true);
        log.info("insert node 3 {}",node);
    }

    public boolean delete(String word) {

        return delete(root, word, 0);
    }

    private boolean delete(Node node, String word, int position) {

        if (word.length() == position) {
            if (!node.isWord()) {
                return false;
            }

            node.setWord(false);
            return node.getChildren().isEmpty();
        }

        char ch = word.charAt(position);
        Node children = node.getChildren().get(ch);

        if (children == null) {
            return false;
        }

        boolean deleteChildren = delete(children, word, position + 1);

        if (deleteChildren && !children.isWord()) {
            node.getChildren().remove(ch);
            return node.getChildren().isEmpty();
        }

        return false;
    }
}
