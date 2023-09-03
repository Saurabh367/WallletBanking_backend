package com.walleto.model.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class DepositRequest {
    public DepositRequest(int accountNo, int amount) {
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Id
    private int accountNo;
    private int amount;

}

