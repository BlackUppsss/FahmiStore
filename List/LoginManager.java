package List;

import Node.UserNode;
import Object.User;

public class LoginManager {
    public UserNode head;     

    public String login(String email, String password){
        UserNode current = head;

        while (current != null) {
            User user = current.data;
            if(user.getEmail().equals(email) && user.getPassword().equals(password)){
                return "Login successful! Role: " + user.getRole();
            }

            current = current.next;
        }
        return "Invalid username or password.";
    }
}
