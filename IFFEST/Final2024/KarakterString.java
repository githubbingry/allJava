package IFFEST.Final2024;

import java.util.Scanner;

public class KarakterString {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        long n = x.nextLong()+1;
        int i = x.nextInt();
        x.close();
        boolean f = false;
        while(!f){
            String hn = Integer.toHexString((int)n);
            char[] c = hn.toCharArray();
            int[] a = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
            String t = "";
            for(int ii = 0; ii < hn.length(); ii++){
                a[(Integer)(int)c[ii] instanceof Integer ? c[ii]-48 : c[ii]-48]++;
                if(c[ii] == '0') c[ii] = 'a';
                if(c[ii] == '1') c[ii] = 'b';
                if(c[ii] == '2') c[ii] = 'c';
                if(c[ii] == '3') c[ii] = 'd';
                if(c[ii] == '4') c[ii] = 'e';
                if(c[ii] == '5') c[ii] = 'f';
                if(c[ii] == '6') c[ii] = 'g';
                if(c[ii] == '7') c[ii] = 'h';
                if(c[ii] == '8') c[ii] = 'i';
                if(c[ii] == '9') c[ii] = 'j';
            }
            for(int ii = 0; ii < a.length || ii < hn.length(); ii++){
                if(a[ii] > i) {
                    f = false;
                    n++;
                    break;
                } else {
                    f = true;
                }
                if(ii < hn.length()){
                    t += c[ii];
                }
            }
            if(f) System.out.println(t);
        }
    }
}