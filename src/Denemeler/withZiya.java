package Denemeler;

public class withZiya {
    public static void main(String[] args) {
        int[] arr1= {4, 9, 1, 3, 6, 4};
        findBalance(arr1);
        int[] arr2={1,2,3,4,5,6,7,8};
        findBalance(arr2);
    }
    public static void findBalance(int[] arr){

        for (int i = 1; i < arr.length - 1; i++) {
            if (leftsum(arr, i) == rightsum(arr, i)) {
                System.out.println(i);
            }
        }
        return ;
    }

    public static int leftsum(int[] arr, int point) {
        int sum = 0;
        for (int i = 0; i < point; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int rightsum(int[] arr, int point) {
        int sum = 0;
        for (int i = point + 1; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}