package co.riqui.javacodingproblems.datastructure;

import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ricardoquiroga on 10-10-22
 */
@ToString
public class Node {

    private final Map<Character, Node> children = new HashMap<>();
    private boolean word;

    public Map<Character, Node> getChildren() {
        return children;
    }

    public boolean isWord() {
        return word;
    }

    public void setWord(boolean word) {
        this.word = word;
    }
}
