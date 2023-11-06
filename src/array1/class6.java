package array1;

public class class6 {

	public static void main(String[] args) {
		class6 women = new class6();
		women.happy();
		women.page();
		women.color();
		women.king();
		women.queen();
		
	}
public void happy() {  //decrement
String utensils [] = new String [6];
utensils [0] = "cup";
utensils [1] = "glass";
utensils [2] = "plate";
utensils [3] = "spoon";
utensils [4] = "fork";
utensils [5] = "pan";
for(int i =5; i>=0; i--) {
System.out.println(utensils[i]);	
		
}	
}
public void page() {
int tissue [] = new int [8];
tissue [0] = 200;
tissue [1] = 300;
tissue [2] = 400;
tissue [3] = 500;
tissue [4] = 600;
tissue [5] = 700;
tissue [6] = 800;
tissue [7] = 900;
for(int i = 7; i>=1; i--) {
System.out.println(tissue [i]);	
	
	
}
	
}	
public void color() {
double bird [] = new double[6];
bird [0] =12.99;
bird [1] =13.99;
bird [2] =14.99;
bird [3] =15.99;
bird [4] =16.99;
bird [5] =17.99;

for(int i =5;i>=0;i--) {
System.out.println(bird[i]);	
	
}

}	
public void king() {      //odd number decrement//
String key [] = new String[8];
key [0] ="black";
key [1] ="red";
key [2] ="white";
key [3] ="pink";
key [4] ="purple";
key [5] ="yellow";
key [6] ="dark";
key [7] ="gray";
for(int i = 7; i>=0; i= i-2) {
System.out.println(key[i]);	
	
}	
}	
public void queen() {
int num [] = new int[11];
num [0] =100;
num [1] =200;
num [2] =300;
num [3] =400;
num [4] =500;
num [5] =600;
num [6] =700;
num [7] =800;
num [8] =900;
num [9] =1000;
num [10] =1100;
for(int i = 10; i>=0; i= i-2) {
System.out.println(num[i]);	
	
	
}


}	
	
}
