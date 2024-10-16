import java.util.*;
//Encapsulation means:  wrapping up of data member and mumber function in the same class;
class Capsule{
    public int num1; //data members 
    public int num2;//data members 

    public int getSum(int num1 ,  int num2) //memberFunction (Methods)
    {
        return num1 + num2;
    }
}
public class Encapsulation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1  = sc.nextInt();

        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();

        Capsule obj = new Capsule();

        int result = obj.getSum(num1 , num2 );
        System.out.println("Your sum is : " + result);
    }

    
}