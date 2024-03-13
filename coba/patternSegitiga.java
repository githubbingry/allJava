package coba;

import java.util.Scanner;

public class patternSegitiga {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Pilih antara kasus A, B, C, atau D : ");
        char kasus = x.next().charAt(0);
        System.out.print("Masukkan banyak baris : ");
        int n = x.nextInt();
        x.close();
        switch (kasus) {
            case 'A': KasusA(n);
                break;
            case 'B': KasusB(n);
                break;
            case 'C': KasusC(n);
                break;
            case 'D': KasusD(n);
                break;
            default: System.out.println("Tolong hanya input antara A, B, C, atau D");
        }
    }

    static void KasusA(int n) {
        /*  variabel tetap pada : System.out.print(i+" ");
        
            variabel bebas pada :
            inisialisasi dan kondisi for i (banyak baris):
            1. int i = 1 ; i <= n ; i++ , dimana for loop i dari 1 sampai n
            2. int i = n ; i >= 1 ; i-- , dimana for loop i dari n sampai 1
            (inisialisasi dan kondisi pada i menyatakan berapa banyak baris(yang paling besar))
            inisialisasi dan kondisi for j:
            1. int j = 1 ; j <= i ; j++ , dimana for loop j dari 1 sampai i
            2. int j = i ; j >= 1 ; j-- , dimana for loop j dari i sampai 1
        
            Sehingga ada 4 kemungkinan :
            1. for loop i 1-n dan for loop j 1-i
            2. for loop i n-1 dan for loop j i-1
            3. for loop i 1-n dan for loop j i-1
            4. for loop i n-1 dan for loop j 1-i
        
            Hasil output menyatakan bahwa
            Pattern 1A sama dengan Pattern 3A :
            1
            2 2
            3 3 3
            4 4 4 4
            5 5 5 5 5
            ...
            n n n n n ... n

            Pattern 2A sama dengan Pattern 4A :
            n n n n n ... n
            ...
            5 5 5 5 5
            4 4 4 4
            3 3 3
            2 2
            1
        */

        System.out.println("\nPattern 1A");
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        
        System.out.println("\nPattern 2A");
        for (int i=n; i>=1;i--){
            for (int j =i;j>=1;j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        
        System.out.println("\nPattern 3A");
        for(int i=1;i<=n;i++){
            for (int j =i;j>=1;j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        System.out.println("\nPattern 4A");
        for (int i=n; i>=1;i--){
            for (int j =1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    static void KasusB(int n){
        /*  variabel tetap pada : System.out.print(j+" ");
        
            variabel bebas pada :
            inisialisasi dan kondisi for i (banyak baris):
            1. int i = 1 ; i <= n ; i++ , dimana for loop i dari 1 sampai n
            2. int i = n ; i >= 1 ; i-- , dimana for loop i dari n sampai 1
            (inisialisasi dan kondisi pada i menyatakan berapa banyak baris(yang paling besar))
            inisialisasi dan kondisi for j:
            1. int j = 1 ; j <= i ; j++ , dimana for loop j dari 1 sampai i
            2. int j = i ; j >= 1 ; j-- , dimana for loop j dari i sampai 1
        
            Sehingga ada 4 kemungkinan :
            1. for loop i 1-n dan for loop j 1-i
            2. for loop i n-1 dan for loop j i-1
            3. for loop i 1-n dan for loop j i-1
            4. for loop i n-1 dan for loop j 1-i

            Hasil output menyatakan bahwa setiap Pattern memiliki hasil yang berbeda-beda
            Pattern 1B
            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
            ...
            1 2 3 4 5 ... n
            

            Pattern 2B
            n ... 5 4 3 2 1
            5 4 3 2 1
            4 3 2 1
            3 2 1
            2 1
            1

            Pattern 3B
            1
            2 1
            3 2 1
            4 3 2 1
            5 4 3 2 1
            ...
            n ... 5 4 3 2 1

            Pattern 4B
            1 2 3 4 5 ... n
            ...
            1 2 3 4 5
            1 2 3 4
            1 2 3
            1 2
            1
        */


        System.out.println("\nPattern 1B");
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
        System.out.println("\nPattern 2B");
        for(int i=n; i>=1;i--){
            for (int j =i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("\nPattern 3B");
        for(int i=1;i<=n;i++){
            for (int j =i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("\nPattern 4B");
        for (int i=n; i>=1;i--){
            for (int j =1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void KasusC(int n){
        /*  variabel tetap pada : a = 1; , System.out.print(a+" "); , a++;
        
            variabel bebas pada :
            inisialisasi dan kondisi for i (banyak baris):
            1. int i = 1 ; i <= n ; i++ , dimana for loop i dari 1 sampai n
            2. int i = n ; i >= 1 ; i-- , dimana for loop i dari n sampai 1
            (inisialisasi dan kondisi pada i menyatakan berapa banyak baris(yang paling besar))
            inisialisasi dan kondisi for j:
            1. int j = 1 ; j <= i ; j++ , dimana for loop j dari 1 sampai i
            2. int j = i ; j >= 1 ; j-- , dimana for loop j dari i sampai 1
        
            Sehingga ada 4 kemungkinan :
            1. for loop i 1-n dan for loop j 1-i
            2. for loop i n-1 dan for loop j i-1
            3. for loop i 1-n dan for loop j i-1
            4. for loop i n-1 dan for loop j 1-i

            Hasil output menyatakan bahwa
            Pattern 1C sama dengan Pattern 3C :
            1
            2 3
            4 5 6
            7 8 9 10
            ... n(n-1)/2
            
            Pattern 2C sama dengan Pattern 4C :
            1 2 3 4 ... n
            5 6 7 ... 2n-1
            8 9 ... 3n-3
            10 ... 4n-6
            n(n-1)/2
        */
        
        System.out.println("\nPattern 1C");
        int a = 1;
        for (int i=1; i<=n ;i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
        
        System.out.println("\nPattern 2C");
        a = 1;
        for (int i=n; i>=1 ;i--){
            for(int j=i ; j>=1 ; j--){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }

        System.out.println("\nPattern 3C");
        a = 1;
        for(int i=1;i<=n;i++){
            for (int j =i;j>=1;j--){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
        
        System.out.println("\nPattern 4C");
        a = 1;
        for (int i=n; i>=1;i--){
            for (int j =1;j<=i;j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }

    static void KasusD(int n){
        //belom
    }
}
