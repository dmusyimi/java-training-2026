package io.github.talentdevelopment004.loops;

public class Ternary {
    public static void main(String[] args) {
        System.out.println(message());

        int x = 100; // 100
        int a = x++; // use the value of x then proceed to increment (post-increment)
        // x => 101
        int b = ++x; // increment the value of x then proceed to use it (101 + 1) -> x=102
        int c = x++; // use the value of x then proceed to increment (post-increment) // c=102
        // x=103
        int d = (x < b) ? (a < c) ? a : (b < c) ? b : c : x;
        System.out.println(d);

    }

    public static String message() {
        String status = "Pending";
        // condition? trueOperation:falseOperation
        // if(status == "pending"){
        // return "Your order is in pending state";
        // }else{
        // return "Your order has been placed" ;
        // }
        return status == "Pending" ? "Your order is in pending state" : "Your order has been placed";
    }
}
