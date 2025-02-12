package day5;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class ECommerceViaHT {
    public static void main(String[] args) {
        Amazon amazon = new Amazon();
        amazon.placeOrder("12/02", "HP Pavilion");
        amazon.placeOrder("12/02", "Transcend Pendrive");
        amazon.placeOrder("9/10", "IPhone Back Cover");

        System.out.println("\n"+amazon.myOrders+"\n");

        System.out.println(amazon.myOrders.get("9/12"));;
    }
}

class Amazon{
    Map<String,List<String>> myOrders = new Hashtable<>();

    public void placeOrder(String date, String item){
        List<String> currentItem = myOrders.getOrDefault(date, new ArrayList<>());
        currentItem.add(item);
        myOrders.put(date, currentItem);
        System.out.println("Your order "+item+" has placed on "+date);
    }
}