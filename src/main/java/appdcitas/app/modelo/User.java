package appdcitas.app.modelo;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.*;

import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "users")
@JsonPropertyOrder({ "id", "email", "password", "name"})
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(length = 11)
    private Integer id;


    @Column(length = 50)

    private String email;


    @Column(length = 80)

    private String name;


    @Column(length = 80)

    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}