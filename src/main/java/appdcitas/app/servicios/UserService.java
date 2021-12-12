package appdcitas.app.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import appdcitas.app.modelo.User;
import appdcitas.app.repositorio.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {

        var it = repository.findAll();
        var users = new ArrayList<User>();
        it.forEach(client -> users.add(client));
        return users;
    }

    public User save(User user) {
        if(user.getId() == null) {
            return repository.save(user);
        } else {
            Optional<User> result = repository.findById(user.getId());
            if(result.isEmpty()) {
                return repository.save(user);
            } else {
                return user;
            }
        }
    }

    public boolean isEmailPresent(String email) {

        if(repository.getUserByEmail(email) != null) {
            return true;
        } else {
            return false;
        }
    }

    public User autenticate(String email, String password) {

        User user = repository.getUserByEmailAAndPassword(email, password);

        if (user == null) {

            User newUser = new User();
            newUser.setEmail(email);
            newUser.setPassword(password);
            newUser.setName("NO DEFINIDO");

            return newUser;
        } else {
            return user;
        }
    }
}