package Code_League.CL_8;

import java.util.Scanner;

public class PermainanShinobi {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        long[] ar = new long[n];
        for (int i = 0; i < n; i++){
            ar[i] = x.nextLong();
        }
        for (int i = 0; i < n; i++){
            if(ar[i] % 6 == 0) System.out.println("KAKASHI");
            else System.out.println("GUY");
        }
        x.close();
    }
}
/* game 2, kunai g < k, g pertama
g 1-4 (1)
k 1-7 (2)
n       g       k       m
1-4     1-4     0       g
5       1       4       k
6       1       5       k
7       1       6       k
8       1       7       k
9       1,1     1,6     k
10      1,1     1,7     k
11      1,1,1   1,1,6   k
12      4,1     1,6     k
13      4,1     1,7     k
14      4,1,1   1,1,6   k
15      4,1,1   1,1,7   k
...
conclusion  g menang ketika < 5 (sebanyak 4)
            k menang ketika > 4
 */

/* game 3, kunai g < k, k pertama
k 1-7 (1)
g 1-4 (2)
n       k       g       m
1-7     1-7     0       k
8       3,4     1       k
9       3,5     1       k
10      3,6     1       k
11      3,7     1       k
12      7,4     1       k
...
conclusion  g tidak akan pernah menang
            k yang akan selalu menang
*/

/* game 4, g pertama
g 1-3
k 4-6
n       g       k       m
1-3     1-3     0       g
4       1,3     0       g
5-7     1       4-6     k
8       1,3     4       g
9       1,1,3   4,0     g
...
*/