package coba;

import java.util.Base64;
import java.util.Scanner;

public class base64 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("pilih 1 untuk encode base64 atau 2 untuk decode base64 : ");
        int opsi = x.nextInt();
        System.out.print("berapa kali perulangan ? ");
        int loop = x.nextInt();
        x.nextLine();
        switch (opsi) {
            case 1:
            System.out.println("input string untuk di encode :");
            String test = x.nextLine();
            String encodedString = Base64.getEncoder().encodeToString(test.getBytes());
            for(int i = 1; i < loop; i++){
                test = encodedString;
                encodedString = Base64.getEncoder().encodeToString(test.getBytes());
            }
            System.out.println(encodedString);
                break;

            case 2 :
            System.out.println("input string untuk di decode :");
            test = x.nextLine();
            byte[] decodedBytes = Base64.getDecoder().decode(test);
            String decodedString = new String(decodedBytes);
            for(int i = 1; i < loop; i++){
                test = decodedString;
                decodedBytes = Base64.getDecoder().decode(test);
                decodedString = new String(decodedBytes);
            }
            System.out.println(decodedString);
            default:
                break;
        }

        // flag{EnT4H_ApA_In1_K4mU_kAmU!}
        // ZmxhZ3tFblQ0SF9BcEFfSW4xX0s0bVVfa0FtVSF9

        x.close();
    }
}
