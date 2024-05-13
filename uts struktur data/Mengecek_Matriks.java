
package uts.struktur.data;

import java.util.Scanner;
public class Mengecek_Matriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriks = new int[3][3];

        System.out.println("Masukkan elemen-elemen matriks 3x3:");

        // Mengisi elemen-elemen matriks
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Masukkan elemen baris " + (i + 1) + " kolom " + (j + 1) + ": ");
                matriks[i][j] = input.nextInt();
            }
        }

        // Memeriksa apakah matriks adalah matriks identitas
        boolean isIdentitas = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j && matriks[i][j] != 1 || i != j && matriks[i][j] != 0) {
                    isIdentitas = false;
                    break;
                }
            }
        }

        // Menampilkan hasil
        if (isIdentitas) {
            System.out.println("Matriks tersebut adalah matriks identitas.");
        } else {
            System.out.println("Matriks tersebut bukan matriks identitas.");
        }
    }
}
