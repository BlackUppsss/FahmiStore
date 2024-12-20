package Node;

class History{
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
