package DariKawan.Fazri;

public class LatihanUAS {
    public static void main(String[] args) {
        System.out.println("\nsoal 1");
        int[] array = {1, 2, 3, 4, 5};
        printReverse(array);
        System.out.println("\nsoal 2");
        genapGanjil();
        System.out.println("\nsoal 3");
        printHello();
        System.out.println("\nsoal 4");
        int result = divide1(10, 0);
        System.out.println(result);
        System.out.println("\nsoal 5");
        pola();
    }

    static void printReverse(int[] ar){
        for (int i = ar.length-1; i >= 0; i--){
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }

    static void genapGanjil(){
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " adalah genap");
            } else {
                System.out.println(i + " adalah ganjil");
            }
        }
    }

    public static void printHello(){
        System.out.println("Hello World!");
    }

    public static int divide1(int a, int b) {
        if (b == 0) return -1;
        return a / b;
    }

    public static int divide2(int a, int b) {
        try {
            return a / b;
        } catch (Exception e) {
            System.out.println("Tidak bisa membagi dengan 0");
            return -1;
        }
    }

    static void pola(){
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            for (int j = i-1; j >= 1; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
/*
1. *Melengkapi Program (15 poin)*
    Lengkapi kode berikut ini untuk mencetak elemen array dalam urutan terbalik:
    Main.java
    public class Main {
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};
        }

        static void printReverse(int[] ar){
            for (int i = ar.length-1; i >= 0; i--){
                System.out.print(ar[i] + " ");
            }
        }
    }

2. *Menebak Keluaran Program (15 poin)*
    Apa keluaran dari kode berikut ini?
    Main.java
    public class Main {
        public static void main(String[] args) {
            for (int i = 1; i <= 5; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " adalah genap");
                } else {
                    System.out.println(i + " adalah ganjil");
                }
            }
        }
    }
    Output :
    1 adalah ganjil
    2 adalah genap
    3 adalah ganjil
    4 adalah genap
    5 adalah ganjil

3. *Mengecek Program (20 poin)*
    Apakah kode berikut ini dapat berjalan? Jika tidak, jelaskan mengapa dan bagaimana cara memperbaikinya.
    printHello.java
    public class Main {
        public static void main(String[] args) {
            printHello();
        }

        public void printHello() {
            System.out.println("Hello, world!");
        }
    }
    Jawab :
    Tidak, karena nama main class tidak sama dengan nama file, dan untuk method printHello mempunyai nama file/konstruktor dan tidak memiliki access modifier(static) yang sama dengan main method sehingga tidak dapat diakses oleh main method.
    Perbaikan dapat dilakukan dengan menambahkan access modifier pada method printHello berupa "static" dan mengganti nama file atau nama main class, jika mengganti nama main class menjadi nama file maka nama method harus diganti, perbaikan optimal dapat dilakukan dengan mengganti nama file saja.
    
    Perbaikan sc :
    Main.java
    public class Main {
        public static void main(String[] args) {
            printHello();
        }

        public static void printHello() {
            System.out.println("Hello, world!");
        }
    }

4. *Menjelaskan Program (20 poin)*
    Program berikut ini tidak dapat berjalan. Jelaskan mengapa dan berikan solusi untuk memperbaikinya.
    Main.java
    public class Main {
        public static void main(String[] args) {
            int result = divide(10, 0);
            System.out.println(result);
        }

        public static int divide(int a, int b) {
            return a / b;
        }
    }
    Jawab :
    Karena terdapat error pada pengoperasian aritmatika pada method divide yang membagi bilangan 10 dengan nol,
    hal ini dapat diperbaiki dengan menggunakan statement try-catch untuk error handling dan mengeluarkan output "Tidak bisa membagi dengan 0" dan return value -1, atau menggunakan statement if(b == 0) return -1; pada method divide
    Perbaikan :
    public class Main {
        public static void main(String[] args) {
            int result = divide(10, 0);
            System.out.println(result);
        }

        public static int divide1(int a, int b) {
            if (b == 0) return -1;
            return a / b;
        }
        
        public static int divide2(int a, int b) {
        try {
            return a / b;
        } catch (Exception e) {
            System.out.println("Tidak bisa membagi dengan 0");
            return -1;
        }
    }
    }

5. *Membuat Program (30 poin)*
    Buatlah program yang mencetak pola berikut ini menggunakan perulangan dan/atau pengkondisian:
    
    1
    1 2 1
    1 2 3 2 1
    1 2 3 4 3 2 1
    1 2 3 4 5 4 3 2 1

    Jawab :
    public class Main {
        public static void main(String[] args) {
            pola();
        }
        static void pola(){
            for (int i = 1; i <= 5; i++){
                for (int j = 1; j <= i; j++){
                    System.out.print(j + " ");
                }
                for (int j = i-1; j >= 1; j--){
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
 */