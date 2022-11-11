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

class Bank{
    float sukuBunga(){
        return 0;
    }
}
class BRI extends Bank{
    float sukuBunga(){
        return 5.5f;
    }
}
class BNI extends Bank{
    float sukuBunga(){
        return 10.6f;
    }
}
class Mandiri extends Bank{
    float sukuBunga(){
        return 9.4f;
    }
}
public class latihan_3 {
    public static void main(String[]args){
        Bank B;
        B = new BRI();
        System.out.println("Tingkat suku bunga BRI adalah : "+ B.sukuBunga());
        B = new BNI();
        System.out.println("Tingkat suku bunga BNI adalah : "+ B.sukuBunga());
        B = new Mandiri();
        System.out.println("Tingkat suku bunga Mandiri adalah : "+ B.sukuBunga());
    }
}
