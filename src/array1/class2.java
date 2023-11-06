package array1;

public class class2 {

	public static void main(String[] args) {
		class2 toy = new class2();
		toy.hair();
		toy.hand();
		class2.doll();
		class2.all();
		toy.small();
	}
public void hair() {        //change the value
	String [] food = {"rice","pasta","noodles","curry","dal"};
	
	food[1]="beef";
	System.out.println(food[1]);
}
public void hand() {        //change the value and print everything
	String [] food = {"rice","pasta","noodles","curry","dal"};
	
	food[1]="beef";
	for(int i = 0; i<food.length; i++) {
	System.out.println(food[i]);	
		
	}
}
public static void doll() {
int [] value = {5,6,7,8,9,10,11,12};
value[7]=15;
for(int i = 0; i<value.length; i++) {
System.out.println(value[i]);	
	
}
}		
public static void all() {
double [] my = {2.5,3.5,4.5,6.5,7.5,8.5};
my[2]=5.5;
for(int i=0; i<my.length; i++) {
System.out.println(my[i]);	
}
}	
public void small() {
char [] num = {'n','m','k','l','h','r'};
num[1]='a';
for(int i = 0; i<num.length;i++) {
System.out.println(num[i]);	
}
}	
	
}
