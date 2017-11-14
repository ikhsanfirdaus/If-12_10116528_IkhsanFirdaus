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
public class JajarGenjang implements BangunDatar{
    private int luas,keliling;
    private int sisiAb,sisiBc,sisiCd,sisiDa,alas,tinggi;
    public void JajarGenjang(int ab,int bc,int cd,int da,int alas,int tinggi){
    this.sisiAb=ab;
    this.sisiBc=bc;
    this.sisiCd=cd;
    this.sisiDa=da;
    this.alas=alas;
    this.tinggi=tinggi;

        }
    public void HitungLuas(){
    luas=alas*tinggi;
    System.out.println("luas jajar genjang  ="+luas);

    }
    public void HitungKeliling(){
    keliling=sisiAb+sisiBc+sisiCd+sisiDa;
    System.out.println("keliling jajar genjang  ="+keliling);

}

    @Override
    public void hitungLuas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hitungKeliling() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

