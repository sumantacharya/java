public class MethodSession{
	

public static void main(String[] args){
addition();
substraction();
division();
multiplication();
display();
area();
maximum();
minimum();
circleArea();
isEven();
	
}	
public static void addition(){
	int numberOne=10;
	int numberTwo=20;
	int sumOfTwoNumber=numberOne+numberTwo;
	System.out.println(sumOfTwoNumber);
}
public static void substraction(){
	int numberOne=50;
	int numberTwo=20;
	int subOfTwoNumber=numberOne-numberTwo;
	System.out.println(subOfTwoNumber);
}
public static void division(){
	int numberOne=50;
	int numberTwo=20;
	int divOfTwoNumber=numberOne/numberTwo;
	System.out.println(divOfTwoNumber);
}
 public static void multiplication(){
	int numberOne=50;
	int numberTwo=20;
	int mulOfTwoNumber=numberOne*numberTwo;
	System.out.println(mulOfTwoNumber);
}
public static void display(){
	int numberOne=500;
	int numberTwo=600;
	System.out.println(numberOne);
	System.out.println(numberTwo);
}
public static void area(){
	int length=500;
	int width=600;
	int areaOfRect=length*width;
	System.out.println(areaOfRect);
	
}

public static void maximum() {
    int sumanth=900;
    int anish=800;
   
   int max =(sumanth> anish) ? sumanth : anish;
   System.out.println(max);
 }
 public static void minimum() {
    int sumanth=900;
    int anish=800;
   
   int min =(sumanth< anish) ? sumanth : anish;
   System.out.println(min);

}
public static void circleArea() {
	double radius=6d;
    double areaOfCircle=Math.PI * radius * radius;
    System.out.println( areaOfCircle);
}
public static void isEven() {
	int number=9;
    boolean yourNo= number % 2 == 0;
    System.out.println(yourNo);
}
	}