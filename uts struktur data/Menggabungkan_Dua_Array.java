
package uts.struktur.data;

public class Menggabungkan_Dua_Array {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        int[] arrayGabungan = new int[array1.length + array2.length];

        int index = 0;

        // Menggabungkan array1 ke arrayGabungan
        for (int i = 0; i < array1.length; i++) {
            arrayGabungan[index++] = array1[i];
        }

        // Menggabungkan array2 ke arrayGabungan
        for (int i = 0; i < array2.length; i++) {
            arrayGabungan[index++] = array2[i];
        }

        // Menampilkan hasil penggabungan
        System.out.print("Array Gabungan: ");
        for (int i = 0; i < arrayGabungan.length; i++) {
            System.out.print(arrayGabungan[i] + " ");
        }
    }
}
