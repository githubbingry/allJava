package coba;

import java.util.Scanner;

public class methodProcedure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter either A, B, C, or D : ");
        char menu = scan.next().charAt(0);
        System.out.print("Enter the value of x, y, and z : ");
        int x=scan.nextInt(), y=scan.nextInt(), z=scan.nextInt();
        scan.close();
        
        // check(x,y,x);
        if (x<0 || x>20 || y<0 || y>20 || z<0 || z>20){
            System.out.println(0);
            return;
        }

        if (menu=='A'){
            hitung1(x,y,z);
            hitung2(x,y,z);
        } else if (menu=='B'){
            hitung2(x,y,z);
            hitung3(x,y,z);
        } else if (menu=='C'){
            hitung3(x,y,z);
            hitung4(x,y,z);
        } else if (menu=='D'){
            hitung4(x,y,z);
            hitung5(x,y,z);
        } else main(args);
    }

    static void hitung1(int x,int y,int z){
        System.out.println(x + y - z + 10);
    }
    static void hitung2(int x,int y,int z){
        System.out.println(x - y + z + 20);
    }
    static void hitung3(int x,int y,int z){
        System.out.println(x * y - z + 30);
    }
    static void hitung4(int x,int y,int z){
        System.out.println(x - y * z + 40);
    }
    static void hitung5(int x,int y,int z){
        System.out.println(x - y - z + 50);
    }

    // static void check(int x, int y, int z){
    //     if (x<0 || x>20 || y<0 || y>20 || z<0 || z>20){
    //         System.out.println(0);
    //         return; //ini hanya keluar method
    //     }
    // }
}
