package List;

import Node.HistoryNode;

public class HistoryManager {
    HistoryNode head;

    public void printList() {
        HistoryNode current = head;
        while (current != null) {
            System.out.println(current.data.info() + " ");
            current = current.next;
        }
    }


}
