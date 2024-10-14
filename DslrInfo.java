public class DslrInfo{
	public static void main(String[] args){
		Dslr dslr = new Dslr("lcd_display",8,800,"60d");
	    Dslr dslr1=new Dslr("Qled",4,800,"70d");
		Dslr dslr2=new Dslr("lcd",2,900,"80d");
		Dslr dslr3=new Dslr("led",4,1000,"80d");
		Dslr dslr4=new Dslr("touch",8,1200,"700d");
		Dslr dslr5=new Dslr("qled",3,562,"1300d");
		Dslr dslr6=new Dslr("Qled",5,800,"750d");

		dslr.printCameraDetail();
		dslr1.printCameraDetail();
        dslr2.printCameraDetail();
        dslr3.printCameraDetail();
        dslr4.printCameraDetail();
        dslr5.printCameraDetail();
        dslr6.printCameraDetail();

        Dslr dslr7 = new Dslr();
	    Dslr dslr8=new Dslr();
		Dslr dslr9=new Dslr();
		

		// dslr7.printCameraDetail();
		// dslr8.printCameraDetail();
        // dslr9.printCameraDetail();
        



	}
}