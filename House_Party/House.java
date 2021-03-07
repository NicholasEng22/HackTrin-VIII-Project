//Can you see this?

import java.util.HashMap;

public class House {

/* Initialize Global Variables */

private int score;

private boolean isAvailable;
private double rentPrice;

/* Amenities */
private String description;
private boolean hasElevator;
private boolean hasRamp;
private boolean hasParking;

//Location and logistics
private int zipcode;
private int dFromWork;

/* Constructor */

public House(boolean a,double b, String h, boolean i, boolean j, int k, int l){
  this.isAvailable = a;
  this.description = h;
  this.hasElevator = i;
  this.hasRamp = j;
  this.zipcode = k;
  if(k == 10008 || k == 100015){
    this.zipcode = 10044;
  }
  this.dFromWork = l;
  this.rentPPrice = b;
}

public House(){
  this.isAvailable = true;
  this.rentPrice = 2000;
  this.description = "This is a dwelling.";
  this.hasElevator = true;
  this.hasRamp = true;
  this.hasParking = true;
  this.zipcode = 10025;
  this.dFromWork = 10;
}

public House(House h){
  this.isAvailable = h.getAvailability();
  this.rentPrice = h.getRent();
  this.description = h.getDescription();
  this.hasElevator = h.getElevator();
  this.hasRamp = h.getRamp();
  this.zipcode = h.getZipcode();
  this.dFromWork = h.getWork();
}


/* Accessor Methods */

public boolean getAvailability(){
  return this.isAvailable;
}

public double getRent(){
  return this.rentPrice;
}

public String getDescription(){
  return this.description;
}

public boolean getElevator(){
  return this.hasElevator;
}

public boolean getRamp(){
  return this.hasRamp;
}

public boolean getParking(){
  return this.hasParking;
}

public int getZipcode(){
  return (this.zipcode);
}

public int getWork(){
  return this.dFromWork;
}

/* Modifier Methods */

public void setAvailability(boolean a){
  this.isAvailable = a;
}

public void setRent(double a){
  this.rentPrice = a;
}

public void setDescription(String a){
  this.description = a;
}

public void setElevator(boolean a){
  this.hasElevator = a;
}

public void setRamp(boolean a){
  this.hasRamp = a;
}

public void setParking(boolean a){
  this.hasParking = a;
}

public void setZipcode(int a){
  this.zipcode = a;
}

public void setWork(int a){
  this.dFromWork = a;
}

/* Calculator Methods */

public int getScore(){

  if(this.getAvailability()==false){
    score = 0;
  }
  else if(this.getAvailability()==true){
  if(this.getElevator()==true){
    score++;
  }

  if(this.getRamp()==true){
    score++;
  }

  if(this.getParking()==true){
    score++;
  }
}
return score;
}


public int compareTo(House h){
  return (int)(this.getScore() - h.getScore());
}

public String toString(){
  return this.getScore()+"";
}

/* Helper Methods */

public static void generateMap(){
    HashMap<Integer, Point> zipcodes = new HashMap<Integer, Point>();

    HashMap<Point, Integer> zip = new HashMap<Point, Integer>();

    // Add keys and values (Country, City)
    Point origin = new Point();
    zipcodes.put(10000, origin); //Central Park
    Point p1 = new Point(0, 3);
    zipcodes.put(10128, p1);
    Point p2 = new Point (-3,3);
    zipcodes.put(10029, p2);
    Point p3 = new Point (-5,2);
    zipcodes.put(10035, p3);
    Point p4 = new Point (-4,-1);
    zipcodes.put(10026, p4);
    Point p5 = new Point (-6,-3);
    zipcodes.put(10027, p5);
    Point p6 = new Point (-2,-4);
    zipcodes.put(10025, p6);
    Point p7 = new Point (0,-5);
    zipcodes.put(10024, p7);
    Point p8 = new Point (2,-3);
    zipcodes.put(10023, p8);
    Point p9 = new Point (4,-2);
    zipcodes.put(10019, p9);
    Point p10 = new Point (6,-1);
    zipcodes.put(10036, p10);
    Point p11 = new Point (2,3);
    zipcodes.put(10021, p11);
    Point p12 = new Point (4,4);
    zipcodes.put(10022, p12);
    Point p13 = new Point (6,2);
    zipcodes.put(10017, p13);

    zip.put(origin, 10000); //Central Park
    zip.put(p1, 10128);
    zip.put(p2, 10029);
    zip.put(p3, 10035);
    zip.put(p4, 10026);
    zip.put(p5, 10027);
    zip.put(p6, 10025);
    zip.put(p7, 10024);
    zip.put(p8, 10023);
    zip.put(p9, 10019);
    zip.put(p10, 10036);
    zip.put(p11, 10021);
    zip.put(p12, 10022);
    zip.put(p13, 10017);
}

    public static void box(double x, double y, String score, String available, String price){ //Coordinate for center

      StdDraw.rectangle(x, y, 150, 100);

      StdDraw.setPenColor(StdDraw.BLACK);
      StdDraw.textLeft(x+150, y-75, "Accessibility Score: " + score);

      /*
      private int score;
      private boolean isAvailable;
      private double rentPrice;
      */

    }

  public static void main(String args[]){
    generateMap();
    House h1 = new House();
    System.out.println(h1.getScore());
  }

}
;
