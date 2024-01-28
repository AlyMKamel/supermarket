import java.util.*;
public class CreditCard  implements PaymentMethod{

    private String cardHolderName;
    private String cardNumber;
    private int cvv;
    private Date expiryDate;
    private int balance=0;

    public CreditCard(String cardHolderName, String cardNumber, int cvv, Date expiryDate,int bal) {
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
        balance=bal;

    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }


    public boolean isValid() {

        Date currentDate = new Date();
        return expiryDate.after(currentDate);
    }

    public String pay(int amount) {
        if (isValid() && balance >= amount) {
            balance = balance - amount;
            return "Payment successful! Your balance is " + balance;
        } else {
            return " Payment failed or Card Expired ";
        }
    }

}