package coba;

import java.util.Arrays;

public class preUTS_ASDL {
    public static void main(String[] args) {
        // System.out.println(pangkat(3, 4));
        // System.out.println(pangkat(0, 0));
        // System.out.println(pangkat(0, 3));
        // System.out.println(pangkat(3, 0));

        // int[] ar = {9,2,1,0,-2,1,-9};
        // int[] ar = {1 ,7 ,9 ,6 ,4 ,3 ,5};

        // bubbleSortDescending(ar);
        // for(int i : ar){
        //     System.out.print(i + " ");
        // }
        // System.out.println();

        // bubbleSortAscending(ar);
        // for(int i : ar){
        //     System.out.print(i + " ");
        // }
        
        // binarySearchIterativeAscending(9, ar);

        // System.out.println(", Array: " + Arrays.toString(ar));
        // quickSort(ar, 0, ar.length-1);

        // int[] a = new int[25];
        // int[] ketemu = {0};
        // int ketemua = 0;
        // isiArrayRandom(a);
        // for(int i : a){
        //     System.out.print(i + " ");
        // }
        // ketemu7(a, ketemu, ketemua);
        // System.out.println();
        // System.out.println(ketemu[0]);
        // System.out.println(ketemua);

        int[] ar = {1, 2, 3, 4 ,5 ,6, -1, -2, -3, -100, 100};
        System.out.println(min(ar));
        System.out.println(max(ar));
        int[] maxmin = {0,0};
        maxmin(ar, maxmin);
        System.out.println("max = "+ maxmin[0]);
        System.out.println("min = "+ maxmin[1]);
    }

    static int[] maxmin(int[] ar, int[] maxmin){
        maxmin[0] = ar[0]; // max
        maxmin[1] = ar[0]; // min
        for (int i = 1 ; i < ar.length; i++){
            //cek max
            if(ar[i] > maxmin[0]) maxmin[0] = ar[i];
            //cek min
            if(ar[i] < maxmin[1]) maxmin[1] = ar[i];
        }
        return maxmin;
    }

    static int min(int[] ar){
        int min = ar[0];
        for(int i : ar){
            if(i < min){
                min = i;
            }
        }
        return min;
    }
    
