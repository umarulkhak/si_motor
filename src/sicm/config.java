/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sicm;

/**
 *
 * @author ULKHAK
 */
public class config {
        private final int id;
        private final String nama_cm;
        private final String basic_m;
        private final String add_tgl;
        private final String penger;
        private final float price;
        private final byte[] picture;
    
      
   public config(int Aid,String Anama_cm,String Abasic_m,String Aadd_tgl,String Apenger
                    ,float biaya, byte[] Pimg){
        this.id=Aid;
        this.nama_cm=Anama_cm;
        this.basic_m=Abasic_m;
        this.add_tgl=Aadd_tgl;
        this.penger=Apenger;
        this.price=biaya;
        this.picture=Pimg;
    }

    public int getId() {
        return id;
    }

    public String getNama_cm() {
        return nama_cm;
    }

    public String getBasic_m() {
        return basic_m;
    }

    public String getAdd_tgl() {
        return add_tgl;
    }

    public String getPenger() {
        return penger;
    }

    public float getPrice() {
        return price;
    }

    public byte[] getPicture() {
        return picture;
    }
   
    
}
