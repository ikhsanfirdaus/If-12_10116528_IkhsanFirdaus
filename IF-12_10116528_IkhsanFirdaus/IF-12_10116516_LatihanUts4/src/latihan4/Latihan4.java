/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author User
 */
public class Latihan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ModelEmploye ME=new ModelEmploye();
        ModelDesigner MD=new ModelDesigner();
        ModelProgramer MP=new ModelProgramer();
        ModelSystemAnalys MS=new ModelSystemAnalys();
        MD.BonusDesigner(50000);
        MP.BonusProgramer(60000);
        MS.BonusSystemAnaliyst(90000);

    }
 }
    

