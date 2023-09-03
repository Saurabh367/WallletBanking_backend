package com.walleto.model.controller;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
public class SendMoneyResponse {
    @Id
    private String transaction_id;

    private int sendAmount;



    private int senderAvailable_balance;

    private int senderId;
    private int receiverId;
    private Date date;
    private String Message;
    private String status;
    private String cashback;

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public int getSendAmount() {
        return sendAmount;
    }

    public void setSendAmount(int sendAmount) {
        this.sendAmount = sendAmount;
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
}
