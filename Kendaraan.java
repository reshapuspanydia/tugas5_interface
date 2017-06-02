/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Respus
 */
interface Kendaraan {
    public String jenis = "Mini Bus";
    public string merk ="Nissan";
    
/*inisiasi interface
*/
Kendaraan kn = new Kendaraan();
  }
}

/* variabel static
*/
public static void main (String[] args) {
Mobil mb = new Mobil();
    mb.Jenis;
    mb.Merk;
}

/* implement abstrak ke interface
*/
public abstract class Mobil implements Kendaraan {
    protected String getJenis(){
        return jenis;
    }
}

/* interface dapat mengextends lebih dari satu interface
*/
public interface Kendaraan extends Mobil, Sepeda_motor, Becak, Bemo {
}