package Controller;

import List.LoginManager;
import List.RegisterManager;
import Object.User;

public class LoginController {

    public LoginManager loginManager;
    public LoginController() {
        this.loginManager = new LoginManager();
    }

    public User Login(String username, String password){
        String loginResult = loginManager.login(username, password);
        System.out.println(loginResult);
        return null;
    }

    public void loadRegisteredUser(RegisterController registerController){
        this.loginManager.head = registerController.getUserListHead();
    }
}