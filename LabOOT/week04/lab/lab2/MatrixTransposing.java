package week04.lab.lab2;
import java.util.Scanner;
public class MatrixTransposing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();
        int[][] matrixs = new int[rows][columns];

        System.out.print("Enter the matrix values: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrixs[i][j] = sc.nextInt();
            }
        }
        sc.close();

        System.out.println("The initial matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrixs[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] transposedMatrix = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix[j][i] = matrixs[i][j];
            }
        }

        System.out.println("The transposed matrix:");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposedMatrix[i][j] + "\t");
            }
            System.out.println();
        }
        
    }
}
