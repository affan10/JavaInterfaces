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
public class MicrosoftSurface implements Computer, Machine {
    protected
            double windowsVersion;
    
    public MicrosoftSurface() {
    }

    public MicrosoftSurface(double windowsVersion) {
        this.windowsVersion = windowsVersion;
    }
    
    @Override
    public void start() {
        System.out.println("Starting Microsoft Surface...");
    }
    
    @Override
    public void shutdown() {
        System.out.println("Shutting down Microsoft Surface...");
    }
    
    @Override
    public void runProgram() {
        System.out.println("Microsoft Surface Running Program...");
    }
    
    @Override
    public void sleep() {
        System.out.println("Microsoft Surface going to sleep...");
    }
    
    void setWindowsVersion(double windowsVersion) {
        System.out.println("Microsoft Surface Setting Windows Version...");
        this.windowsVersion = windowsVersion;
    }
    
    double getWindowsVersion() {
        System.out.println("Microsoft Surface getting Windows Version...");
        return this.windowsVersion;
    }
}
