import java.util.*;

public class PayPal implements PaymentMethod
{
    private String email;
    private String password;
    private int balance=0;

    PayPal(String email, String password,int bal){
        this.email = email;
        this.password= password;
        balance=bal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
        public boolean isValid() {


        if (!email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,6}")) {
            return false;
        }


        if (!password.matches("(?=.[0-9])(?=.[a-z])(?=.[A-Z])(?=.*[@#$%^&+=]).{8,}")) {
            return false;
        }

        return true;
    }
          public String pay(int amount) {
    if ( balance >= amount) {
        balance -= amount;
        return "Payment successful! Your balance is  " + balance;
    }
    else
    {
        return "insufficient Balance ";
    }
}
}