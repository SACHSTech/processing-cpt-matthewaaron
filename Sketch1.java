import processing.core.PApplet;
import processing.core.PImage;

public class Sketch1 extends PApplet {
	
	int row = 0;
  int column = 0;

  int rowCount = 3;
  int colCount = 3;

  int boxWidth = 200;
  int boxHeight = 200;

  int backgroundCount = 0;

  boolean exWin = false;
  boolean ohWin = false;
  int blooWincounter = 0;
  int greenWincounter = 0;
  String blooWinStatement = "Blue Wins: ";
  String greenWinStatement = "Green Wins: ";

  PImage uwuBg;
  PImage pain;
  PImage cart;


  public void settings() {
    size(800, 800);
    uwuBg = loadImage("uwu.png");
    pain = loadImage("pain.png");
    cart = loadImage("cart.png");
  }


  public void setup() {
    //background(210, 255, 173);
    
  }


  public void draw() {
    
    if(backgroundCount == 0){
      image(pain, 0, 0);
    }
    if(backgroundCount == 1){
      image(cart, 0, 0);
    }
    if(backgroundCount == 2){
      image(uwuBg,0,0);
    }
    winCounter();
  for(row = 0; row < rowCount; row++){
    for(column = 0; column < colCount; column++){

      int boxX = (boxWidth * row);
      int boxY = (boxHeight * column);

      stroke(255,0,0);
      strokeWeight(10);
      noFill();
      rect(boxX,boxY,boxWidth,boxHeight);
    }
  }
  }
  
  public void keyPressed(){

    if (key == 'b'){

      backgroundCount++;
      System.out.println(backgroundCount);
      if(backgroundCount>=3){
        backgroundCount = 0;
      }

    }


  }

  public void winCounter(){


    textSize(50);
    fill(255,0,0);
    text(blooWinStatement,0,700);
    if(exWin = true){

    }
    textSize(50);
    fill(255,0,0);
    text(greenWinStatement,0,750);
    if(ohWin = true){

    }

  }
}
