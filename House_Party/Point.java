public class Point {

  /* Global Variables */
  private double x;
  private double y;

  /* Constructor */
  Point(double a, double b){
    this.x = a;
    this.y = b;
  }

  Point(){
    this.x = 0;
    this.y = 0;
  }

  /* Accessr Mehods */
  public double getX(){
    return this.x;
  }

  public double getY(){
    return this.y;
  }

  /* Modifier Methods */
  public void setX(double a){
    this.x = a;
  }

  public void setY(double a){
    this.y = a;
  }

  /* Calculator Methods */

  public String toString() {
    return "x:" + this.x + " y:" + this.y;
  }
  }
