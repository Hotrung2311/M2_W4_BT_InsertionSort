import java.util.Arrays;

public class InsertionClass {
    static public double[] list = {22, 1, 6, 3, 8, 9};

    static public void insertionSort(double[] arr) {
        System.out.println("Input:");
        System.out.println(Arrays.toString(list));
        System.out.println("------------------------------------------------------------------------");
        for (int i = 1; i < arr.length; i++) {
            System.out.print("Step " + i+1 +": ");
            double temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > arr[i]) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
            System.out.println(Arrays.toString(list));
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Result:");
        System.out.println(Arrays.toString(list));
    }
}
