package khandaker.maruf.user_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User extends Persistent {

    private String username;

    private String email;

    private String password;

    private String firstName;

    private String lastName;

    private boolean enabled;
}
