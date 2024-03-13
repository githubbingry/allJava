package Struktur_Diskrit.asd;

// import java.util.Scanner;

// public class example1_2_3 {
//     public static void main(String[] args) {
//         java.util.Scanner x = new Scanner(System.in);
//         String s = x.next();
//         int i = 0;
//         boolean nondigit = false;
//         // System.out.println(   s.charAt(i));

//         // char c;
//         // for (i = 0; i < s.length(); i++){
//         //     c =   s.charAt(i);
//         //     System.out.println();
//         //     if (c != '1' &&
//         //     c != '2' &&
//         //     c != '3' &&
//         //     c != '4' &&
//         //     c != '5' &&
//         //     c != '6' &&
//         //     c != '7' &&
//         //     c != '8' &&
//         //     c != '9' &&
//         //     c != '0'){
//         //         nondigit = true;
//         //         break;
//         //     }
//         // }

//         do{
//             if(nondigitDetected(s, i)){
//                 nondigit = true;
//             }
//             System.out.println("ayam");
//         } while (!nondigit && i++ <= s.length());
        
//         if(nondigit)
//             System.out.println("The string contains non-digit characters");
//         else
//             System.out.println("The string consists entirely of digits");
//         x.close();
//     }

//     static boolean nondigitDetected(String s, int i){
//         if ( s.charAt(i) != '1'&&
//              s.charAt(i) != '2'&&
//              s.charAt(i) != '3'&&
//              s.charAt(i) != '4'&&
//              s.charAt(i) != '5'&&
//              s.charAt(i) != '6'&&
//              s.charAt(i) != '7'&&
//              s.charAt(i) != '8'&&
//              s.charAt(i) != '9'&&
//              s.charAt(i) != '0')
//             return false;
//         return true;
//     }
// }


//dari fazri

import java.util.Scanner;

public class example1_2_3 {
    public static void main(String[] args) {
        java.util.Scanner x = new Scanner(System.in);
        String s = x.nextLine();
        int i = 0;
        boolean nondigit = false;

        regexString(s);
        // System.out.println(  s.charAt(i));

        // char c;
        // for (i = 0; i < s.length(); i++){
        //     c =  s.charAt(i);
        //     System.out.println();
        //     if (c != '1' &&
        //     c != '2' &&
        //     c != '3' &&
        //     c != '4' &&
        //     c != '5' &&
        //     c != '6' &&
        //     c != '7' &&
        //     c != '8' &&
        //     c != '9' &&
        //     c != '0'){
        //         nondigit = true;
        //         break;
        //     }
        // }

        do{
            nondigit = nondigitDetected(s, i);
            System.out.println("ayam");
        } while (!nondigit && ++i != s.length());
        
        if(nondigit)
            System.out.println("The string contains non-digit characters");
        else
            System.out.println("The string consists entirely of digits");
        x.close();
    }

    static boolean nondigitDetected(String s, int i){
        return (s.charAt(i) != '1'&&
                s.charAt(i) != '2'&&
                s.charAt(i) != '3'&&
                s.charAt(i) != '4'&&
                s.charAt(i) != '5'&&
                s.charAt(i) != '6'&&
                s.charAt(i) != '7'&&
                s.charAt(i) != '8'&&
                s.charAt(i) != '9'&&
                s.charAt(i) != '0');
    }

    static void regexString(String s){
        System.out.println(s.matches("\\d*") ?
        "The string consists entirely of digits"
        : "The string contains non-digit characters");
    }
}