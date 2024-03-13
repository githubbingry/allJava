package formatMethod;

public class bubbleSort {
    public static void main(String[] args) {
        int[] ar = {3,2,1,5,6};
        for(int i = 0; i < ar.length; i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        bubble(ar);
        for(int i = 0; i < ar.length; i++){
            System.out.print(ar[i]+" ");
        }
    }

    static int[] bubble(int[] ar){
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
        return ar;
    }
}
