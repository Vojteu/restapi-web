package pl.vojteu.restapiweb;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String username;
    private String name;
    private int age;

    public User(String username, String name, int age) {
        this.username = username;
        this.name = name;
        this.age = age;
    }
}
