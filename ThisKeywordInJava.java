import java.util.Scanner;
//this keyword is generally used in case if constructor is in the use;
//when you use this keyword you dont have to change the name or assign name of Instance variable to new variable , we can use the same instance variable without using instance variable ;

class ThisKeyword{
    private String name;
    private int age;
    private String number;
    private String city;

    public void SetValues(String name , int age , String number , String city){
        this.age = age;  //no new variable required; with the help of this keyword
        this.city = city;
        this.name = name;
        this.number = number;
    }
    public void returnInformation() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(number);
        System.out.println(city);
    }

}

public class ThisKeywordInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();
        sc.nextLine();  //I will discuss latter about it;
        System.out.print("Enter Your Phone Number: ");
        String number = sc.nextLine();    //in dataType String for a porpose;  we can also do some changes , but for now let it be in String Data-Type
        System.out.print("Enter your City: ");
        String city = sc.nextLine();

        ThisKeyword obj  = new ThisKeyword();
        obj.SetValues(name, age, number, city);
        obj.returnInformation();


    }
}
