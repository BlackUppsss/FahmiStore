public class User {
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

    public setId(){
        this.id = id;
    }

    public String getUsername(){
        return username;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }





}