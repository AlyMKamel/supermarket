public class InstaPay extends PaymentApps{

    private int wallet;

    InstaPay(String email, String password,int bal, int wallet){
 super(email,password,bal);
 this.wallet=wallet;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public boolean isValid() {


        if (!getEmail().matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,6}")) {
            return false;
        }


        if (!getPassword().matches("(?=.[0-9])(?=.[a-z])(?=.[A-Z])(?=.*[@#$%^&+=]).{8,}")) {
            return false;
        }

        return true;
    }

}
