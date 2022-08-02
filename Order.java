import java.util.ArrayList;

public class Order{
  // member variables 
  private String name;
  private boolean ready;
  private ArrayList<Item> items = new ArrayList<Item>();

   // Constructor that takes no arguments and sets name to "Guest" and initalizes and empty list

    
  // I am passing my item class into my Order class and my array is named list

  public Order(){
    this.name = "Guest";
    this.ready = false;
  }

  // Overloaded Constructor takes name and sets items to an empty list

  public Order(String name){
    this.name = name;
    this.ready = false;
  }

// Getters 

public String get_status_message(){
  if(ready == true){
    return "Your order is ready";
  }
  else{
    return "Your order will be out soon!";
  }
}

// Getter for Total

  public double get_Total(){
    double total = 0.0;
    for(Item i: items){
      total += i.getPrice();
    }
    return total;
  }

  // Getter for Ready
  public boolean getReady(){
    return this.ready;
  }

  // Getter for name

  public String getName(){
    return this.name;
  }

  // Getter for items
  public ArrayList<Item>getItems(){
    return items;
  }

  public void addItem(Item item){
    this.items.add(item);
  }

  // Setters 

  // Setter for items 

  public void setItem(ArrayList<Item> items){
    this.items = items;
  }

  // setter for ready

  public void setReady(boolean ready){
    this.ready = ready;
  }

  // setter for name
  
  public void setname(String name){
    this.name = name;
  }

  public void Customer_reciept(){
    System.out.println("Customer Name" + this.name);
    for(Item i: this.items){
      System.out.println(i.getName() + i.getPrice());
    }
    System.out.println("Customer Total" + get_Total());
  }

}

