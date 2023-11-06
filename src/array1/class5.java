package array1;

public class class5 {

	public static void main(String[] args) {
		class5 you = new class5();
		you.pink();
		you.pink1();
		you.yellow();
		you.purple();
	}
public void pink() {//print selected value//odd
String [] game = {"cricket","football","lodo","chase","kabadi","carrom"};//for odd give odd index value 
for(int i = 1; i<=game.length;i=i+2) {                                    //last index num odd
System.out.println(game[i]);	
	
}	
	
}
public void pink1() {//print selected value//even , last index num should be even
String [] game = {"cricket","football","lodo","chase","kabadi","carrom","basket ball"};
for(int i = 0; i<=game.length;i=i+2) {
System.out.println(game[i]);	
	
}	
	
}	
public void yellow() {//odd
int [] sum = {20,10,30,40,50,60,80,40};	//last index num odd
for(int i = 3; i<=sum.length;i= i+2) {
System.out.println(sum[i]);	
	
	
}
}	
public void purple() {//even number
double [] minimum = {1.99,2.99,3.99};//last index num even
for(int i = 0; i<=minimum.length; i= i+2) {
System.out.println(minimum[i]);	
	
}
}	
	
}
