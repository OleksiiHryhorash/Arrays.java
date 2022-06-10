public class Arrays {
    static void classic(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "; ");
        }
        System.out.println();
    }
    static void myReverse(int[] array){
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + "; ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Масив до обробки:");
        classic(arr);
        System.out.println("Масив після обробки:");
        myReverse(arr);
    }
}
