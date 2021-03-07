import java.util.*;
import java.lang.*;
import javax.swing.*;

public class main{


  public static void main(String [] args){
   JFrame a = new JFrame();
    StdDraw.setCanvasSize(900, 600);
    StdDraw.setXscale(0,900);
    StdDraw.setYscale(0,600);
    StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
    StdDraw.rectangle(70,585,70,15);
    StdDraw.setPenColor(StdDraw.BLACK);
    StdDraw.text(70,585,"Input new House");
    House.box(300, 400, "test", "test","test");
    String zipcodeW = JOptionPane.showInputDialog(a,"What is the zipcode of your workplace?");



ArrayList houses = new ArrayList<House>();
while(true){
String str = "0";
if(StdDraw.mousePressed() && (StdDraw.mouseX() > 0 && StdDraw.mouseX() < 140 && StdDraw.mouseY() >570 && StdDraw.mouseY() <600)){
  str = JOptionPane.showInputDialog(a,"Do you want to input information for an apartment?(y/n)");
  JOptionPane.showMessageDialog(a, "Please adhere to the instructions or there could be incorrect data.");
  System.out.println(str);
}

if(str.charAt(0) == 'y'){
 String rentPrice = JOptionPane.showInputDialog(a,"What is the rent price?(Just the number please)");
 String hasElevator = JOptionPane.showInputDialog(a,"Does the apartment have an elevator?(y/n)");
 String hasRamp = JOptionPane.showInputDialog(a,"Does the apartment have a ramp?(y/n)");
 String hasParking = JOptionPane.showInputDialog(a,"Does the apartment have available parking?(y/n)");
 String zipcode = JOptionPane.showInputDialog(a,"What is the zipcode of the apartment?");
 String zipcode2 = JOptionPane.showInputDialog(a,"What is the zipcode of your workplace?");
 String description = JOptionPane.showInputDialog(a,"Description?");

 /* Creates a Hashmap of zipcode values*/

 HashMap<Integer, Point> zipcodes = new HashMap<Integer, Point>();
 HashMap<Point, Integer> zip = new HashMap<Point, Integer>();

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

 Point pt1 = zipcodes.get(Integer.parseInt(zipcode));
 Point pt2 = zipcodes.get(Integer.parseInt(zipcode2));
 System.out.println(pt1.getDistance(pt2));
 houses.add(House(true,Double.parseDouble(rentPrice), description, (hasElevator == "y")? true:false, (hasRamp == "y")? true:false, Integer.parseInt(zipcode), pt1.getDistance(pt2)));
}
else if(str.charAt(0) == 'n'){
  JOptionPane.showMessageDialog(a,"Ok smh");
}

else{
  int[] housesScore = new int[houses.size()];
  for(int i = 0; i < houses.size(); i++){
   housesScore[i] = houses[i].getScore();
  }
  MergeSort ob = new MergeSort();
  ob.sort(housesScore,0,houses.size()-1); //array to sort, start, end, sorts housesScore

  //ArrayList houses = new ArrayList<House>();
}
}

  }//main
}//class
