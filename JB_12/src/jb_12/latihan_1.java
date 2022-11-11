/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jb_12;

/**
 *
 * created by 21343063_Nurul Husna
 */
class Kendaraan{
    double hargaDasar = 1000000;
    public void tampilkanHarga(){
        System.out.println("Harga kendaraan adalah Rp. "+hargaDasar);
    }
}
class RodaDua extends Kendaraan{
    double NaikHargaKe = 0.20;
    void hargaAkhir(){
        hargaDasar = hargaDasar + (hargaDasar * NaikHargaKe);
        System.out.println("Setelah dimodifikasi, harga sepeda menjadi Rp. "+hargaDasar);
    }
}
class RodaEmpat extends Kendaraan{
    double NaikHargaKe = 8;
    void hargaAkhir(){
        hargaDasar = hargaDasar + (hargaDasar * NaikHargaKe);
        System.out.println("Setelah dimodifikasi, harga sepeda menjadi Rp. "+hargaDasar);
    }
}
public class latihan_1 {
    public static void main(String[]args){
        RodaDua sepeda = new RodaDua();
        RodaEmpat mobil = new RodaEmpat();
        
        sepeda.tampilkanHarga();
        sepeda.hargaAkhir();
        
        mobil.tampilkanHarga();
        mobil.hargaAkhir();
    }
}
