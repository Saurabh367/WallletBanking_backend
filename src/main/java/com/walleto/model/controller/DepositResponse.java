package com.walleto.model.controller;

import lombok.Data;

@Data
public class DepositResponse {
    private int Deposited_Amount;

    public int getDeposited_Amount() {
        return Deposited_Amount;
    }

    public void setDeposited_Amount(int deposited_Amount) {
        Deposited_Amount = deposited_Amount;
    }

    public int getAvailable_Balance() {
        return Available_Balance;
    }

    public void setAvailable_Balance(int available_Balance) {
        Available_Balance = available_Balance;
    }

    private  int Available_Balance;


}
