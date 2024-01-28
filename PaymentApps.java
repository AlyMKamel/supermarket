public abstract class PaymentApps {
   private String email;
   private String password;
   private int balance=0;

   public PaymentApps(String email, String password, int bal) {
      this.email=email;
      this.password=password;
      bal=balance;
      balance=0;
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
   abstract boolean isValid();
   public String pay(int amount) {
      if (isValid() && balance >= amount) {
         balance = balance - amount;
         return "Payment successful! Your balance is " + balance;
      } else {
         return " Payment failed or Card Expired ";
      }
   }
}
