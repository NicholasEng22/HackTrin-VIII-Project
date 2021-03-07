/**
*  The {@code Line} class provides a basic capability for
*  using Line objects in your programs.
*
*  <h1>Getting started.</h1>
*  To use this Line class, make sure it is in the same folder as the client code
*  <h2>Constructors</h2>
*  You can create a Line with the following method:
*  <ul>
*  <li> {@link #Line(double a, double b, double c)}
*  </ul>
*
*  <h2>Accessors</h2>
*  You can access Line data attributes with the following methods:
*  <ul>
*  <li> {@link #getSlope()}
*  <li> {@link #isOnLine(double x, double y)}
*  </ul>
**/
public class Line {
  private double a;
  private double b;
  private double c;
  private double x;
  private double y;
  /**
    * The standard constructor for class Line
    * @param a  an int value indicating the a value of a new Line equation
    * @param b an int value indicating the b value of a new Line equation
    * @param c an int value indicating the c value of a new Line equation
    */
  Line(double a, double b, double c){
    this.a = a;
    this.b = b;
    this.c = c;
  }
  /**
    * The Accessor method for the slope attribute of a Line
    * @return The slope of the line, a double value.
    *Test cases:
    *2,2
    *-2,2
    *3,2
    *-4,2
    */
  public double getSlope(){
    return (this.a*-1)/this.b;
  }
  /**
    * The Accessor method for the isOnLine attribute of a Line
    * @return Whether the point is on the line, a boolean value.
    *Test cases:
    *-2,0
    *-3,0
    *2,2
    *0,1
    */
  public boolean isOnLine(double x, double y){
    this.x = x;
    this.y = y;
    if((this.a*this.x) + (this.b*this.y) + this.c == 0){
      return true;
    }
    else{
      return false;
    }
  }
  /**
    * A main method is included for testing purposes
    *
    * @param args an array of String values taken from the command line
    */
    public static void main(String args[]){
         Line line1 = new Line(2,2,4);
         Line line2 = new Line(-2,2,0);
         Line line3 = new Line(3,2,4);
         Line line4 = new Line(-4,2,-4);
         assert line1.getSlope()==-1: "getSlope is not valid";
         assert line2.getSlope()==1: "getSlope is not valid";
         assert line3.getSlope()==-1.5: "getSlope is not valid";
         assert line4.getSlope()==2: "getSlope is not valid";
         assert line1.isOnLine(-2,0)==true: "isOnLine is not valid";
         assert line1.isOnLine(-3,0)==false: "isOnLine is not valid";
         assert line2.isOnLine(2,2)==true: "isOnLine is not valid";
         assert line2.isOnLine(0,1)==false: "isOnLine is not valid";
         System.out.println("All tests pass!!!");
    }
  }
