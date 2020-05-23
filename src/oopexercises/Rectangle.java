/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopexercises;

/**
 *
 * @author cacousins
 */
public class Rectangle {
   
    private double length;
    private double width;
    private String colour;
    private static int uniqueID;

    public Rectangle() {
    this.length = 5.0;
    this.width = 3.0;
    this.colour = "green";
    this.uniqueID++;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        this.colour = "purple";
        this.uniqueID++;
    }

    public Rectangle(double length, double width, String colour) {
        this.length = length;
        this.width = width;
        this.colour = colour;
        this.uniqueID++;
    }

    /*
    Method Name: getArea
    Purpose:    to determine the area of a rectangle
    Accepts:    nothing
    Returns:    double
     */
    public double getArea() {
        return this.length * this.width;
    }

    /*
    Method Name: getPerimeter
    Purpose:    to determine the perimeter of a rectangle
    Accepts:    nothing
    Returns:    double
     */
    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }

    /*
    Method Name: describeRectangle
    Purpose:    provides information about our rectangle
    Accepts:    nothing
    Returns:    void
     */
    public void describeRectangle() {
        System.out.println("The colour of the rectangle is : " + this.colour);
        System.out.println("The length of the rectangle is " + this.length + "\n" + 
                ", its width is " + this.width + " its area is " +  getArea() + "\n"
        + " and its perimeter is " + getPerimeter()); 
    }
    
   public String generateColour(){
       String[] colourArray = {"blue" , "green" , "orange" , "firebrick", 
           "coral" , "ivory", "yellow" , "pink" , "black"};
       int selection = (int)(Math.random() * colourArray.length);
       return colourArray[selection];
   } 

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
     public static int getUniqueID() {
        return uniqueID;
    }

    public static void setUniqueID(int aUniqueID) {
        uniqueID = aUniqueID;
    }

   
   

}
