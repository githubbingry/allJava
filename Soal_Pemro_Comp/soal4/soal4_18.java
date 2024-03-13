package Soal_Pemro_Comp.soal4;

public class soal4_18 {
    public static void main(String[] args) {
        System.out.println("Pattern A");
        for (int i=1; i<=6;i++){
            for (int j =1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
        System.out.println("\nPattern B");
        for (int i=6; i>=1;i--){
            for (int j =1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
        System.out.println("\nPattern C");
        for (int i=1; i<=6;i++){
            for (int j=6;j>i;j--){
                System.out.print("  ");
            }
            for (int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
        System.out.println("\nPattern D");
        for (int i=6; i>=1;i--){
            for (int j=6;j>i;j--){
                System.out.print("  ");
            }
            for (int j =1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        // System.out.println("\nPattern E");
        // for(int i=1;i<=6;i++){
        //     for (int j=1;j<=i;j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        // System.out.println("\nPattern F");
        // for (int i=6; i>=1;i--){
        //     for (int j =i;j>=1;j--){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

    }
}
