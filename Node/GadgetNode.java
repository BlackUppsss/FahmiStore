package Node;

import Object.Gadget;

public class GadgetNode {
    Gadget data;
    public GadgetNode next;

    GadgetNode (Gadget data){
        this.data = data;
        data = null;
    }

    public String info(){
        return data.info();
    }

}
