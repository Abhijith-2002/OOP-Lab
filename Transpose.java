import java.util.*;
public class Transpose {
    public static void main(String[] args) {
        int m, n, temp;
        int[][] a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of the matrix:");
        m = sc.nextInt();
        System.out.println("Enter the number of columns of the matrix:");
        n = sc.nextInt();
        a = new int[m][n];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int[][] transposedMatrix = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposedMatrix[j][i] = a[i][j];
            }
        }
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}