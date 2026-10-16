package Problem4;

import java.lang.StringBuilder;
public class ShoppingCart {
    private Item[] cart;
    private int itemCount;
    private int capacity;
    protected double totalPrice;

    public ShoppingCart(int capacity){
        this.capacity = capacity;
        this.cart= new Item[capacity];
        this.itemCount = 0;
        this.totalPrice = 0.0;
    }
    public void increaseSize(double d){
        int newCapacity = (int) (capacity + capacity*d);

        //to ensure that the capacity increases
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
        if (itemCount==capacity) {
            increaseSize(0.5);
        }
        cart[itemCount++]=item;
        totalPrice+=item.getPrice()*item.getQuantity();
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        for (int i=0; i<itemCount; i++){s.append(cart[i].toString());}
        return s.toString();
    }
}
