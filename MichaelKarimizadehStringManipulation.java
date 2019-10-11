import java.util.Scanner;

public class MichaelKarimizadehStringManipulation{
  public static void main(String[] args){
    //Exercise 1
    /*
    String input1;
    String input2;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a string: ");
    input1=sc.nextLine();
    System.out.print("Enter a character: ");
    input2=sc.nextLine();
    input1=input1.replaceAll("[^ ]", input2);
    System.out.print("Hidden Password: "+input1);
    */
    
    //Exercise 2
    /*
    String input;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a string: ");
    input=sc.nextLine();
    input=input.toUpperCase();
    System.out.print("Uppercase equivalent: "+input);
    */
    
    //Exercise 3
    /*
    String first;
    String last;
    String joined;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter firstname: ");
    first=sc.nextLine();
    System.out.print("Enter lastname: ");
    last=sc.nextLine();
    joined= last.concat(", "+first.charAt(0)+".");
    System.out.print("The new name is: "+joined); 
    */
    
    //Exercise 4
    //MANY QUESTIONS
    
    String input;
    String encryp;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a line to be encrypted: ");
    input=sc.nextLine();
    encryp=input.replace(input.charAt(0), input.charAt(input.length()));
    System.out.print("The encryption is: "+input);
    
  }
}