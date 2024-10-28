public class SmartWatch{
	String brandName;
	String model;
	int price;
	String batteryCapacity;
	String beltType;

	public SmartWatch(){
		System.out.println("no parametre constructor");
	}


	public SmartWatch(String brandName,String model){
		this.brandName=brandName;
		this.model=model;
	
    }
    public SmartWatch(String brandName,String model,int price){

        this(brandName,model);
        this.price=price;
    }
    public SmartWatch(String brandName,String model,int price,String batteryCapacity){
        this(brandName,model,price);
        this.batteryCapacity=batteryCapacity;
    }
    public SmartWatch(String brandName,String model,int price,String batteryCapacity,String beltType){
        this(brandName,model,price,batteryCapacity);
        this.beltType=beltType;
    }

    public void printDetails(){
    	System.out.println(brandName);
    	System.out.println(model);
    	System.out.println(price);
    	System.out.println(batteryCapacity);
    	System.out.println(beltType);

    }
}