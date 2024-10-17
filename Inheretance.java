import java.util.*;

//Inheretance :  it is a concept in OOPs that deals with sharing property of Parent Class to child class
//Inheretance is Just Like "Nepotism" like Parent give their fame to their child;
/*
 * With the help of Inheretance Child class can acces property of their parents class
 * Inheretance is helpfull for code reusabilty
 * Component involved in Inheretance: 
 * 1} General Terms to remember: 
 *     i) parents class / base class / super class;
 *     ii) Child class / derived class
 * 2} we can inherit property of the parent class by using "extends" keyword in child class ;
 * 
 * Types of Inheretance: 
 * 1> Single Inheretance
 * 2> Multi-level Inheretance
 * 3> Multiple Inheretance #not supported in java but in other languages like c++ multiple inhertance is there
 * 
 * In this whole process of Learning Inheretance we will built our own Calculator;
 * So, lets Start....
 * 1> Single Inheretance :
 *  => one parent class and one base class is there
 *   for example: you have some property like your father may be you have eyes like your father 
 *                so , in single inheretance one parent class inherit its property to the base class;
 * **Syntex:
 * 
 * class Father{
 *   //statement(mathods)
 * }
 * class Child extends Father{
 *   //statement
 * }
 * 
 * 2> Multilevel Inheretance : 
 *  => it have two class Parents  ex. i> Grandfather ii> Father
 *     and also it have one base class ex. its you
 * ex: your GrandFather's property like your grandfather is good at CSE and also your father is good at CSE , because GrandFATHER inherit his property in your father
 *     like wise ,  you are also good at CS it means your father have inherit his property to you that he got from your Grandfather;
 * **Syntex: 
 *class GrandFather{
 *   //statement(mathods)
 * }
 * class Father extends GrandFather{
 *   //statement
 * }
 * class Child extends Father{
 * //statement
 * .....in this child class is indirectly use the porpert of the GrandFather;
 * }
 */
//Single Inheretance : 
//Making a Calculator: 


class Calc{
    public int sum(int num1 , int num2) {
        return num1+num2;
    }
    public int substract(int num1 , int num2) {
        return num1-num2;
    }
} 
//now I want to add some more features like multipy and division but also  in that class I want to inherit the property of Calc class, we use the concept of inheretance 
//it provide reusablity ;
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
public class Inheretance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();

        AdvCalc obj = new AdvCalc();
        int result1 = obj.sum(num1,num2);
        int result2 = obj.substract(num1,num2);
        int result3 = obj.multi(num1,num2);
        double result4 = obj.divi(num1,num2);

        System.out.println("\nSum: "+result1 + "\nSubstraction: " + result2 + "\nMultiplication:  " + result3 + "\nDivision: "+ result4);

        

    }  
}