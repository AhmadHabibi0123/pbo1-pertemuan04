package Tugas;

public class TugasArray {
    public static void main(String[] args) {
        int[][] angka = {
                {31,78},{56,21},
                {78,36},{97,18}
        };

        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
                System.out.print(angka[i][j]+"\t");
            }
            System.out.println();
        }
    }
}