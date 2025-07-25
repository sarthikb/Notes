/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complete_builder_example;

import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author betha
 */
public class Kitchen {
    
    private Dimension dimensions;
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean hasDishwasher;
    private boolean hasMicrowave;
    
    public Kitchen(Dimension dimensions, int ceilingHeight, int floorNumber, Color wallColor, int numberOfWindows, int numberOfDoors, boolean hasDishwasher, boolean hasMicrowave){
        this.dimensions = dimensions;
        this.ceilingHeight = ceilingHeight;
        this.floorNumber = floorNumber;
        this.wallColor = wallColor;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;        
        this.hasDishwasher = hasDishwasher;
        this.hasMicrowave = hasMicrowave;        
    }
}
