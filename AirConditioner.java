public class AirConditioner{
	String brand;
	String model;
	int price;
	String rating;
 
 public AirConditioner(){
System.out.println("no param\n");
 }
 public AirConditioner(String brand,String model,int price,String rating){
 	this.brand=brand;
 	this.model=model;
 	this.price=price;
 	this.rating=rating;

 }
 public void printDetails(){
 	System.out.println("Brand name:"+brand);
 	System.out.println("Model name:"+model);
 	System.out.println("Price:"+price);
 	System.out.println("Rating:"+rating);
 	System.out.println("**********************");



 }



}