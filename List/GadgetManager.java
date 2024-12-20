package List;

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

    public int delete(Gadget data){
        if(head == null){
            System.out.println("List gadget kosong");
            return -1;
        }

        GadgetNode current = head;
        GadgetNode previous = null;

        if(current.data.equals(data)){
            head = current.next;
            System.out.println("Deleted : " + data);
            return 1;
        }

        while (current != null && !current.data.equals(data)) {
            previous = current;
            current = current.next;
        }

        if(current == null){
            System.out.println("Data gadget tidak ditemukan di dalam list");
            return -1;
        }

        previous.next = current.next;
        System.out.println("Deleted: " + data);
        return 1;
    }

    public void printList() {
        GadgetNode current = head;
        while (current != null) {
            System.out.println(current.data.info() + " ");
            current = current.next;
        }
    }

    
}
