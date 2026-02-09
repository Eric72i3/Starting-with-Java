import java.util.Scanner;


public class MyClass {
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Geben Sie die Steigung m der linearen Funktion ein:");
    float m = sc.nextFloat();  
    System.out.println("Geben Sie die den y-Achesenabschnitt b der linearen Funktion ein:5");
    float b = sc.nextFloat();
    float x = -b / m; 
    System.out.println("Die Nullstelle der linearen Funktion ist: " + x);
  }
}