package com.abhinav.models;

import com.abhinav.enums.PaymentMode;
import com.abhinav.enums.PaymentStatus;

public class Payment {
    private PaymentMode mode;
    private PaymentStatus status;
    private Long amount;

    public PaymentMode getMode() {
        return mode;
    }

    public void setMode(PaymentMode mode) {
        this.mode = mode;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
