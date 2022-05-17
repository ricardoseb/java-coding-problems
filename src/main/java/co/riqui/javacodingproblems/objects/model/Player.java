package co.riqui.javacodingproblems.objects.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import java.util.Objects;

/**
 * @author ricardoquiroga on 16-05-22
 */
@EqualsAndHashCode //lombok reemplaza el equal y hashcode utilizado
@AllArgsConstructor
public class Player {
    private int id;
    private String name;

//sobreescribimos equals para que cumpla con con la comparacion de objetos
//    @Override
//    public boolean equals(Object obj) {
//
//        if (this == obj) {
//            return true;
//        }
//
//        if (obj == null) {
//            return false;
//        }
//
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//
//        final Player other = (Player) obj;
//
//        if (this.id != other.id) {
//            return false;
//        }
//
//        if (!Objects.equals(this.name, other.name)) {
//            return false;
//        }
//
//        return true;
//    }
//
//    //Cuando equals()se anula, hashCode()también se debe anular, y viceversa.
//    //Utilice los mismos atributos de identificación para ambos métodos en el mismo orden.
//    @Override
//    public int hashCode() {
//
//        int hash = 7;
//        hash = 79 * hash + this.id;
//        hash = 79 * hash + Objects.hashCode(this.name);
//
//        return hash;
//    }


}
