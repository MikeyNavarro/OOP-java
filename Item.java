public class Item{

  // My member variables

  private String name;
  private double price;

  public Item(){
  }


  // My Over load Constructor with the same name as my class

  Item(String name, double price){
    // this is substituting my order object in my test orders (order1, order2, etc..)
      this.name = name;
      this.price = price;
  }
  

  // For my getter I use a public method that returns my private attributes

  public String getName(){
    return this.name;
  }

  public double getPrice(){
    return this.price;
  }


// For my setters I set the rules of what is accepted as an argument. They will return nothing.

public void setName(String name){
  this.name = name;
}

public void setPrice(double price){
  this.price = price;
}
}
