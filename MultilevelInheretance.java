import java.util.*;
//Method1>>
//if we have class file somewhre in the folder we can directly use it :
//like, when i run program of Inheretance.java it created two more class file 1) Calc.class , AdvCalc.class we can directly use it in our code 


//remove Comments and use and also remove the next Part making full class too: 
// I will directly write :
// class VeryAdvCalc extends AdvCalc{       //Like AdvCalc have property of Clac class ... By this VeryAdvCalc is using property of Calc Class;
//         //real code Reusuablity: 
//     public int pow(int num1 , int num2) {
//         return ((int) Math.pow(num1 , num2));
//     }
    
// }


//remove this when you use the above :-
class Calc{
    public int sum(int num1 , int num2) {
        return num1+num2;
    }
    public int substract(int num1 , int num2) {
        return num1-num2;
    }
} 

class AdvCalc extends Calc{
    public int multi(int num1 , int num2) {
        return num1*num2;
    }
    public double divi(int num1 , int num2) {
        if(num2 > 0) {
            return num1/num2;
        } else{
            return 0;
        }
    }
}
class VeryAdvCalc extends AdvCalc{       //Like AdvCalc have property of Clac class ... By this VeryAdvCalc is using property of Calc Class;
 
    public int pow(int num1 , int num2) {
        return ((int) Math.pow(num1 , num2));
    }
    
}

public class MultilevelInheretance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();

        VeryAdvCalc obj = new VeryAdvCalc();
        int result1 = obj.sum(num1,num2);
        int result2 = obj.substract(num1,num2);
        int result3 = obj.multi(num1,num2);
        double result4 = obj.divi(num1,num2);
        int result5 = obj.pow(num1,num2);

        System.out.println("\nSum: "+result1 + "\nSubstraction: " + result2 + "\nMultiplication:  " + result3 + "\nDivision: "+ result4 + "\nExponent: " + result5);
        
    }
    
}
