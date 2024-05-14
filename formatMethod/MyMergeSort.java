package formatMethod;

public class MyMergeSort {
    public static void main(String[] args) {
        int[] a = {1, 7, 9, 2, 0, -1, -99, 123, 4};
        merge(a);
        print(a);
    }

    public static void merge(int[] a){
        int size = a.length;
        //basis
        if(size < 2){
            //do nothing
        } else {
            int leftSize = (size + 1)/2;
            int rightSize = size - leftSize;
            int[] leftA = new int[leftSize];
            int[] rightA = new int[rightSize];
            for(int i = 0; i < leftSize; i++){
                leftA[i] = a[i];
            }
            for(int i = leftSize; i < size; i++){
                rightA[i-leftSize] = a[i];
            }
            merge(leftA);
            merge(rightA);
            mergeThem(leftA, rightA, a);
        }
    }

    private static void mergeThem(int[] leftA, int[] rightA, int[] a){
        int leftSize = leftA.length;
        int rightSize = rightA.length;
        int i, j, k;
        i = j = k = 0;
        while(i < leftSize && j < rightSize){
            if(leftA[i] < rightA[j]){
                a[k] = leftA[i];
                i++;
            } else {
                a[k] = rightA[j];
                j++;
            }
            k++;
        }
        if(i == leftSize){
            for(; j < rightSize; j++){
                a[k] = rightA[j];
                k++;
            }
        } else {
            for(; i < leftSize; i++){
                a[k] = leftA[i];
                k++;
            }
        }
    }

    private static void print(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
