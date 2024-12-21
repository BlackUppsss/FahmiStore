package Controller;
import List.RegisterManager;
import Node.UserNode;
import Object.User;
public class RegisterController {

    public RegisterManager registerManager;

    public RegisterController() {
        this.registerManager = new RegisterManager();
    }
    public void createAcoount(String username, String email, String password) {
        User newUser = new User(0, username, email, password, User.Role.User);
        registerManager.insert(newUser);
        System.out.println("User registered successfully: " + email);
    }

    public void createAcoountAdmin(String username, String email, String password) {
        User newUser = new User(0, username, email, password, User.Role.Admin);
        registerManager.insert(newUser);
        System.out.println("Admin registered successfully: " + email);

    }

    public void viewAllUsers() {
        System.out.println("User List:");
        registerManager.printList();
    }

      public UserNode getUserListHead() {
        return registerManager.head;
    }
    
}
