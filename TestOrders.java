import java.util.ArrayList;

public class TestOrders {
  public static void main(String[] arg){

    // Create a new item and assign its values
    
    Item item1 = new Item("Moca",3.50);
    Item item2 = new Item("Drip Coffee",4.50);
    Item item3 = new Item("latte",2.99);
    Item item4 = new Item("capuccino", 3.99);

    // Making a new Array List that will pass the data back to my Order Class

    ArrayList<Item> items = new ArrayList<Item>();

    items.add(item1);
    items.add(item2);
    items.add(item3);
    items.add(item4);

    // orders no name
  
    Order order1 = new Order();
    Order order2 = new Order();

    //  orders name

    Order order3 = new Order("Anna");
    Order order4 = new Order("Emily");
    Order order5 = new Order("Coco");

    // Add items to order 
    order3.addItem(item2);
    order4.addItem(item4);

    System.out.println(order1.get_status_message());
    
    order2.getReady();
    System.out.println(order2.get_status_message());
  }
    
}
