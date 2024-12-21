import Controller.GadgetController;
import Controller.LoginController;
import Controller.RegisterController;

public class Main {
    public static void main(String[] args) {
        // GadgetController gadgetController = new GadgetController();
        // gadgetController.creategadget("Xiaomi", 1000000, 20);
        // gadgetController.creategadget("Samsung", 1050000, 26);

        // gadgetController.viewAllGadgets();

        RegisterController registerController = new RegisterController();
        LoginController LoginController = new LoginController();

        registerController.createAcoount("ivan", "ivansahmurasoni@gmail.com", "12345");
        registerController.createAcoountAdmin("admin", "admin@test.net", "admin");
        
        
        System.out.println("----- Registered Users -----");
        registerController.viewAllUsers();
        
        System.out.println("----- Login Users -----");
        LoginController.loadRegisteredUser(registerController);    
        LoginController.Login("ivansahmurasoni@gmail.com", "12345");
        LoginController.Login("admin@test.net", "admin");
    }

}
