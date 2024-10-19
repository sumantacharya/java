public class ArrayValue{
public static void main(String[] args){
int[] numberArray={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
System.out.println("******left to right*****\n");
leftToRight(numberArray);
System.out.println("******right to left*****\n");
rightToLeft(numberArray);
System.out.println("******middle to left*****\n");
middleToLeft(numberArray);
System.out.println("******skipping*****\n");
skipping(numberArray);

}


public static void leftToRight(int[] numberArray){

for(int i=0;i<numberArray.length;i++){
System.out.println(numberArray[i]);
}
}

public static void rightToLeft(int[] numberArray){
for(int i=numberArray.length-1;i>=0;i--){
System.out.println(numberArray[i]);
}
}
public static void middleToLeft(int[] numberArray){
for(int i=10;i>=0;i--){
System.out.println(numberArray[i]);
}
}
public static void skipping(int[] numberArray){
for(int i=0;i<numberArray.length;i+=2){
System.out.println(numberArray[i]);
}
}

}