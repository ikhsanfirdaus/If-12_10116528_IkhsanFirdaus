/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5;

/**
 *
 * @author User
 */
public class Latihan5 {
       public static void main(String[] args) {
       JajarGenjang JG=new JajarGenjang();
        JG.JajarGenjang(50,60,70,80,100,120);
        Segitiga SG=new Segitiga();
        SG.segitiga(50,60,70,100,120);
         JG.HitungLuas();
         JG.HitungKeliling();
         SG.HitungLuas();
         SG.HitungKeliling();
    }
    
}
