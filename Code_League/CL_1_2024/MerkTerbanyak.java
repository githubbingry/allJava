package Code_League.CL_1_2024;

import java.util.Scanner;

public class MerkTerbanyak {
    public static void main(String[] args) {
        java.util.Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int merk[] = {0, 0, 0, 0};
        String s;
        while(n-->0){
            s = x.next();
            if(s.equalsIgnoreCase("yamaha")){merk[0]++;}
            if(s.equalsIgnoreCase("honda")){merk[1]++;}
            if(s.equalsIgnoreCase("suzuki")){merk[2]++;}
            if(s.equalsIgnoreCase("kawasaki")){merk[3]++;}
        }
        int maks = -1;
        int index = -1;
        for(int i = 0; i < 4; i++){
            if(merk[i] > maks){
                maks = merk[i];
                index = i;
            }
        }
        switch (index) {
            case 0:
                System.out.println("yamaha");
                break;
        
            case 1:
                System.out.println("honda");
                break;
        
            case 2:
                System.out.println("suzuki");
                break;
        
            case 3:
                System.out.println("kawasaki");
                break;
        
            default:
                break;
        }
        x.close();
    }
}
