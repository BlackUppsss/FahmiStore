package Node;

import Object.History;

public class HistoryNode {
    History data;
    HistoryNode next;
    
    HistoryNode(History data){
        this.data = data;
        next = null;
    }

    public String info(){
        return data.info();
    }

}
