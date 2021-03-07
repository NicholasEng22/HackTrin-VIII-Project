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
 String description = JOptionPane.showInputDialog(a,"Description?");
 houses.add( new House(true,Double.parseDouble(rentPrice), description, (hasElevator == "y")? true:false, (hasRamp == "y")? true:false, 10021,10.0));
}
else if(str.charAt(0) == 'n'){
  JOptionPane.showMessageDialog(a,"Ok smh");
}
else{
  Object [] Array = houses.toArray();
  House [] housesArray = new House[Array.length];
  for(int i = 0; i < Array.length; i++){
    housesArray[i] = new House((House) Array[i]);
  }
  int[] housesScore = new int[houses.size()];
  for(int i = 0; i < houses.size(); i++){
    housesScore[i] = housesArray[i].getScore();
  }
  MergeSort ob = new MergeSort();
  ob.sort(housesScore,0,houses.size()-1);

for(int i = 0; i < houses.size(); i++){
  int score = housesScore[i];
  for(int j = i+1; j < houses.size(); j++){
    House house = new House();
    if(score == housesArray[j].getScore()){
      house = new House(housesArray[i]);
      housesArray[i] = new House(housesArray[j]);
      housesArray[j] = new House(house);
    }
  }
}//end for loop

for(int i = 0; i < houses.size(); i++){
  housesArray[i].box((50 + 170*(i%5)), 500-100*(Math.floor(i/5)));
}
}
}

  }//main
}//class
