package com.walleto.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import javax.persistence.Embedded;
import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection ="AccountDetails")
@Component
@Builder
public class AccountDetails {
    @Transient
    public static final String SEQUENCE_NAME="user_sequence";
    @Id
    private int accNumber;



    private int balance;
    @Embedded
    private User details;

    public AccountDetails(int accNumber, int balance, User details, List<Transaction> transactions) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.details = details;
        this.transactions = transactions;
    }
    @Builder.Default
    private List<Transaction> transactions= new ArrayList<>();

    private String isRedeemed;

    public AccountDetails() {

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

    public User getDetails() {
        return details;
    }

    public void setDetails(User details) {
        this.details = details;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public String getIsRedeemed() {
        return isRedeemed;
    }

    public void setIsRedeemed(String isRedeemed) {
        this.isRedeemed = isRedeemed;
    }
}
