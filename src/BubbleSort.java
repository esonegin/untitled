public class BubbleSort {
    public static void main(String[] args) {
        int[] bubbles = bubbleSort(new int[]{10, 1, 8, 7, 6, 3, 4, 3, 2, 9});
        //1, 2, 3, 3, 4, 6, 7, 8, 9, 10
        for (int i = 0; i < 10; i++) {
            System.out.println(bubbles[i]);
        }
    }

    public static int[] bubbleSort(int[] array) {
        int min;
        //Переменная для отсекания отсортированного индекса отсортированного числа
        int j = 0;
        int k = 0;
        for (int i = array.length - 1; k <= array.length; i--) {
            if(j == array.length - 1) {
                j = 0;
                k++;
                i = array.length - 1;
            }

            if (array[i] < array[i - 1]) {
                min = array[i];
                array[i] = array[i - 1];
                array[i - 1] = min;
            }
            j++;
        }
        return array;
    }
}
