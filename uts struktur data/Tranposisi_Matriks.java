
package uts.struktur.data;


public class Tranposisi_Matriks {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] transpose = new int[3][3];

        // Melakukan transpose matriks
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Menampilkan matriks awal
        System.out.println("Matriks awal:");
        printMatrix(matrix);

        // Menampilkan matriks transpose
        System.out.println("\nMatriks transpose:");
        printMatrix(transpose);
    }

    // Metode untuk menampilkan matriks
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
                }
            System.out.println();
        }
    }
}

