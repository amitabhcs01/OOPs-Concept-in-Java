import java.util.*;

class DefaultConstructor{
    private String name;
    private int age;
    private String phoneNumber;

    public DefaultConstructor() {  //no parameter passed in the constructor 
        String n = name;
        int a = age;
        String p = phoneNumber;
    }
    public void getFunct(String n , int a, String p) {
        System.out.println("\nName: "+n);
        System.out.println("Age: " + a);
        System.out.println("Phone number: " +  p);
    }

}
public class NonParametrizedConstructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter your Phone number: ");
        String phoneNumber = sc.nextLine();

        DefaultConstructor obj  = new DefaultConstructor();
        obj.getFunct(name, age, phoneNumber);
    }

    
}