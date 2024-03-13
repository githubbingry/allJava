package coba                                                                    ;
import java.util.Scanner                                                        ;
public class tfisthisshit                                                       {
    public static void main(String[] args)                                      {
        System.out.println("Tryna make java looks like python")               ;
        Scanner x = new Scanner(System.in)                                      ;
        int n = x.nextInt(), ar[] = new int[n]                                  ;
        int i = 0                                                               ;
        while (i < n)                                                           {
            ar[i++] = x.nextInt()                                               ;}
        while (n-- > 0)                                                         {
            System.out.print(ar[n] + " ")                                       ;}
        x.close()                                                               ;}}
