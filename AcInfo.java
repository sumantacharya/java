public class AcInfo{
	static AirConditioner[] conditionerData=new AirConditioner[8];
	public static void main(String[] args){


		 AirConditioner conditioner=new AirConditioner("samsang","101",12000,"5star");
		 AirConditioner conditioner1=new AirConditioner("onida","1U1",50000,"3star");
		 AirConditioner conditioner2=new AirConditioner("lg","11J",60000,"3star");
         AirConditioner conditioner3=new AirConditioner("whorpol","1YT",90000,"3star");
         AirConditioner conditioner4=new AirConditioner("aircel","1HD",80000,"3star");
         AirConditioner conditioner5=new AirConditioner("nokia","1D",70000,"3star");
         AirConditioner conditioner6=new AirConditioner("apple","1GT",70000,"3star");
         AirConditioner conditioner7=new AirConditioner("sumath","1FE",80000,"5star");

		 
		 saveData(conditioner);
		 saveData(conditioner1);
		 saveData(conditioner2);
		 saveData(conditioner3);
		 saveData(conditioner4);
		 saveData(conditioner5);
		 saveData(conditioner6);
		 saveData(conditioner7);

		 for(int i=0;i<conditionerData.length;i++){
			if(conditionerData[i]!=null){
				conditionerData[i].printDetails();
			}
		}

	}

	public static void saveData(AirConditioner conditioner){
		for(int i=0;i<conditionerData.length;i++){
			if (conditionerData[i]==null){
				conditionerData[i]=conditioner;
				return;
			}
		}
		System.out.println("array is full");
	}
}