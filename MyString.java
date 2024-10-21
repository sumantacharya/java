public class MyString{
	public static void main(String[] args){
       String bike="honda";// string pool
       String bikes=new String("honda");//instance memory address will be checked
       String airplane = new String("boeing");
       String train = new String("amtrak");
       String boat = new String("yacht");
       String motorcycle = new String("kawasaki");
       String skateboard = new String("element");
       String hoverboard = new String("razor");
       String unicycle = new String("bc");
       String tricycle = new String("schwinn");
       String moped = new String("honda");
       String segway = new String("ninebot");
       String bike2 = "yamaha";
       String bike3 = "suzuki";
       String bike4 = "kawasaki";
       String bike5 = "ducati";
       String bike6 = "bmw";
       String bike7 = "harley-davidson";
       String bike8 = "ktm";
       String bike9 = "triumph";
       String bike10 = "victory";
       System.out.println(bike==bikes);

        System.out.println(bike.equals(bikes));

        char[] myChar=bike.toCharArray();
        String value="";
        for(int i=myChar.length-1;i>=0;i--){

        	
        	
        	value=value+myChar[i];
        }
          System.out.println(value);

	}

}