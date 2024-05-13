
package uts.struktur.data;

import java.util.Scanner;
public class Mencetak_Elemen_Terbalik {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Masukkan elemen-elemen array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Array dalam urutan terbalik: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    } 
    }
    