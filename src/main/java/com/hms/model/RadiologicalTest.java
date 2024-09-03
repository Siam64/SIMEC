package com.hms.model;
public class RadiologicalTest extends LabTest {
    
//    private String title;
//    private double cost;
//    private boolean isAvailable;
    private String imageDim;
    
    // Constructor
    public RadiologicalTest(String title, double cost, boolean isAvailable, String imageDim) {
        this.title = title;
        this.cost = cost;
        this.isAvailable = isAvailable;
        this.imageDim = imageDim;
    }
    
    @Override
    public String toString() {
        String output = "Test name: " + this.title + "<br>" 
                      + "Cost: " + this.cost + "<br>" + "Availability: " + this.isAvailable + "<br>" + "Image: " + this.imageDim;
        return output;
    }

    @Override
    public void calcuateCost() {
     
    }
    
    @Override
    public void TestReport(){
    }
    
    
}
