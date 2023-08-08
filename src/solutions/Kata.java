package solutions;
public class Kata {
    public static int[] countBy(int x, int n) {
        // N == LIMITE

        int countMultiplos = (n-x)+x;

        System.out.println(countMultiplos);
        int arr[] = new int[countMultiplos];
        int aux = 0;
        for (int i = 0; i < n; i++) {
            aux = x + aux;
            arr[i] = aux;
            System.out.println(arr[i]);
        }
        return arr;

    }

}
