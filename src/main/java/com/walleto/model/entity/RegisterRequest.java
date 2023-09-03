package com.walleto.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    public static String getSequenceName() {
        return SEQUENCE_NAME;
    }

    public static void setSequenceName(String sequenceName) {
        SEQUENCE_NAME = sequenceName;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getIsRedeemed() {
        return isRedeemed;
    }

    public void setIsRedeemed(String isRedeemed) {
        this.isRedeemed = isRedeemed;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccountDetails getAccountDetails() {
        return accountDetails;
    }

    public void setAccountDetails(AccountDetails accountDetails) {
        this.accountDetails = accountDetails;
    }

    @Transient
    public static  String SEQUENCE_NAME="user_sequence";
    @Id
    int _id;
    private String name;
    @Indexed(unique = true, direction = IndexDirection.DESCENDING)
    private String email;
    private int accNumber;
    private int balance;
    private String isRedeemed;

    private String password;
    private AccountDetails accountDetails;
    public User toUser() {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
//        user.setUserRole(User_Role.USER);
        return user;
    }
    public AccountDetails toAccountDetails() {
        AccountDetails accountDetails = new AccountDetails();
        accountDetails.setAccNumber(accNumber);
        accountDetails.setBalance(balance);
        accountDetails.setDetails(toUser());
        accountDetails.setIsRedeemed(isRedeemed);
        return accountDetails;
    }
}
