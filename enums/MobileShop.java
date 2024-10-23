public class MobileShop{
	MobileBrand brand;
	MobileShopStatus status;
	PaymentMethod paymentMethod;
	CustomerType customertype;
	DeviceCondition deviceConditon;
	OrderStatus orderStatus;
	WarrantyStatus warranty;
	EmployeeRole roleOfEmployee;
	PromotionType promotionType;
	StockStatus stockStatus;




public MobileShop(MobileBrand brand,MobileShopStatus status,PaymentMethod paymentMethod,CustomerType customertype,DeviceCondition deviceConditon,OrderStatus orderStatus,	WarrantyStatus warranty,EmployeeRole roleOfEmployee,PromotionType promotionType,StockStatus stockStatus){
	this.brand=brand;
	this.status=status;
	this.paymentMethod=paymentMethod;
	this.customertype=customertype;
	this.deviceConditon=deviceConditon;
	this.orderStatus=orderStatus;
	this.warranty=warranty;
	this.roleOfEmployee=roleOfEmployee;
	this.promotionType=promotionType;
	this.stockStatus=stockStatus;





}
public  void printDetails(){
	System.out.println(brand);
	System.out.println(status);
	System.out.println(paymentMethod);
	System.out.println(customertype);
	System.out.println(deviceConditon);
	System.out.println(orderStatus);
	System.out.println(warranty);
	System.out.println(roleOfEmployee);
	System.out.println(promotionType);
	System.out.println(stockStatus);
}
	
		
	
}