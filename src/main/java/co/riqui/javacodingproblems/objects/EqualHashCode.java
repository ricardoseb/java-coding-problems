package co.riqui.javacodingproblems.objects;

import co.riqui.javacodingproblems.objects.model.Player;
import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

/**
 * @author ricardoquiroga on 16-05-22
 */
@Slf4j
public class EqualHashCode {
//Su objetivo principal es proporcionar una solución fácil, eficiente y robusta para comparar objetos y determinar
// si son iguales

//Cuando estos métodos no se reemplazan, Java utilizará sus implementaciones predeterminadas. Desafortunadamente, la
// implementación predeterminada no cumple realmente el objetivo de determinar si dos objetos tienen el mismo valor. De
// forma predeterminada, equals()comprueba la identidad . En otras palabras, considera que dos objetos son iguales si,
// y solo si, están representados por la misma dirección de memoria (mismas referencias de objeto), mientras que
// hashCode()devuelve una representación entera de la dirección de memoria del objeto. Esta es una función nativa
// conocida como código hash de identidad

    public static void main(String[] args) {

        Player p1 = new Player(1, "Rafael Nadal");
        Player p2 = new Player(1, "Rafael Nadal");

        log.info("{}",p1.equals(p2)); //false sin override equals

        log.info("p1 hash code: " + p1.hashCode()); //1630521067  sin override hashCode
        log.info("p2 hash code: " + p2.hashCode()); //315138752 sin override hashCode
        log.info("Objects.equals: " + Objects.equals(p1, p2)); //
        log.info("Objects.deepEquals: " + Objects.deepEquals(p1, p2)); //

    }
}
