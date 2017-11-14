/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if12_10116539_latihanuts5;

/**
 *
 * @author Amerigantini
 */
public class IF12_10116539_LATIHANUTS5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JajarGenjang j = new JajarGenjang(50, 60, 70, 80, 100, 120);
        Segitiga s = new Segitiga(50, 60, 70 , 100, 120);
        
        j.hitungKeliling();
        j.hitungLuas();
        s.hitungKeliling();
        s.hitungLuas();
    }
    
}
