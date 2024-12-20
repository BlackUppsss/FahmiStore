package Object;

import Node.TransactionNode;

public class History{
    private int id;
    private TransactionNode transaction;

    public History(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public TransactionNode getTransaction(){
        return transaction;
    }

    public void setTransaction(TransactionNode transaction){
        this.transaction = transaction;
    }

    public String info(){
        String transactionInfo = (transaction != null) ? transaction.info() : "transaction: belum ada";
        return "History ID: " + id + " |  " + transactionInfo;
        
    }

}
