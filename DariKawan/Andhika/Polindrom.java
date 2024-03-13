package DariKawan.Andhika;
public class Polindrom {
    public static void main (String[] args) {
        java.util.Scanner deez = new java.util.Scanner (System.in);
            
            System.out.println("\nProgram Penentuan sifat Palindrom Bilangan/Kata/Simbol");
            System.out.println("Cara Kerja:");
            System.out.println("Anda akan diminta untuk memasukkan bilangan,kata, atau simbol yang anda ingin cek ke-palindromannya.");
            System.out.println("Contoh angka, kata, dan simbol  palindrom: ");
            System.out.println("1221, 12321, taat, tamat, !@##@!");
            System.out.println("\nNote: Mohon perhatikan bahwa tanda kurung haruslah menghadap arah yang sama agar output palindrom");
            System.out.println("Contoh: {} bukan palindrom, tapi {{ adalah palindrom\nBegitu juga {}{} bukan palindrom, tapi {}}{ adalah palindrom");
            System.out.println("\nMohon masukkan angka, kata, atau simbol yang ingin anda cek: ");

            String masukan = deez.nextLine();
            char[] data = masukan.toCharArray();
            boolean validasi = true;

            if (validasi) {
                boolean palindrom = true;
                for (int test2 = 0 ; test2 < data.length ; test2++) {
                    if (data[test2] != data[data.length - test2 - 1]) {
                        palindrom = false;
                    }
                }
                if (palindrom) {
                    System.out.println("Masukan anda "+masukan+" adalah palindrom.");
                } else {
                    System.out.println("Masukan anda "+masukan+" bukan palindrom.");
                }
            } else
                System.out.println("Mohon hanya masukkan bilangan bulat non-negatif serta huruf kecil(a,b,c) saja.");
        deez.close();
    }
}