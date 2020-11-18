/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umurbarangantik;

/**
 *
  @author Megianto Adi saputra
 Nama         : Megianto Adi Saputra
 Kelas        : IF-2
 NIM          : 10119060
 Deskripsi    : Program Barang Antik
 */
public class UmurBarangAntik {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Radio objRadio = new Radio(234);
        objRadio.setName("Radio AM");
        
        System.out.println("Nama Barang Antik : "+objRadio.getName());
        objRadio.tampilUmur();
    }
    
}
