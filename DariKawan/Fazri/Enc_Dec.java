package DariKawan.Fazri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Enc_Dec {
    public static void main(String[] args) throws IOException {
        int shift;
        String cipherMessage, message, decryptedMessage;
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingin mengenkripsi atau mendekripsi? (e/d): ");
        char options = read.readLine().charAt(0);
        System.out.print("Masukkan pesan: ");
        message = read.readLine();
        shift = message.length() % 94;
        switch (options) {
            case 'e':
                cipherMessage = encrypt(message, shift);
                System.out.println("Pesan terenkripsi: " + cipherMessage);
                break;
            case 'd':
                decryptedMessage = decrypt(message, shift);
                System.out.println("Pesan terdekripsi: " + decryptedMessage);
                break;
            default:
                break;

        }

    }

    static String encrypt(String message, int shift) {
        String cipherMessage = "";
        String ASCII = "!#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~ ";
        for (int i = 0; i < message.length(); i++) {
            int charPosition = ASCII.indexOf(message.charAt(i));
            int keyVal = (shift + charPosition) % 94;
            char replaceVal = ASCII.charAt(keyVal);
            cipherMessage += replaceVal;
        }
        return cipherMessage;
    }

    static String decrypt(String cipherMessage, int shift) {
        String decryptedMessage = "";
        String ASCII = "!#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~ ";
        for (int i = 0; i < cipherMessage.length(); i++) {
            int charPosition = ASCII.indexOf(cipherMessage.charAt(i));
            int keyVal = (charPosition - shift) % 94;
            if (keyVal < 0) {
                keyVal = ASCII.length() + keyVal;
            }
            char replaceVal = ASCII.charAt(keyVal);
            decryptedMessage += replaceVal;
        }
        return decryptedMessage;
    }
}

