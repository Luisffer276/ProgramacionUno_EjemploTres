/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotres;

/**
 *
 * @author Luisf
 */
public class EjemploTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * @author Luis Villagrán
         * @description 
         *      Español: Creación de objeto para la clase "Computer"
         *      Ingles: Create object for class "Computer"
         */
        //Computer computer = new Computer("Intel","Asus GeForce GT 1030 2GB GDDR5","16GB", 250, "Seasonic PRIME Series.", "NVIDIA", "Qualcomm.", "Biostar");
        //computer.toString(computer);
        /**
         * @author Luis Villagrán
         * @description 
         *      Español: Creación de objeto para la clase "Laptops"
         *      Ingles: Create object for class "Laptops"
         */
        Laptops laptops = new Laptops("Intel","Asus GeForce GT 1030 2GB GDDR5","16GB", 250, "Seasonic PRIME Series.", "NVIDIA", "Qualcomm.", "Biostar","15.7 Pulgadas", "Razer", " VicTsing");
        laptops.toString(laptops);
        //computer.toString(computer);
        /**
         * @author Luis Villagrán
         * @description 
         *      Español: Creación de objeto para la clase "SmartPhone"
         *      Ingles: Create object for class "SmartPhone"
         */
        SmartPhone smart = new SmartPhone ("IBM","MSI GeForce GT710 2GB DDR3","36GB", 250, "Cooler Master MasterWatt Maker 1200 MiJ", "NVIDIA", "TSMC", "Lenovo","OLED", "Cámara de profundidad.", 45616, "Batería NiCd");
        smart.toString(smart);
    }
    
}
