package Tugas;

import java.util.OptionalInt;

public class Perulangan {
    //disini saya menggunakan Perulangan For
    public static void main(String[] args) {
        int a,jml;
        jml=0;

        for(a=1; a<=200; a+=5)
        {
            jml=jml+a;
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.print("Total jumlah : "+jml);
    }
}
