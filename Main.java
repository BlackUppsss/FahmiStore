
import Controller.GadgetController;
import Controller.LoginController;
import Controller.RegisterController;
import Controller.TransactionController;
import Node.GadgetNode;
import Node.UserNode;
import Object.User;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        GadgetController gadgetController = new GadgetController();
        RegisterController registerController = new RegisterController();
        LoginController LoginController = new LoginController();
        TransactionController transactionController = new TransactionController();

        MenuAplikasi(registerController, LoginController, gadgetController, transactionController);
    }
        static void MenuAplikasi(RegisterController registerController, LoginController LoginController, GadgetController gadgetController, TransactionController transactionController){
            Scanner inp = new Scanner(System.in);
            int pilihan;
            User loggedInUser = null;
            do {
                System.out.println("\n===== MENU =====");
                System.out.println("1. Register User");
                System.out.println("2. Register Admin");
                System.out.println("3. Login");
                System.out.println("4. View All Registered Users");
                System.out.println("5. Add Gadget");
                System.out.println("6. Buy Gadgets");
                System.out.println("7. History Transaksi");
                System.out.println("0. Exit");
                System.out.print("Masukkan Pilihanmu: ");
                pilihan = inp.nextInt();
                inp.nextLine();

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
                        LoginController.loadRegisteredUser(registerController);
                        System.out.print("Enter email: ");
                        String loginEmail = inp.nextLine();
                        System.out.print("Enter password: ");
                        String loginPassword = inp.nextLine();
                        loggedInUser = LoginController.Login(loginEmail, loginPassword);
                        break;
    
                    case 4:
                        System.out.println("----- Registered Users -----");
                        registerController.viewAllUsers();
                        break;
    
                    case 5:
                        if (loggedInUser == null) {
                            System.out.println("You must be logged in to perform this action.");
                        } else if (User.Role.Admin.equals(loggedInUser.getRole())) {
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
                        System.out.println("----- Beli Gadget -----");
                        gadgetController.viewAllGadgets();
                        System.out.print("Enter gadget name: ");
                            String gadgetName = inp.nextLine();
                            System.out.print("Enter how much you wanted to buy: ");
                            int stock = inp.nextInt();
                            boolean purchaseSuccess = gadgetController.reduceGadgetStock(gadgetName, stock);

                            if(purchaseSuccess){
                                GadgetNode gadgetNode = gadgetController.gadgetManager.findGadgetNode(gadgetName);
                                UserNode userNode = LoginController.findUserNode(loggedInUser.getEmail());

                            if (gadgetNode != null && userNode != null) {
                                transactionController.createTransaction(
                                    userNode, 
                                    gadgetNode, 
                                    stock,
                                    gadgetNode.data.getPrice() * stock
                                );
                                System.out.println("Gadget bought successfully!");
                            }
                        } else {
                            System.out.println(purchaseSuccess);
                            System.out.println("Purchase failed. Please check stock availability.");
                        }
                        break;

                    case 7:
                        System.out.println("----- History Transaksi -----");
                        transactionController.viewAllTransaction();
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
