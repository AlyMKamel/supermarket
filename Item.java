public class Item {
     private String Itemname;
    private int quantity=1;
    private double price;

    public Item(String Itemname, int quantity, double price) {
        this.Itemname = Itemname;
        this.quantity = quantity;
        this.price = price;
    }

    public String getItemName() {
        return Itemname;
    }
    public void setItemName(String Itemname) {
        this.Itemname = Itemname;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity= quantity;
    }

    public double getPrice() {
        return price*quantity;
    }
    public void setPrice(double price) {
        this.price= price;
    }
    public String printitem(){return ""+Itemname+ ", $" +price+"\n";}

}