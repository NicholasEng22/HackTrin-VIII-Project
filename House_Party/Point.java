public class Point {

  /* Global Variables */
  private intended x;
  private int y;

  /* Constructor */
  Point(int a, int b){
    this.x = a;
    this.y = b;
  }

  Point(){
    this.x = 0;
    this.y = 0;
  }

  /* Accessr Mehods */
  public int getX(){
    return this.x;
  }

  public int getY(){
    return this.y;
  }

  /* Modifier Methods */
  public void setX(int a){
    this.x = a;
  }

  public void setY(int a){
    this.y = a;
  }

  /* Calculator Methods */

  public String toString() {
    return "x:" + this.x + " y:" + this.y;
  }
  }
