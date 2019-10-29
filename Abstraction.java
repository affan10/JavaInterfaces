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
public class Abstraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MacBook testMacBook = new MacBook(8, 128, "Apple");
        testMacBook.setRAM(16);
        System.out.println(testMacBook.getRAM());
        testMacBook = new MacBookPro(true, 4, 256, "Apple");
        testMacBook.setRAM(32);
        System.out.println(testMacBook.getRAM());
        
        MicrosoftSurface testSurface = new MicrosoftSurface(10.1);
        testSurface.setWindowsVersion(8.1);
        System.out.println(testSurface.getWindowsVersion());
        testSurface.sleep();
    }
    
}
