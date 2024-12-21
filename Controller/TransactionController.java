package Controller;

import java.sql.Timestamp;
import List.TransactionManager;
import Node.GadgetNode;
import Node.UserNode;
import Object.Transaction;

public class TransactionController {
    public TransactionManager transactionManager;

    public TransactionController(){
        this.transactionManager = new TransactionManager();
    }

    public void createTransaction(int id, UserNode user, GadgetNode gadget, int stock, double price){
        Timestamp currentTime = new Timestamp(System.currentTimeMillis());
        Transaction newTransaction = new Transaction(id++, user.data, gadget.data, currentTime, Transaction.Status.diproses);

        transactionManager.insert(newTransaction);
        System.out.println("Transaction created successfully with ID: " + newTransaction.getId());
    }

    public void viewAllTransaction() {
        System.out.println("Transaction List:");
        transactionManager.printList();
    }
    
}
