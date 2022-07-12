package co.riqui.javacodingproblems.arrays.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author ricardoquiroga on 11-07-22
 */

@Data
@EqualsAndHashCode
public class Melon {
    private final String type;
    private final int weight;
}
