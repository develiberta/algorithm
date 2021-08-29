package summary;

public class SortAlgorithm {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 3, 2, 1};

        bubbleSort(array);
        selectionSort(array);
        insertionSort(array);

        for (int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void bubbleSort(int[] array) {
        for (int i=array.length-2; i>=0; i--) {
            for (int j=0; j<=i; j++) {
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

    private static void selectionSort(int[] array) {
        for (int i=0; i<=array.length-2; i++) {
            for (int j=i+1; j<array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
    }

    private static void insertionSort(int[] array) {
        for (int i=1; i<=array.length-1; i++) {
            for (int j=0; j<i; j++) {
                if (array[i] < array[j]) {
                    int tmp = array[i];
                    for (int k=i-1; k>=j; k--) {
                        array[k+1] = array[k];
                    }
                    array[j] = tmp;
                }
            }
        }
    }
}
