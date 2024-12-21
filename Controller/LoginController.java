package Controller;

import List.LoginManager;
import List.RegisterManager;

public class LoginController {

    public LoginManager loginManager;
    public LoginController() {
        this.loginManager = new LoginManager();
    }

    public void Login(String username, String password){
        String loginResult = loginManager.login(username, password);
        System.out.println(loginResult);
    }

    public void loadRegisteredUser(RegisterController registerController){
        this.loginManager.head = registerController.getUserListHead();
    }
}