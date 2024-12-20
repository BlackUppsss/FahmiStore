package Node;

import java.sql.Timestamp;

class Transaction{
    private int id;
    private UserNode user;
    private GadgetNode gadget;
    private Timestamp tanggalTransaksi;
    
    public enum Status{
        diterima, ditolak, diproses
    }

    private Status status;

    public Transaction(int id, Timestamp tanggalTransaksi, Status status){
        this.id = id;
        this.tanggalTransaksi = tanggalTransaksi;
        this.status = status;
    }

    public int getId(){
        return id;
    }

    public Timestamp tangTimestamp(){
        return tanggalTransaksi;
    }

    public UserNode getUser(){
        return user;
    }

    public Status getStatus(){
        return status;
    }

    public void setUser(UserNode user){
        this.user = user;
    }

    public GadgetNode getGadget(){
        return gadget;
    }

    public void setGadget(GadgetNode gadget){
        this.gadget = gadget;
    }

    public String info(){
        String userInfo = (user != null) ? user.info() : "user: belum ada";
        String gadgetInfo = (gadget != null) ? gadget.info() : "gadget: belum ada";
        return "Transaction ID: " + id + " | Status: " + status + " | Date: " + tanggalTransaksi + " | " + userInfo + " | " + gadgetInfo;
    }


}

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
