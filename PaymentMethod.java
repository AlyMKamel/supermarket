interface PaymentMethod 
{
     boolean isValid();
    String pay(int amount);
}