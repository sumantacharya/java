public class MobileInfo{
	public static void main(String[] args) {
		MobileShop value=new MobileShop( MobileBrand.APPLE,MobileShopStatus.OPEN,PaymentMethod.CASH,CustomerType.NEW,DeviceCondition.REFURBISHED,OrderStatus.PROCESSED, WarrantyStatus.EXPIRED,EmployeeRole.SALESPERSON,PromotionType.DISCOUNT,StockStatus.IN_STOCK);
		value.printDetails(); 
	}
}

