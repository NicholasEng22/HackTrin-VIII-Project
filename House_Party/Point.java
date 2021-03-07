public class Point {

  /* Global Variables */
  private int x;
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

  /* Accessor Mehods */
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

  public int getDistance(Point p){
    double num = Math.sqrt((this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y));
    int num2 = (int)num;
    return num2;
  }

  /* Calculator Methods */

  public String toString() {
    return "x:" + this.x + " y:" + this.y;
  }
  public static void main(String args[]){
      Point p1 = new Point(2,3);
      Point p2 = new Point(-5,-9);
    System.out.println(p1.getDistance(p2));
  }
}
