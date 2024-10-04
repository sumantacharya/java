public class ReturnTypeExample{
	public static void main(String[] args){
      int sumOfTheNumber=addition();
      System.out.println("The returned Integer value is = " +sumOfTheNumber);
      byte getbyte = ByteValue();
      System.out.println("The returned Byte value is = " +getbyte);
      float getfloat =get_float();
      System.out.println("The returned  Float value is = " +getfloat);
      double doubleval= setDouble();
      System.out.println("The returned Double value is = " +doubleval);
      boolean checkBooleanStatus=setBoolean();
      System.out.println("The returned Boolean value is = " +checkBooleanStatus);
      short shorts =getShort();
      System.out.println("The returned Short value is = " +shorts);
      String temp=getString();
      System.out.println("The returned String value is = " +temp);
      char characters=getCharacter();
       System.out.println("The returned  Char value is = " +characters);

	}
	public static int  addition(){
        int numberOne=10;
        int numberTwo=20;
        int sum=numberOne+numberTwo;
        return sum;
	}
	public static  byte ByteValue(){
		 byte value=2;
		 return value;
	}
	public static float get_float(){
		float number=1.2f;
		return number;
	}
	public static double setDouble(){
		double doubleValue=3.141592653589793d;
		return doubleValue;
}
    public static boolean setBoolean(){
		int value=0;
		if(value==0){
			return true;
		}
		else{
			return false;
		}
		}
	public static short getShort(){
		short shortValue=3336;
		return shortValue;	

}
   public static String getString(){
		String value="sumanth";
		return value;	  
	}
	public static char getCharacter(){
		char value='k';
		return value;	
}
}