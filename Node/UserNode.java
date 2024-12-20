package Node;

import Object.User;

public class UserNode {
    User data;
    UserNode next;

    UserNode(User data){
        this.data = data;
        next = null;
    }

    public String info(){
        return data.info();
    }
}