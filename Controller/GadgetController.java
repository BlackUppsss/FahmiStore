package Controller;

import List.GadgetManager;
import Object.Gadget;

public class GadgetController {
    public GadgetManager gadgetManager;

    public GadgetController(GadgetManager gadgetManager) {
        this.gadgetManager = gadgetManager;
    }
    public void creategadget(String namaGadget, double price, int stock) {
     
        Gadget newGadget = new Gadget(0, namaGadget, price, stock);
        gadgetManager.insert(newGadget);
        System.out.println("User registered successfully: " + namaGadget);

    }
}
