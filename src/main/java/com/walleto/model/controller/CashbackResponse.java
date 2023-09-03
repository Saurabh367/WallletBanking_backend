package com.walleto.model.controller;

import lombok.Data;

@Data
public class CashbackResponse {
    public int getTotal_Cashback_Earned() {
        return total_Cashback_Earned;
    }

    public void setTotal_Cashback_Earned(int total_Cashback_Earned) {
        this.total_Cashback_Earned = total_Cashback_Earned;
    }

    int total_Cashback_Earned;
}
