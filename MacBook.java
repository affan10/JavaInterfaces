/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction;
/**
 *
 * @author AFFAN
 */
public class MacBook implements Computer {
    protected
            int RAM;
            int storage;
            String manufacturerName;

    public MacBook() {
    }

    public MacBook(int RAM, int storage, String manufacturerName) {
        this.RAM = RAM;
        this.storage = storage;
        this.manufacturerName = manufacturerName;
    }
    
    @Override
    public void start() {
        System.out.println("Starting MacBook...");
    }
    
    @Override
    public void shutdown() {
        System.out.println("Shutting down MacBook...");
    }
    
    @Override
    public void runProgram() {
        System.out.println("MacBook Running Program...");
    }
    
    void setRAM(int RAM) {
        System.out.println("MacBook Setting RAM...");
        this.RAM = RAM;
    }
    
    void setStorage(int storage) {
        System.out.println("MacBook Setting Storage...");
        this.storage = storage;
    }
    
    void setManufacturerName(String manufacturerName) {
        System.out.println("MacBook Setting Manufacturer Name...");
        this.manufacturerName = manufacturerName;
    }
    
    int getRAM() {
        System.out.println("Getting RAM from MacBook...");
        return this.RAM;
    }
    
    int getStorage() {
        System.out.println("Getting Storage from MacBook...");
        return this.storage;
    }
    
    String getManufacturerName() {
        System.out.println("Getting Manufacturer Name from MacBook...");
        return this.manufacturerName;
    }
}
