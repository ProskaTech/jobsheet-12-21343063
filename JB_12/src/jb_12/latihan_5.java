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
interface AktivitasPagi{
    abstract void lari();
    
    abstract void berenang();
}
class AktivitasPagiAnak implements AktivitasPagi{
    @Override
    public void lari(){
        System.out.println("Aktivitas pertama pagi ini adalah lari pagi");
    }
    @Override
    public void berenang(){
        System.out.println("Aktivitas kedua pagi ini adalah berenang");
    }
}
public class latihan_5 {
    public static void main(String args[]){
        AktivitasPagiAnak a1 = new AktivitasPagiAnak();
        
        a1.lari();
        a1.berenang();
    }
}
