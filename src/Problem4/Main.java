package Problem4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart(30);
        Scanner scan = new Scanner(System.in);

        boolean continueShopping = true;

        do {
            System.out.println("Enter the name, price and quantity of this item:");
            String name = scan.next();
            double price = scan.nextDouble();
            int quantity = scan.nextInt();
            Item newItem = new Item(name, price, quantity);
            cart.addToCart(newItem);
            System.out.println(cart.toString());
            System.out.println("Continue shopping? (y/n)");
            char answer = scan.next().charAt(0);
            if (answer=='n'){continueShopping=false;}
        } while (continueShopping);
        System.out.println(String.format("Please Pay %.2f", cart.totalPrice)); // totalPrice is protected in ShoppingCart class
    }
}
