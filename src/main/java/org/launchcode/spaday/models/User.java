package org.launchcode.spaday.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {

    @NotBlank(message= "This is a required field.")
    @Size(min=5, max=15, message="Must be between 5 and 15 characters.")
    private String username;

    @Email(message= "Not a valid Email.")
    private String email;

    @Size(min=6)
    @NotBlank(message="This is a required field.")
    @NotNull(message="Please enter a password.")
    private String password;

    @Size(min=6)
    @NotBlank(message="This is a required field.")
    @NotNull(message="Please verify password.")
    private String verify;


    public User() {}

    public User(String username, String email, String password, String verify) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.verify = verify;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }
}
