package DariKawan.Fazri;

public class BinarySearchUnsortedIndexFinder {
    public static void main(String[] args) {
        Element[] array = {
                new Element(5, 0),
                new Element(2, 1),
                new Element(4, 2),
                new Element(1, 3),
                new Element(3, 4)
        };
        int element = 4; // Element that is about to find
        System.out.println(binarySearchInUnsortedArray(array, element));
    }

    public static int binarySearchInUnsortedArray(Element[] array, int element) {
        bubbleSort(array);
        int index = binarySearch(array, element);
        return index >= 0 ? array[index].originalIndex : -1;
    }

    public static void bubbleSort(Element[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j].value > array[j + 1].value) {
                    Element temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    public static int binarySearch(Element[] array, int element) {
        int left = 0, right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid].value == element)
                return mid;
            if (array[mid].value < element)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    static class Element {
        int value;
        int originalIndex;

        Element(int value, int originalIndex) {
            this.value = value;
            this.originalIndex = originalIndex;
        }
    }
}