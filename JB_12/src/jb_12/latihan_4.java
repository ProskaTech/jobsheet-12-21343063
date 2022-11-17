/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jb_12;

/**
 *
 * @Created by 21343063_Nurul Husna
 */
abstract class orang{
    public String namaAyah = "Randi Proska";
    abstract void makan();
    public void minum(){
        System.out.println("Minum Air Teh dan Kopi");
    }
}
class anakUmur1Tahun extends orang{
    public void namaAyahku(){
        System.out.println("Nama Ayahku adalah "+namaAyah);
    }
    @Override
    public void makan(){
        System.out.println("Anak umur 1 tahun makan ASI");
    }
    @Override
    public void minum(){
        System.out.println("Anak umur 1 tahun minum ASI");
    }
}
public class latihan_4 {
    public static void main (String args[]){
        anakUmur1Tahun a1 = new anakUmur1Tahun();
        
        a1.makan();
        a1.minum();
        a1.namaAyahku();
        System.out.println();
    }
}
