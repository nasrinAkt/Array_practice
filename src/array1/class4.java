package array1;

public class class4 {

	public static void main(String[] args) {
		class4 nice = new class4();
		nice.king();
		nice.king1();
		class4.hair();
		class4.hand();
		class4.man();
	}
public void king() {//print all the value using loop
String [] vehicle ={"car","bike","cycle","taxi","plane","van","truck","ambulance","u-haul","train"};
	for(int i = 0; i<vehicle.length;i++) {
	System.out.println(vehicle[i]);	
		
	}
}
public void king1() {
String [] pickup ={"car","bike","cycle","taxi","plane","van","truck","ambulance","u-haul","train"};
	for(int i = 2; i<pickup.length;i++) {
	System.out.println(pickup[i]);	
		
}	
	
}	
public static void hair() {
int [] red = {45,55,65,75,85,95,12,13,15,14,18};
for(int i = 0; i<red.length;i++) {	
System.out.println(red[i]);	
	
}
}
public static void hand() {
double [] black = {2.5,3.5,8.5,9.5,9.99,10.5,11.5};
for(int i = 1;i<black.length; i++) {
System.out.println(black[i]);	
	
}
}
public static void man() {
char [] white = {'n','m','j','k','l','u'};
for(int i = 0; i<white.length;i++) {
	
System.out.println(white[i]);	
	
}
	
	
}

}
