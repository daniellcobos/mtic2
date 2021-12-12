package appdcitas.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import appdcitas.app.modelo.User;
import appdcitas.app.servicios.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "*",methods = {RequestMethod.PUT,RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE})
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/all")
    public List<User> getAll() {
        return service.findAll();
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public User save(@RequestBody User user) {
        return service.save(user);
    }

    @GetMapping("/{email}")
    public boolean isEmailPresent(@PathVariable("email") String email) {

        return service.isEmailPresent(email);
    }

    @GetMapping("/{email}/{password}")
    public User authenticateUser(@PathVariable("email") String email, @PathVariable("password") String password) {

        return service.autenticate(email, password);
    }
}
