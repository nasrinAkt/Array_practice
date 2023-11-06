package array1;

public class class3 {

	public static void main(String[] args) {
		class3 key = new class3();
		key.king();
		key.queen();
		class3.prince();
		class3.sis();
	}
public void king() {//length of the array
String [] vehicle ={"car","bike","cycle","taxi","plane","van","truck","ambulance","u-haul","train"};
/*int a = vehicle.length;
System.out.println(a);*/
System.out.println(vehicle.length);
}
public void queen() {
int [] bike = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
System.out.println(bike.length);
}	
public static void prince() {
double [] kite = {1.5,2.5,3.5,4.5,5.5,6.5,7.5};
System.out.println(kite.length);
}
public static void sis() {
char [] light = {'a','b','c','d','e','f','h'};	
System.out.println(light.length);
}



}
