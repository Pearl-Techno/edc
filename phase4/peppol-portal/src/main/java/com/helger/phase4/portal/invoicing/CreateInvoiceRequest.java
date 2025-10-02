package com.helger.phase4.portal.invoicing;

public class CreateInvoiceRequest {

    private String number;

    private Double amount;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
