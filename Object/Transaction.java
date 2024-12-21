package Object;

import Node.GadgetNode;
import Node.UserNode;
import java.sql.Timestamp;

public class Transaction{
    public int id;
    public UserNode user;
    public GadgetNode gadget;
    public Timestamp tanggalTransaksi;
    
    public enum Status{
        diterima, ditolak, diproses
    }

    public Status status;

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
