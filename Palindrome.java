import java.util.Scanner;
public class Palin{  
 
public static void main(String[] args) {
 
Scanner O = new Scanner(System.in);
string str = O.nextLine();
String revstring="";
 
for(int i=str.length()-1;i>=0;--i){
revstring +=str.charAt(i);
}
 
System.out.println(revstring);
 
if(revstring.equalsIgnoreCase(str)){
System.out.println("The string is Palindrome");
}
else{
System.out.println("Not Palindrome");
}
 
}
