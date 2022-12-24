import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Write the size of arrays");
        int n = keyboard.nextInt();
        int[][] array1 = randomizer(n);
        System.out.println("First randomized array");
        System.out.println(Arrays.deepToString(array1));
        int[][] array2 = randomizer(n);
        System.out.println("Second randomized array");
        System.out.println(Arrays.deepToString(array2));
        System.out.println("The sum of randomized arrays");
        System.out.println(Arrays.deepToString(summizer(n, array1, array2)));
    }

    public static int[][] randomizer(int n) {
        Random random = new Random();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
        return array;
    }
    public static int[][] summizer(int n, int array1[][], int array2[][]){
        int[][] array3 = new int[n][n];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array3[i][j] = array1[i][j] + array2[i][j];
            }
        }
        return(array3);
    }
}
