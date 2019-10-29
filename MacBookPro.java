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
public class MacBookPro extends MacBook {
    protected
            boolean touchBar;

    public MacBookPro() {
    }

    public MacBookPro(boolean touchBar, int RAM, int storage, String manufacturerName) {
        super(RAM, storage, manufacturerName);
        this.touchBar = touchBar;
    }
    
    @Override
    public void start() {
        System.out.println("Starting MacBook Pro...");
    }
    
    @Override
    public void shutdown() {
        System.out.println("Shutting down MacBook Pro...");
    }
    
    @Override
    public void runProgram() {
        System.out.println("MacBook Pro Running Program...");
    }
    
    @Override
    void setRAM(int RAM) {
        System.out.println("MacBook Pro Setting RAM...");
        this.RAM = RAM;
    }
    
    @Override
    void setStorage(int storage) {
        System.out.println("MacBook Pro Setting Storage...");
        this.storage = storage;
    }
    
    @Override
    void setManufacturerName(String manufacturerName) {
        System.out.println("MacBook Pro Setting Manufacturer Name...");
        this.manufacturerName = manufacturerName;
    }
    
    void setTouchBar(boolean touchBar) {
        System.out.println("Setting touchBar in Macbook Pro...");
        this.touchBar = touchBar;
    }
    
    @Override
    int getRAM() {
        System.out.println("Getting RAM from MacBook Pro...");
        return this.RAM;
    }
    
    @Override
    int getStorage() {
        System.out.println("Getting Storage from MacBook Pro...");
        return this.storage;
    }
    
    @Override
    String getManufacturerName() {
        System.out.println("Getting Manufacturer Name from MacBook Pro...");
        return this.manufacturerName;
    }
    
    boolean isTouchBar() {
        System.out.println("Checking if MacBook Pro has touchBar...");
        return this.touchBar;
    }
}
