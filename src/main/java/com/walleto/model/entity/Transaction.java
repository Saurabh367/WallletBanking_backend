package com.walleto.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Transactions")
public class Transaction {
    public Transaction() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSendAmount() {
        return sendAmount;
    }

    public void setSendAmount(int sendAmount) {
        this.sendAmount = sendAmount;
    }

    public int getReceiveAmount() {
        return receiveAmount;
    }

    public void setReceiveAmount(int receiveAmount) {
        this.receiveAmount = receiveAmount;
    }

    public int getDeposited() {
        return deposited;
    }

    public void setDeposited(int deposited) {
        this.deposited = deposited;
    }

    public int getSenderAvailable_balance() {
        return senderAvailable_balance;
    }

    public void setSenderAvailable_balance(int senderAvailable_balance) {
        this.senderAvailable_balance = senderAvailable_balance;
    }

    public int getSenderId() {
        return senderId;
    }

    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCashback() {
        return cashback;
    }

    public void setCashback(String cashback) {
        this.cashback = cashback;
    }

    @Id
    private String id;

    private int sendAmount;
    private int receiveAmount;
    private int deposited;

    private int senderAvailable_balance;

    private int senderId;
    private int receiverId;
    private Date date;
    private String Message;
    private String status;
    private String cashback;

    public Transaction(int sendAmount, int deposited, int senderId, int receiverId, Date date, String message, String status, String cashback, int senderAvailable_balance) {
        this.sendAmount = sendAmount;
        this.senderAvailable_balance = senderAvailable_balance;
        this.deposited = deposited;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.date = date;
        this.Message = message;
        this.status = status;
        this.cashback = cashback;
    }

}
