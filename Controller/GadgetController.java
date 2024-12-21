package Controller;

import List.GadgetManager;
import Object.Gadget;

public class GadgetController {
    public GadgetManager gadgetManager;

    public GadgetController() {
        this.gadgetManager = new GadgetManager();
    }
    public void creategadget(String namaGadget, double price, int stock) {
     
        Gadget newGadget = new Gadget(0, namaGadget, price, stock);
        gadgetManager.insert(newGadget);
        System.out.println("Gadget registered successfully: " + namaGadget);

    }

    public void deleteGadget(Gadget gadget) {
        int result = gadgetManager.delete(gadget);
        if (result == 1) {
            System.out.println("Gadget deleted successfully: " + gadget.info());
        } else {
            System.out.println("Failed to delete gadget.");
        }
    }

    public void viewAllGadgets() {
        System.out.println("Gadget List:");
        gadgetManager.printList();
    }

    public void reduceGadgetStock(String gadgetName, int amount) {
        boolean result = gadgetManager.reduceStock(gadgetName, amount);
        if (result) {
            System.out.println("Stock successfully reduced for gadget: " + gadgetName);
        } else {
            System.out.println("Failed to reduce stock for gadget: " + gadgetName);
        }
    }
}
