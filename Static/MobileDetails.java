public class MobileDetails{
	BrandName brandName;
	int price;
	String operatingSystem;
	static int totalMobiles;
	static String manufacturerName;
	static String manufacturerCountry;

	static{
		manufacturerName="techCrop";
		totalMobiles=10;
		manufacturerCountry="india";

	}
	
	public MobileDetails(BrandName brandName,int price,String operatingSystem){
		this.brandName=brandName;
		this.price=price;
		this.operatingSystem=operatingSystem;
	}
	public void printDetails(){
      	System.out.println(brandName);
      	System.out.println(price);
      	System.out.println(operatingSystem);
      	System.out.println(totalMobiles);
      	System.out.println(manufacturerName);
      	System.out.println(manufacturerCountry);
      	

      }
}