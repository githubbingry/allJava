package GDSC_UNSRI;

import java.util.Base64;
import java.util.Scanner;

public class EncodeDecodeBase64 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("pilih 1 untuk encode base64 atau 2 untuk decode base64 : ");
        int opsi = x.nextInt();
        switch (opsi) {
            case 1:
            System.out.println("input string untuk di encode :");
            String test = x.next();
            String encodedString = Base64.getEncoder().encodeToString(test.getBytes());
            System.out.println(encodedString);
                break;

            case 2 :
            System.out.println("input string untuk di decode :");
            test = x.next();
            byte[] decodedBytes = Base64.getDecoder().decode(test);
            String decodedString = new String(decodedBytes);
            System.out.println(decodedString);
            default:
                break;
        }

        // flag{EnT4H_ApA_In1_K4mU_kAmU!}
        // ZmxhZ3tFblQ0SF9BcEFfSW4xX0s0bVVfa0FtVSF9

        x.close();
    }
}
