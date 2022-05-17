package co.riqui.javacodingproblems.objects;

import lombok.extern.slf4j.Slf4j;

import java.util.Objects;

/**
 * @author ricardoquiroga on 16-05-22
 */
@Slf4j
public class Inmutable {
//    Los tipos primitivos son inmutables.
//    La famosa clase de Java Stringes inmutable (otras clases también son inmutables, por ejemplo Pattern, y LocalDate)
//    Los arreglos no son inmutables.
//    Las colecciones pueden ser mutables, no modificables o inmutables.

    public static void main(String[] args) {

//Una de las razones a favor de la inmutabilidad de cadenas está representada por el conjunto de constantes de cadenas
// ( SCP ) o conjunto en caché. Para entender esta declaración, profundicemos un poco en cómo funciona la Stringclase internamente.

//El SCP es un área especial en la memoria (no la memoria de almacenamiento dinámico normal) que se utiliza para el
// almacenamiento de cadenas literales. Supongamos las siguientes tres Stringvariables:
// ¿Cuántos Stringobjetos se han creado? Java crea solo un String objeto con el "book" valor.
//        Java almacena los literales de cadena en esta área especial de la memoria llamada SCP
        String x = "book";
        String y = "book";
        String z = "book";
// Si hacemos lo siguente,
        x = x.replace("b", "c");// Este comportamiento lo proporciona la inmutabilidad. Java creará un nuevo objeto y realizará el cambio en él
        log.info("Objects.deepEquals: " + Objects.deepEquals(x, z)); //
        log.info("p1 hash code: " + y.hashCode());
        log.info("p2 hash code: " + z.hashCode());
    }
}
