package Amethods;

public class a_syntax {

public static void hello() {
    System.out.println("Hey there");
    thank();
}
public static void thank() {
    System.out.println("thank you");
}

    public static void main(String[] args) {
        System.out.println("now you are going to get greeted");
        hello();
    }
}


//we can make different function and call it in main function only then it will run otherwise not
//we can call other function in some other function
//we can not call main function
//main is the only function that run itself and call other function