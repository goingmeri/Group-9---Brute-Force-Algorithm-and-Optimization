public class BubbleSortTraditional {
    public static void main(String[] args) {
        int[] array = {4, 18, 6, 13, 9, 5};
        int size = array.length;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
