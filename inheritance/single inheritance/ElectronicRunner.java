public class ElectronicRunner{
	public static void main(String[] args) {
		Mobile device=new Mobile();
		device.electronicName="phone";
		device.type="device";
		device.price=15000;
		device.batteryCapacity="3000mh";
		device.model="samsangs24";
		device.warranty="2year";

		device.printDetails();

		
	}
}