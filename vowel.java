//write a program to chek vowel or consonent






import java.util.Scanner;
class vowel{
public static void main(String args[]){
Scanner s = new Scanner(System.in);

System.out.println("enter a charecter: ");
char c = s.next().charAt(0);
if(c=='A' || c=='a')
{
System.out.println(c +" This is a Vowel");
}
else if(c=='E' || c=='e')
{
System.out.println(c +" This is a Vowel");
}
else if(c=='I' || c=='i')
{
System.out.println(c +" This is a Vowel");
}
else if(c=='O' || c=='o')
{
System.out.println(c +"   This is a Vowel");
}
else if(c=='U' || c=='u')
{
System.out.println(c +" This is a Vowel");
}
else{System.out.println(c+ " this is consonent..!!");
}
}
}