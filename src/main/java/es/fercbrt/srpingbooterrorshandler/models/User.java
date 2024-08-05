package es.fercbrt.srpingbooterrorshandler.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private String lastname;
    private Role role;

    /*
    public String getRoleName() {
        return role.getName();
    }
    */
}
