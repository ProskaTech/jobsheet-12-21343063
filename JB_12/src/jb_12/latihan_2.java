/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jb_12;

/**
 *
 * @created by 21343063_Nurul Husna
 */

class CompileTime{
    static int keliling(int a){
        return 4 * a;
    }
    static int keliling(int L, int b){
        return 2 * (L + b);
    }
}
public class latihan_2 {
    public static void main(String[]args){
        System.out.println("Sisi persegi adalah : 4 \nkeliling persegi adalah : " + CompileTime.keliling(4)+ "\n");
        
        System.out.println("Sisi persegi panjang adalah : 10, 13\nKeliling persegi panjang adalah : "
                            + CompileTime.keliling(10, 13));
    }
}
