package com.walleto.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CashbackEarned {
    @Id
    private int _id;

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public int getCashback() {
        return Cashback;
    }

    public void setCashback(int cashback) {
        Cashback = cashback;
    }

    private int Cashback;

    public CashbackEarned(int accountNumber, int cashback) {
    }
}
