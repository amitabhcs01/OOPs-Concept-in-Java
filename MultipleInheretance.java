class GrandParents{
    //property;
}

class Father{
    //property;
}

class Child extends Father extends GrandParents {   //not allowed to use double extends, we are not allowed to do this ;
    //Not allowed
}

//also We use like: 
//one more Example: 
class Child extends Father,GrandParents {   //not allowed to use comma(,)  , we are not allowed to do this ;
    //Not allowed
}

//for that reason java not support Multiple Inheretance;
//we cant use two classes propert;


public class MultipleInheretance {
    public static void main(String args[])
    {
            //statement;
    }

}
