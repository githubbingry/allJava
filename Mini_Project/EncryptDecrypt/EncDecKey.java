package Mini_Project.EncryptDecrypt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EncDecKey {
    //private key 0 (sometimes 396826) will make the same output as the one in EncryptDecrypt.java
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Select 1 for encryption or 2 for decryption : ");
        int option = Integer.parseInt(read.readLine());

        switch (option) {
            case 1 :
                System.out.print("Enter the String for Encryption : ");
                String message = read.readLine();
                System.out.println(encrypt(message));
                break;
            case 2 :
                System.out.print("Enter your private privateKey : ");
                int privateKey = Integer.parseInt(read.readLine());
                System.out.print("Enter the String for Decryption : ");
                message = read.readLine();
                System.out.println(decrypt(message, privateKey));
                break;
            default: System.out.println("Select only 1 or 2");
                break;
        }
    }

    static String encrypt(String message){
        int privateKey = (int)(Math.random()*1000000);
        System.out.println("Your private privateKey : " + privateKey);
        String cipherMessage = "";
        String ASCII = "!#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~ ";
        int shift = (privateKey + message.length()) ^ ASCII.length();
        for (int i = 0; i < message.length(); i++){
            int charPosition = ASCII.indexOf(message.charAt(i));
            int keyVal = (shift + charPosition) % ASCII.length();
            char replaceVal = ASCII.charAt(keyVal);
            cipherMessage += replaceVal;
        }
        return cipherMessage;
    }

    static String decrypt(String message, int privateKey){
        String cipherMessage = "";
        String ASCII = "!#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~ ";
        int shift = (privateKey + message.length()) ^ ASCII.length();
        for (int i = 0; i < message.length(); i++){
            int charPosition = ASCII.indexOf(message.charAt(i));
            int keyVal = (-shift + charPosition) % ASCII.length();
            if (keyVal < 0 ){
                keyVal = ASCII.length() + keyVal;
            }
            char replaceVal = ASCII.charAt(keyVal);
            cipherMessage += replaceVal;
        }
        return cipherMessage;
    }
}
