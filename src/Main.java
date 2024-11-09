import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To Age Checker");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Your age: ");
        int age=input.nextInt();
        if(age>=18){
            System.out.println("Congratulation! You Are Eligible For Vote");

        }else {
            System.out.println("Sorry! You Are Not Eligible For Vote");
        }
        System.out.println("Thank You");
    }
}