package src.model;

import java.time.LocalDateTime;

public class Invoice {
    long id;
    String invoiceNumber;
    LocalDateTime exitTime;
    ParkingTicket parkingTicket;
    double amount;
    Payment payment;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getInvoiceNumber() {
        return invoiceNumber;
    }
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }
    public LocalDateTime getExitTime() {
        return exitTime;
    }
    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }
    public ParkingTicket getParkingTicket() {
        return parkingTicket;
    }
    public void setParkingTicket(ParkingTicket parkingTicket) {
        this.parkingTicket = parkingTicket;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public Payment getPayment() {
        return payment;
    }
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
