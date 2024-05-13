
package uts.struktur.data;


public class Menghapus_Duplikat {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int n = removeDuplicates(arr);
        
        // Mencetak array setelah menghapus duplikat
        System.out.print("Array setelah menghapus duplikat: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        
        return j + 1;
    }
}
