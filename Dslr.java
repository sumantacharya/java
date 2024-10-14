public class Dslr{
	String display;
	int rom;
	int battery;
	String lense;

	public Dslr(){

		System.out.println("no parameterised constructor");
		// System.out.println("/n");
	}

//parameterized:

	public Dslr(String display ,int rom,int battery,String lense){
		this.display=display;
		this.rom=rom;
		this.battery=battery;
		this.lense=lense;
	}

	public static void  capturingImage(){

	}

	public static void adjustingSetting(){

	}

	public static void focusing(){

	}

	public static void playbackMode(){

	}

	public void printCameraDetail(){
		System.out.println("display:-"+display);
		System.out.println("Rom:-"+rom);
		System.out.println("battery:-"+battery);
		System.out.println("lense:-"+lense);
	}

}