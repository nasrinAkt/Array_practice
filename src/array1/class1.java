package array1;

public class class1 {

	public static void main(String[] args) {
		class1 happy = new class1();
		happy.tom();
		happy.cash();
		class1.spoon();
		class1.glass();

	}
public void tom() {
String [] fruits = {"amla","kwi","apple","orange","banana","mango"};
/*System.out.println(fruits[1]);  //print single value//
System.out.println(fruits[3]);    //print single value//
System.out.println(fruits[5]);*/  //print single value//
for(int i = 0; i<fruits.length;i++) {  //printing all the value using loop
System.out.println(fruits[i]);	
	
	
}

}
public void cash() {                                   // to print odd//
int [] money = {200,300,400,500,600,700,800,900};  //last index number should be odd here//
/*System.out.println(money[6]);  //print single value//
System.out.println(money[3]);*/  //print single value//
for(int i = 1; i<=money.length;i= i+2) {  //print odd number using loop//
System.out.println(money[i]);	
	
}
}	
public static void spoon() {                                       //to print even number last//
double [] car = {2.99,3.99,4.99,5.99,6.99,7.99,8.99,9.99,10.99};//index number should be even here//
/*System.out.println(car[7]);  //print single value//
System.out.println(car[5]);*/  //print single value//
for(int i = 2; i<=car.length;i=i+2) {
System.out.println(car[i]);	
	
}
}	
public static void glass() {
char [] food = {'a','b','c','d','e','f','g','h'};
//System.out.println(food[0]);
//System.out.println(food[7]);
for(int i =0; i<food.length; i++) {
System.out.println(food[i]);	
	
}
}	
	
}
