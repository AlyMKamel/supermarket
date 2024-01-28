public class Telda extends PaymentApps{
    private String pointsSys;

    Telda(String email, String password,int bal, String pointsSystem){
        super(email,password,bal);
        this.pointsSys= pointsSystem;
    }

    public String getPointsSystems() {
        return pointsSys;
    }

    public void setPointsSystems(String pointsSystems) {
        pointsSystems = pointsSystems;
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

