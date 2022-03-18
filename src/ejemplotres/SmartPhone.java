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
public class SmartPhone extends Computer{
   /**
    *@author Luis Villagrán
    *@description
        Español: Encapsulado de variables
    */
    private String screen;
    private String camera;
    private int gps;
    private String battery;

    public SmartPhone(String processor, String videoCard, String ram, int Storage, String sourcePower, String graphicCard, String cpu, String motherboard, String screen, String camera, int gps, String battery) {
        super(processor, videoCard, ram, Storage, sourcePower, graphicCard, cpu, motherboard);
        this.screen = screen;
        this.camera = camera;
        this.gps = gps;
        this.battery = battery;
    }

    public SmartPhone() {
    }
    /**
    *@author Luis Villagrán
    *@description 
    *    Español: Metodos sobre la clase SmartPhone aplicando los "modificadores"
    *    Ingles: Methods on the SmartPhone class applying the "modifiers"
    */
    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public int getGps() {
        return gps;
    }

    public void setGps(int gps) {
        this.gps = gps;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }
    
    //tambien se puede utiizar la creacion del objeto StringBuilder()
    public String toString(SmartPhone smart){
        super.toString(smart);
        System.out.println("*********   INFORMATION ABOUT THE SMARTPHONE   **********");
        System.out.println("this is the screen type: " + smart.screen);
        System.out.println("the type of camera is: " + smart.camera);
        System.out.println("gps range is: " + smart.gps);
        System.out.println("the battery is: " + smart.battery+"\n");
        return null;
    }
    
    
}
