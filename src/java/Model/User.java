package model;
/**
 *
 * @author Casper
 */
public class User {
    private String userName, password,firstName,lastName;
    public boolean valid;

    public User(){
        
    }

    public User(String userName, String password) {
        this.userName = userName; 
        this.password = password;
     
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
       
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
    
    public void add(String username, String password) {
    String user = username +"-"+ password;
    }
}
