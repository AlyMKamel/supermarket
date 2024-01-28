import java.util.*;
import java.lang.*;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
            ShoppingCart shop=new ShoppingCart();
            int quan=0;
            String checkoutcase;
            String checkoutmethod;
        PaymentMethod paypal1;
            Scanner scan=new Scanner(System.in);
            Item pizza=new Item("Pizza",1,40);
            Item burger=new Item("Burger",1,20);
            Item coffee=new Item("Coffee",1,5);
            Item soda=new Item("Soda",1,4);
            Item water=new Item("Water",1,2);
            Item [] items={pizza,burger,coffee,water,soda};
            System.out.println("Please, select a product: \n  " + pizza.printitem()+burger.printitem()+coffee.printitem()+soda.printitem()+water.printitem());
            Object[] options = {pizza.printitem(),
                    burger.printitem(),coffee.printitem(),water.printitem(),soda.printitem()};
            boolean checkout=false;
            while (!checkout) {
                int n = JOptionPane.showOptionDialog(null,
                        "Select Items",
                        "Product",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        options,
                        options[0]);
                Item selecteditem = items[n];
                String s = (String) JOptionPane.showInputDialog(
                        null,
                        "Enter the Quantity\n",
                        "Quantity",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        null,
                        "Quantity");
                try {
                    selecteditem.setQuantity(Integer.parseInt(s));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,
                            "Please Enter A number");
                }
                shop.add(selecteditem);
                System.out.println(shop.getTotalAmount());
                //System.out.println("Do you Want to Checkout?(Y/N)");
                Object[] yesno = {"Yes, please",
                        "Not yet",};
                int jj = JOptionPane.showOptionDialog(null,
                        "Do you Want to Checkout?",
                        "Check out",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        yesno,
                        yesno[1]);
                switch (jj) {
                    case JOptionPane.YES_OPTION:
                        checkout=true;
                        break;
                    case JOptionPane.NO_OPTION:
                        break;
                    case JOptionPane.CANCEL_OPTION:
                        break;
                    default:
                        break;
                }
                /*checkoutcase = scan.next();
                switch (checkoutcase) {
                    case "y":
                    case "Y":
                        System.out.println("Choose Your Payment Method");
                        checkout=true;
                        break;
                    case "N":
                    case "n":
                        break;
                    default:
                        System.out.println("Please Enter Y or N");
                }*/

            }
        /*checkoutmethod=scan.next();
        if (checkoutmethod.equals("PayPal"))
        {
            System.out.println("Please Enter Your PayPal account and password then your balance");
         paypal1=   new PayPal(scan.next(),scan.next(),scan.nextInt());
         System.out.println(paypal1.pay(shop.getTotalAmount()));
        }
        else if (checkoutmethod.equals("Credit"))
        {
            System.out.println("Please Enter Your Card Name,Number,CVV ,expiry date then your balance");
           CreditCard card1= new CreditCard(scan.next(),scan.next(),scan.nextInt(),new Date( scan.nextInt(),  scan.nextInt(),  scan.nextInt()),scan.nextInt());
            System.out.println(card1.pay(shop.getTotalAmount()));
        }
       else if (checkoutMethod.equals("InstaPay"))
        {
           System.out.println("Please Enter Your ImstaPay account and password then your balance");
            paypal1=   new PayPal(scan.next(),scan.next(),scan.nextInt());
            System.out.println(paypal1.pay(shop.getTotalAmount()));
        }*/
        JOptionPane.showMessageDialog(null,
                "Your Total amount="+shop.getTotalAmount());
        String checkoutMethod = JOptionPane.showInputDialog(null, "Enter your checkout method (PayPal/Credit/instaPay):");

        switch (checkoutMethod.toLowerCase()) {
            case "paypal":
                String paypalAccount = JOptionPane.showInputDialog(null, "Enter Your PayPal account:");
                String paypalPassword = JOptionPane.showInputDialog(null, "Enter Your PayPal password:");
                int paypalBalance = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Your balance:"));

                paypal1 = new PayPal(paypalAccount, paypalPassword, paypalBalance);
                JOptionPane.showMessageDialog(null, paypal1.pay(shop.getTotalAmount()));
                break;
            case "credit":
                String cardName = JOptionPane.showInputDialog(null, "Enter Your Card Name:");
                String cardNumber = JOptionPane.showInputDialog(null, "Enter Your Card Number:");
                int cvv = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Your CVV:"));
                int year = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Card Expiry Year:"));
                int month = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Card Expiry Month:"));
                int date = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Card Expiry Date:"));
                int creditBalance = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Your balance:"));

                PaymentMethod card1 = new CreditCard(cardName, cardNumber, cvv, new Date(year, month, date), creditBalance);
                JOptionPane.showMessageDialog(null, card1.pay(shop.getTotalAmount()));
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid checkout method!");
                break;

        }


    }

    }