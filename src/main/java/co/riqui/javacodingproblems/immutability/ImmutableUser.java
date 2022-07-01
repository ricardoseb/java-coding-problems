package co.riqui.javacodingproblems.immutability;

import lombok.Getter;
import lombok.ToString;

import java.util.Date;

/**
 * @author ricardoquiroga on 17-05-22
 * Cuando una clase (inmutable o mutable) tiene demasiados campos, requiere un constructor con muchos argumentos.
 * Cuando algunos de esos campos son obligatorios y otros son opcionales, esta clase necesitará varios constructores
 * para cubrir todas las combinaciones posibles.
 */

@Getter
@ToString
public final class ImmutableUser {

    private final String nickname;
    private final String password;
    private final String firstname;
    private final String lastname;
    private final String email;
    private final Date created;

    private ImmutableUser(UserBuilder builder) {
        this.nickname = builder.nickname;
        this.password = builder.password;
        this.created = builder.created;
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.email = builder.email;
    }

    public static UserBuilder getBuilder(
            String nickname, String password) {
        return new ImmutableUser.UserBuilder(nickname, password);
    }


    public static final class UserBuilder {
        private final String nickname;
        private final String password;
        private final Date created;
        private String email;
        private String firstname;
        private String lastname;


        public UserBuilder(String nickname, String password) {
            this.nickname = nickname;
            this.password = password;
            this.created = new Date();
        }

        public ImmutableUser build() {
            return new ImmutableUser(this);
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }
    }
}
