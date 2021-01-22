/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuandm.dtos;

/**
 *
 * @author ASUS
 */
public class UserDTO {
    private String userID;
    private String fullname;
    private String password;
    private String address;
    private String email;
    private String phone;
    private String role;

    public UserDTO() {
    }

    public UserDTO(String userID, String fullname, String password, String address, String email, String phone, String role) {
        this.userID = userID;
        this.fullname = fullname;
        this.password = password;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.role = role;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserDTO{" + "userID=" + userID + ", fullname=" + fullname + ", password=" + password + ", address=" + address + ", email=" + email + ", phone=" + phone + ", role=" + role + '}';
    }
    
    
}
