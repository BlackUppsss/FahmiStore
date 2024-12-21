import Controller.GadgetController;
import Controller.LoginController;
import Controller.RegisterController;
import Object.User;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        RegisterController registerController = new RegisterController();
        LoginController loginController = new LoginController();
        GadgetController gadgetController = new GadgetController();
        MenuAplikasi(registerController, loginController, gadgetController);
        
                // gadgetController.viewAllGadgets();
        
                
                
                // registerController.createAcoount("ivan", "ivansahmurasoni@gmail.com", "12345");
                // registerController.createAcoountAdmin("admin", "admin@test.net", "admin");
                
                // System.out.println("----- Registered Users -----");
                // registerController.viewAllUsers();
                
                // System.out.println("----- Login Users -----");
                // LoginController.loadRegisteredUser(registerController);    
                // LoginController.Login("ivansahmurasoni@gmail.com", "12345");
                // LoginController.Login("admin@test.net", "admin");
                
            }
        static void MenuAplikasi(RegisterController registerController, LoginController LoginController, GadgetController gadgetController){
            Scanner inp = new Scanner(System.in);
            int pilihan;
            do {
                System.out.println("\n===== MENU =====");
                System.out.println("1. Register User");
                System.out.println("2. Register Admin");
                System.out.println("3. Login");
                System.out.println("4. View All Registered Users");
                System.out.println("5. Add Gadget");
                System.out.println("6. View All Gadgets");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");

                pilihan = inp.nextInt();
                inp.nextLine();
                User loggedInUser = null;

                switch (pilihan) {
                    case 1:
                        System.out.print("Enter username: ");
                        String username = inp.nextLine();
                        System.out.print("Enter email: ");
                        String email = inp.nextLine();
                        System.out.print("Enter password: ");
                        String password = inp.nextLine();
                        registerController.createAcoount(username, email, password);
                        break;
    
                    case 2:
                        System.out.print("Enter admin username: ");
                        String adminUsername = inp.nextLine();
                        System.out.print("Enter admin email: ");
                        String adminEmail = inp.nextLine();
                        System.out.print("Enter admin password: ");
                        String adminPassword = inp.nextLine();
                        registerController.createAcoountAdmin(adminUsername, adminEmail, adminPassword);
                        break;
    
                    case 3:
                        System.out.print("Enter email: ");
                        String loginEmail = inp.nextLine();
                        System.out.print("Enter password: ");
                        String loginPassword = inp.nextLine();
                        loggedInUser = LoginController.Login(loginEmail, loginPassword);

                        if (loggedInUser != null) {
                            System.out.println("Login successful! Welcome, " + loggedInUser.getUsername());
                        } else {
                            System.out.println("Invalid email or password.");
                        }
                        break;
    
                    case 4:
                        System.out.println("----- Registered Users -----");
                        registerController.viewAllUsers();
                        break;
    
                    case 5:
                        if (loggedInUser == null) {
                            System.out.println("You must be logged in to perform this action.");
                        } else if ("admin".equals(loggedInUser.getRole())) {
                            System.out.print("Enter gadget name: ");
                            String gadgetName = inp.nextLine();
                            System.out.print("Enter gadget price: ");
                            double price = inp.nextDouble();
                            System.out.print("Enter gadget stock: ");
                            int stock = inp.nextInt();
                            gadgetController.creategadget(gadgetName, price, stock);
                            System.out.println("Gadget added successfully!");
                        } else {
                            System.out.println("Access denied. Only admins can add gadgets.");
                        }
                        break;
    
                    case 6:
                        System.out.println("----- Gadget List -----");
                        gadgetController.viewAllGadgets();
                        break;
    
                    case 0:
                        System.out.println("Exiting the system. Goodbye!");
                        break;
    
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }

            
        } while (pilihan != 0);
    }

    
}
