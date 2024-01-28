import java.util.*;

public class ShoppingCart {

   int count;
    private Item[] orderItems;


    ShoppingCart()
    {
     orderItems = new Item[10];
    count=0;
    }


    public void add(Item item){

        if(count<10){
            orderItems[count]= item;
            count++;
            }
    }

 public void remove(Item item){
     for(int i= 0; i< count; i++){
         if(orderItems[i].equals(item)){
             for(int j= i; j< count-1 ; j++){
                 orderItems[j]= orderItems[j+1];
             }
             orderItems[count - 1]= null;
             count--;
             break;
             }
         }
     }
 
   public int getTotalAmount() {
        int total = 0;
        for (int i = 0; i < count; i++) {
            if (orderItems[i] != null) {
                total += orderItems[i].getPrice();
            }
        }
        return total;
    }
    public String checkout(PaymentMethod paymentMethod) {
        int amount = getTotalAmount();
        return paymentMethod.pay(amount);
    }
}


