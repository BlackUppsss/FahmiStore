package Node;

import Object.Transaction;


public class TransactionNode {
    Transaction data;
    TransactionNode next;

    TransactionNode(Transaction data){
        this.data = data;
        next = null;
    }

    public String info(){
        return data.info();
    }
}
