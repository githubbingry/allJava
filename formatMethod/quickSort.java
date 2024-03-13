package formatMethod;

public class quickSort {
    public static void main(String[] args) {
        int[] ar = {1,4,7,2,4,2,9};
        for (int i = 0; i < ar.length; i++){
            System.out.print(ar[i] + " ");
        }
        System.out.println();
        quickSorting(ar, 0, ar.length-1);
        for (int i = 0; i < ar.length; i++){
            System.out.print(ar[i] + " ");
        }
    }

    public static void quickSorting(int[] data, int low, int high) {
        if (low < high) {
            int pi = partition(data, low, high);
            quickSorting(data, low, pi - 1);
            quickSorting(data, pi + 1, high);
        }
    }

    static int partition(int[] data, int low, int high) {
        int pivot = data[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (data[j] <= pivot) {
                i++;
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        int temp = data[i + 1];
        data[i + 1] = data[high];
        data[high] = temp;
        return i + 1;
    }
}

