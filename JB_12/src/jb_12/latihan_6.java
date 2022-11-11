/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jb_12;

/**
 *
 * @created by 21343063_Nurul Husna
 */
public class latihan_6 {
    private String namaBuah;
    private String hargaBuah;
    private String warnaBuah;
    
    public latihan_6(String namaBuah, String hargaBuah, String warnaBuah){
        this.namaBuah = namaBuah;
        this.hargaBuah = hargaBuah;
        this.warnaBuah = warnaBuah;
    }
    public void setName(String namaBuah){
        this.namaBuah = namaBuah;
    }
    public void setPrice (String hargaBuah){
        this.hargaBuah = hargaBuah;
    }
    public void setColor(String warnaBuah){
        this.warnaBuah = warnaBuah;
    }
    public String getName(){
        return namaBuah;
    }
    public String getPrice(){
        return hargaBuah;
    }
    public String getColor(){
        return warnaBuah;
    }
    
}
