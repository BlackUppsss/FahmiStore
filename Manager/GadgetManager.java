import Node.GadgetNode;
import Object.Gadget;

public class GadgetManager {
    GadgetNode head;

    public int insert(Gadget data){
        GadgetNode nn = new GadgetNode(data); 
        GadgetNode current = head; 

        if (current == null) {
            nn.next = null;
            head = nn;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = nn;
        }
        return 1;

    }

    public void printList() {
        GadgetNode current = head;
        while (current != null) {
            System.out.println(current.data.toString() + " ");
            current = current.next;
        }
    }

    
}
