package Controller;
import List.RegisterManager;
import Object.User;
public class RegisterController {

    public RegisterManager registerManager;

    public RegisterController(RegisterManager registerManager) {
        this.registerManager = registerManager;
    }
    public void createAcoount(String username, String email, String password) {
     
        User newUser = new User(0, username, email, password);
        registerManager.insert(newUser);
        System.out.println("User registered successfully: " + email);

    }
    
}
