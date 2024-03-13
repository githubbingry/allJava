package coba;

public class forLoop {
    public static void main(String[] args) {
        System.out.println("\nfor 1");
        for (int i = 1; i < 21; i++){
            System.out.println(i);
        }

        System.out.println("\nfor 2");
        for (int i = 1; i <= 20; i++){
            System.out.println(i);
        }

        System.out.println("\nfor 3");
        for (int i = 0; ++i < 21; ){
            System.out.println(i);
        }

        System.out.println("\nfor 4");
        for (int i = 0; i++ <= 19; ){
            System.out.println(i);
        }
    }
}
