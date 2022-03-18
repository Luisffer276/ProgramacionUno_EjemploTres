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
public class Computer {
    /**
    *@author Luis Villagrán
    *@description
        Español: Encapsulado de variables
    */
    private String processor;
    private String videoCard;
    private String ram;
    private int Storage;
    private String sourcePower;
    private String graphicCard;
    private String cpu;
    private String motherboard;

    public Computer(String processor, String videoCard, String ram, int Storage, String sourcePower, String graphicCard, String cpu, String motherboard) {
        this.processor = processor;
        this.videoCard = videoCard;
        this.ram = ram;
        this.Storage = Storage;
        this.sourcePower = sourcePower;
        this.graphicCard = graphicCard;
        this.cpu = cpu;
        this.motherboard = motherboard;
    }
    /**
    *@author Luis Villagrán
    *@description 
    *    Español: Metodos sobre la clase Computer aplicando los "modificadores"
    *    Ingles: Methods on the Computer class applying the "modifiers"
    */
    public Computer() {
    }
    
    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return Storage;
    }

    public void setStorage(int Storage) {
        this.Storage = Storage;
    }

    public String getSourcePower() {
        return sourcePower;
    }

    public void setSourcePower(String sourcePower) {
        this.sourcePower = sourcePower;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }
    
    //tambien se puede utiizar la creacion del objeto StringBuilder()
    public String toString(Computer computer){
        System.out.println("*********   INFORMATION ABOUT THE COMPUTER   **********");
        System.out.println("this is the processor: " + computer.processor);
        System.out.println("video card name is: " + computer.videoCard);
        System.out.println("ram capacity is: " + computer.ram);
        System.out.println("this is storage: " + computer.Storage);
        System.out.println("the power source is: " + computer.sourcePower);
        System.out.println("the graphics card is: " + computer.graphicCard);
        System.out.println("this is the cpu: " + computer.cpu);
        System.out.println("the motherboard name is: " + computer.motherboard+"\n");
        return null;
    }
}
