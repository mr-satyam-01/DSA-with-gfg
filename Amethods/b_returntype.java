package Amethods;

public class b_returntype {

public static int phone(){
    System.out.println("iphone");
    System.out.println("samsung");
    return 5;
}
    public static void main(String[] args) {
        phone();                                      //here we used method to just print the value or operation inside it by calling
        System.out.println(4+phone());               // here we used method for above things and also a variable whose value is 5 by using
                                                    // return type and printing it
    } 
}



//calling method: only operation and value
//printing method: operation, value and return value