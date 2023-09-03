package com.walleto.model.controller;

import lombok.Data;

@Data
public class BalanceResponse {
    public int getAvailableBalance() {
        return AvailableBalance;
    }

    public void setAvailableBalance(int availableBalance) {
        AvailableBalance = availableBalance;
    }

    private int AvailableBalance;


}