    static int max(int[] ar){
        int max = ar[0];
        for(int i : ar){
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    static void isiArrayRandom(int[] a){
        for(int i =0 ; i < a.length; i++){
            a[i] = (int)(Math.random()*10);
        }
        // for(int i : a){
        //     i = (int)(Math.random()*10);
        // }
    }

    static void ketemu7(int[] a, int[] ketemu, int ketemua){
        for(int i : a){
            if(i == 7) {
                ketemua++;
                ketemu[0]++;
            }
        }
    }

    //1. buat fungsi pangkat menggunakan rekursif
    // prekondisi : basis dan pangkat harus bilangan bulat non negatif (0 include)
    static int pangkat(int basis, int pangkat){
        if (basis == 0 && pangkat == 0){
            System.out.println("undefined");
            return -1;
        }// 0^0 undefined
        
        if (basis == 0){
            return 0;
        }// 0^n = 0
        
        if (pangkat == 0){
            return 1;
        }// n^0 = 1

        //basis untuk rekursif ketika pangkat = 1
        //3^4 = 81 = 3*3*3*3
        if (pangkat == 1){
            return basis;
        }

        return basis * pangkat(basis, pangkat -1);
        /*
        basis = 3
        pangkat = 4

        rec 1:
        pangkat = 4
        basis * pangkat
        3 * rec 2

        rec 2:
        pangkat = 3
        basis * pangkat
        3 * rec 3
        
        rec 3:
        pangkat = 2
        basis * pangkat
        3 * rec 4

        rec 4:
        pangkat = 1
        basis
        3

        rec 3:
        3*3
        
        rec 2:
        3*3*3
        
        rec 1:
        3*3*3*3
        
         */
    }

    //bubble menurun
    /*
    i = 0
    1 6 8 2 9
    1 6 8 9 2
    1 6 9 8 2
    1 9 6 8 2
    9 1 6 8 2
    
    i = 1
    9 1 6 8 2
    9 1 6 8 2
    9 1 8 6 2
    9 8 1 6 2

    i = 2
    9 8 1 6 2
    9 8 1 6 2
    9 8 6 1 2

    i = 3
    9 8 6 1 2
    9 8 6 2 1
     */
    //2. buat prosedur bubbleSort yang menurun
    static void bubbleSortDescending(int[] ar){
        int temp = 0;
        for(int i = 0; i < ar.length-1; i++){
            for(int j = ar.length-1; j > i; j--){
                if(ar[j] > ar[j-1]){
                    temp = ar[j-1];
                    ar[j-1] = ar[j];
                    ar[j] = temp;
                }
            }
        }
    }
    
    static void bubbleSortAscending(int[] ar){
        int temp = 0;
        for(int i = 0; i < ar.length-1; i++){
            for(int j = ar.length-1; j > i; j--){
                if(ar[j] < ar[j-1]){
                    temp = ar[j-1];
                    ar[j-1] = ar[j];
                    ar[j] = temp;
                }
            }
        }
    }

    //prosedur binsearch no 3
    /*
    elem = 3
    ar = 1 5 2 3
    low = high
     */
    //prekondisi sudah tersusun dan ascending
    static void binarySearchIterativeAscending(int elem, int[] ar){
        int high = ar.length - 1, low = 0, mid;
        boolean found = false;
        while (low <= high && !found){
            mid = (high + low) / 2;
            if (ar[mid] == elem) {
                found = true;
                System.out.println("ada di elemen "+mid);
            }
            else if (ar[mid] > elem) high = mid - 1;
            else low = mid + 1;
        }
        if(!found) System.out.println("tidak ada");
    }

    //prekondisi sudah tersusun dan descending
    static void binarySearchIterativeDescending(int elem, int[] ar){
        int high = ar.length - 1, low = 0, mid;
        boolean found = false;
        while (low <= high && !found){
            mid = (high + low) / 2;
            if (ar[mid] == elem) {
                found = true;
                System.out.println("ada di elemen "+mid);
            }
            else if (ar[mid] < elem) high = mid - 1;
            else low = mid + 1;
        }
        if(!found) System.out.println("tidak ada");
    }

    public static long binarySearchRecursiveIndex(long[] ar, long elem, long l, long h){
        long m = (h+l)/2;
        if (l > h) return -1;
        else if (ar[(int)m] == elem) return m;
        else if (ar[(int)m] > elem) return binarySearchRecursiveIndex(ar, elem, l, m-1);
        else return binarySearchRecursiveIndex(ar, elem, m+1, h);
    }

    public static boolean binarySearchRecursive(long[] ar, long elem, long l, long h){
        long m = (h+l)/2;
        if (l > h) return false;
        else if (ar[(int)m] == elem) return true;
        else if (ar[(int)m] > elem) return binarySearchRecursive(ar, elem, l, m-1);
        else return binarySearchRecursive(ar, elem, m+1, h);
    }

    // no 3
    // 1 7 9 6 4 3 5
    /*
    pivot = 5
    rec 1:
    1 4 3 5 7 9 6
    sub array di kiri yaitu pivot rec 2a = pivot - 1
    sub array di kanan yaitu pivot rec 2b = pivot + 1

    rec 2a:
    1 4 3
    pivot = 3
    1 3 4

    rec 2b:
    7 9 6
    pivot = 6
    6 9 7

    rec 3:
    9 7
    pivot = 7
    7 9
    */

    /*
Pivot: 6, Array: [1, 4, 5, 1, 0, 2, 6, 7, 9]
Pivot: 2, Array: [1, 1, 0, 2, 5, 4, 6, 7, 9]
Pivot: 0, Array: [0, 1, 1, 2, 5, 4, 6, 7, 9]
Pivot: 1, Array: [0, 1, 1, 2, 5, 4, 6, 7, 9]
Pivot: 4, Array: [0, 1, 1, 2, 4, 5, 6, 7, 9]
Pivot: 9, Array: [0, 1, 1, 2, 4, 5, 6, 7, 9]
     */
    public static void quickSort(int[] data, int low, int high) {

        //sebuah method bernama quickSort return tipe void dengan parameter array
        if (low < high) {
            int pi = partition(data, low, high);
            System.out.println("Pivot: " + data[pi] + ", Array: " + Arrays.toString(data));
            quickSort(data, low, pi - 1);
            quickSort(data, pi + 1, high);
        }
    }

    static int partition(int[] data, int low, int high) {
        int pivot = data[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (data[j] < pivot) {
                i++;
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        int temp = data[i + 1];
        //temp = 7
        data[i + 1] = data[high];
        //data i+1 = 6
        data[high] = temp;
        // data high = 7
        return i + 1;
    }


}

/*
6. buat array juga max min
 */