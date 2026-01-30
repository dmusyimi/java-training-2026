package io.github.talentdevelopment004.strings;

public class CCMask {
    public static String maskCC(String creditCard){
        String x = "XXXX-XXXX-XXXX-";
        StringBuilder sb = new StringBuilder(creditCard);
       sb.substring(15,19);
        // line n1
        return x + sb;
    }

    public static void main(String[] args) {
        //System.out.println(maskCC("1234-5678-9101-1121"));
        String a = new String("Alice"); // JVM - object memory
        String b = a ;// Alice -> happens in the pool
//        a = "John";
        System.out.println(a.equals(b)); // John John Alice |  John John
//        System.out.println(b); // Alice John Alice | John Alice


    }
}
