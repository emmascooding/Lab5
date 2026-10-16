package Problem4;

import java.lang.StringBuilder;
public class ShoppingCart {
    private Item[] cart;
    private int itemCount;
    private int capacity;
    protected double totalPrice; // we set totalPrice as protected in order to retrieve it in the Main class that belongs to the same package

    public ShoppingCart(int capacity){
        this.capacity = capacity;
        this.cart= new Item[capacity];
        this.itemCount = 0;
        this.totalPrice = 0.0;
    }

    // method to increase the size of the cart with a certain percentage d*100
    public void increaseSize(double d){
        int newCapacity = (int) (capacity + capacity*d);

        // to ensure that the capacity increases in case if capacity is 1
        if (capacity==1){
            newCapacity = 2;
        }
        Item[] newCart = new Item[newCapacity];

        for (int i=0; i<itemCount; i++){
            newCart[i] = cart[i];
        }
        cart = newCart;
        capacity = newCapacity;
    }

    public void addToCart(Item item){
        // we check if the cart has reached maximum capacity
        if (itemCount==capacity) {
            increaseSize(0.5);
        }
        cart[itemCount++]=item;
        totalPrice+=item.getPrice()*item.getQuantity(); // we include the quantity while computing the price added to the total price
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        for (int i=0; i<itemCount; i++){s.append(cart[i].toString()).append("\n");}
        return s.toString();
    }
}
