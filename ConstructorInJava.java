import java.util.*;

class Constructor{
    public String name;
    private int age;
    public String accountNumber;
    private String password;
    private String accountBalance;

    //Constructor : it is a type of member function or method that not have any return type;
    /*proprty of constructor: 
    * Constructor is always declered in public; 
    * it helps to access data of Private Data members;
    * it is almost similar like method;
    * name of the constructor should be same as class name;
    * at the time of calling , memory allocated to the objectl;
    * it gets called automatically at the time the creation of an object;
    */

   /* Syntax of constructor: 
    public Constructor() {  //name of the constructor should be same as class name ;
        //stmt
    } */

    //Types of  Constructor: 
    /*
     * 1) Parametrized;
     * 2) Non Parametrized also known as Default constructor;
     * 3) Copy Constructor;
     */
    
     /*Syntex of NonParametrized Constructor: 
      *  class Hello{
        private <DataType> variable;
        public Hello() {
        //stmt
        }
        }
      */

      /*Syntex of NonParametrized Constructor: 
      *  class Hello{
        private <DataType> variable;
        public Hello(<DataType> Variable name) {   ...passed parameter 
        //stmt
        }
        }
      */
      public Constructor(String name, int age , String accountNumber, String password , String accountBalance) {
        this.name = name;
        this.age = age;
        this.accountNumber = accountNumber;
        this.password = password;
        this.accountBalance = accountBalance;
      }
      public void getInfo() {
        System.out.println("\n"+name);
        System.out.println(age);
        System.out.println(accountNumber);
        System.out.println(password);
        System.out.println(accountBalance);
      }
}
public class ConstructorInJava {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your name: ");
      String name = sc.nextLine();
      System.out.println("Enter your age");
      int age =  sc.nextInt();
      sc.nextLine();
      System.out.println("Enter your Account number : ");
      String accountNumber =  sc.nextLine();
      System.out.println("Enter your password: ");
      String password =  sc.nextLine();
      System.out.println("Enter your Account Balance: ");
      String accountBalance = sc.nextLine();

      Constructor obj  = new Constructor(name , age, accountNumber, password, accountBalance); //if we pass parameter here and also on the class it will be parametrized constructor
      obj.getInfo();
    }

    
}