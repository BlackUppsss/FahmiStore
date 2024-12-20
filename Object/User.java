package Object;

public class User{
    private int id;
    private String username;
    private String email;
    private String password;


    // Define Role Cak
    public enum Role{
        Admin, User
    }

    // Nambah manja
    private Role role;

    // Constructor walah
    public User(int id, String username, String email, String password, Role role){
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role; 
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public Role getRole(){
        return role;
    }

    public void setRole(Role role){
        this.role = role;
    }

    public String info(){
        return "id =" + id + ", username ='" + username + '\'' + ", email ='" + email + '\'' + ", role =" + role ; 
    }

}
