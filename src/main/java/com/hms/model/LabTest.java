package com.hms.model;

   abstract class LabTest implements CostCalculation, TestReport{
    protected String title;
    protected double cost;
    protected boolean isAvailable;
   
   public LabTest(){
       
   } 
    // Constructor
    public LabTest(String title, double cost, boolean isAvailable) {
        this.title = title;
        this.cost = cost;
        this.isAvailable = isAvailable;
    }
    
    public String toString() {
        String output = "Test name: " + this.title + "<br>" 
                      + "Cost: " + this.cost + "<br>" + "Availability: " + this.isAvailable;
        return output;
    }
}
