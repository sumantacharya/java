public class AcInfo{
	static AirConditioner[] conditionerData =new AirConditioner[5];
	public static void main(String[] args){
		AirConditioner conditioner=new AirConditioner("Samsang","AD",80000,"3STAR");
		AirConditioner conditioner1=new AirConditioner("Onix","HY",90000,"4STAR");
		AirConditioner conditioner2=new AirConditioner("IMAX","58FH",50000,"4STAR");
		AirConditioner conditioner3=new AirConditioner("Aircool","NEW",60000,"3STAR");
		AirConditioner conditioner4=new AirConditioner("Onida","56",100000,"5STAR");
		savedata(conditioner);
		savedata(conditioner1);
		savedata(conditioner2);
		savedata(conditioner3);
		savedata(conditioner4);

       AirConditioner finding= findMyName("Samsang");
       AirConditioner finding2=findMyName("Onix");
       System.out.println("*************************");
       finding.printDetails();
       finding2.printDetails();

       System.out.println("*****for updating *******");
       update("Samsang",9000);

        System.out.println("*****for deleting\n *******");
        	System.out.println("-------befor deleting-----\n");
        
        for(int i=0;i<conditionerData.length;i++){
		 	if(conditionerData[i]!=null){
		 		
			conditionerData[i].printDetails();
			}
		}

		delete("Samsang");
			System.out.println("after delete");
		
			for(int i=0;i<conditionerData.length;i++){
		 		if(conditionerData[i]!=null){
		 			
					conditionerData[i].printDetails();
				}
			

		}
		boolean result=delete("hdjhsuhd");
			if(result==true){
				for(int i=0;i<conditionerData.length;i++){
		 			if(conditionerData[i]!=null){
		 			
					conditionerData[i].printDetails();

					}

				}
		
			}
			else{
				System.out.println("no changes in array");
			}
		





		// for(int i=0;i<conditionerData.length;i++){
		// 	if(conditionerData[i]!=null){
		// 		conditionerData[i].printDetails();
				
	}
	public static boolean savedata(AirConditioner conditioner){
		for( int i=0;i<conditionerData.length;i++){
			if(conditionerData[i]==null){
				conditionerData[i] = conditioner;
				System.out.println("Saved ");
				return true;

			}
		}
		System.out.println("not saved");
		return false;

	}
	public static AirConditioner findMyName(String brandName){
		for(int i=0;i<conditionerData.length;i++){
			if(conditionerData[i]!=null){
				if(conditionerData[i].brand.equals(brandName)){
					System.out.println("brand name is found");
				return conditionerData[i];
				}
				
			}
		
		}
		System.out.println("not found");
		return null;
	}
	public static boolean update(String brandName,int price){
		for(int i=0;i<conditionerData.length;i++){
			if(conditionerData[i]!=null){
				if(conditionerData[i].brand.equals(brandName)){
					System.out.println("updating before");
					conditionerData[i].printDetails();
					System.out.println("updating after");
					conditionerData[i].price=price;
					conditionerData[i].printDetails();
					return true;

				}

			}
		}
		System.out.println("brand name not found");
		return false;
	}

	public static boolean delete(String brandName){
		for(int i=0;i<conditionerData.length;i++){
			if(conditionerData[i]!=null){
				if(conditionerData[i].brand.equals(brandName)){
					conditionerData[i]=null;
					System.out.println("data deleted");
					return true;
				}
			}
		
		}
		System.out.println("brandName not found");
		return false;
	}
}




	