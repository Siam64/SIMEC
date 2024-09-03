package com.hms.model;


public class PathologicalTest extends LabTest {
//    private String title;
//    private double cost;
//    private boolean isAvailable;
    private String reagent;
    
    // Constructor
    public PathologicalTest(String title, double cost, boolean isAvailable, String reagent) {
        this.title = title;
        this.cost = cost;
        this.isAvailable = isAvailable;
        this.reagent = reagent;
    }
    
   
    @Override
    public String toString() {
        String output = "Test name: " + this.title + "<br>" 
                      + "Cost: " + this.cost + "<br>" + "Availability: " + this.isAvailable + "<br>" + "Reagent: " + this.reagent;
        return output;
    }
    
    
    // Method to search for a test by title
//    public void search(String title) {
//        if (this.title.equals(title)) { // Use equals() for string comparison
//            System.out.println(ToString()); // Call the show method
//        } else {
//            System.out.println("Test not found.");
//        }
//    }

    @Override
    public void calcuateCost() {
    }
    
    @Override
    public void TestReport(){
    }
}
