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
public class Laptops extends Computer{
    /**
    *@author Luis Villagrán
    *@description
        Español: Encapsulado de variables
    */
    private String screen;
    private String keyboard;
    private String mousePad;

    public Laptops(String processor, String videoCard, String ram, int Storage, String sourcePower, String graphicCard, String cpu, String motherboard,String screen, String keyboard, String mousePad) {
        super(processor, videoCard, ram, Storage, sourcePower, graphicCard, cpu, motherboard);
        this.screen = screen;
        this.keyboard = keyboard;
        this.mousePad = mousePad;
    }
    
    public Laptops() {
    
    }
    /**
    *@author Luis Villagrán
    *@description 
    *    Español: Metodos sobre la clase Laptops aplicando los "modificadores"
    *    Ingles: Methods on the Laptops class applying the "modifiers"
    */
    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getMousePad() {
        return mousePad;
    }

    public void setMousePad(String mousePad) {
        this.mousePad = mousePad;
    }
    
    //tambien se puede utiizar la creacion del objeto StringBuilder()
    public String toString(Laptops laptops){
        super.toString(laptops);
        System.out.println("*********   INFORMATION ABOUT THE LAPTOPS   **********");
        System.out.println("this is the screen size: " + laptops.screen);
        System.out.println("the name of the keyboard is: " + laptops.keyboard);
        System.out.println("the mousePad is of type: " + laptops.mousePad+"\n"+"\n");
        return null;
    }
}
