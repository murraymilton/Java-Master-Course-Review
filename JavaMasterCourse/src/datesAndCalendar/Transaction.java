package datesAndCalendar;

import java.util.Date;
public class Transaction {
    private String description;
    private Date date;
    private String account;
    private double amount;

    public Transaction(String description, Date date, String account, double amount){
        this.description = description;
        this.date = date;
        this.account = account;
        this.amount = amount;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    @Override
    public String toString(){
        return "Transaction{" +
                "description='" + description + '\'' +
                ", date=" +  date +
                ", account='" +  account + '\'' +
                ", amount=" + amount +
                '}';
    }
}
