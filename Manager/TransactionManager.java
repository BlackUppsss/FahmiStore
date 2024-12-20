import Node.TransactionNode;
import Object.Transaction;

public class TransactionManager {
    TransactionNode head;

     public int insert(Transaction data){
        TransactionNode nn = new TransactionNode(data); 
        TransactionNode current = head; 

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
        TransactionNode current = head;
        while (current != null) {
            System.out.println(current.data.toString() + " ");
            current = current.next;
        }
    }


}
