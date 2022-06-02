import processing.core.PApplet;
import processing.core.PImage;

public class Sketch2 extends PApplet {
	
  int row = 0;
  int column = 0;

  int rowCount = 3;
  int colCount = 3;

  int boxWidth = 200;
  int boxHeight = 200;

  int backgroundCount = 0;

  boolean blueTrue = false;
  boolean greenTrue = false;


  boolean exWin = false;
  boolean ohWin = false;
  int exWincounter = 0;
  int ohWincounter = 0;
  String exWinStatement = "X Wins: ";
  String ohWinStatement = "O Wins: ";

  PImage uwuBg;
  PImage pain;
  PImage cart;
  PImage OImage;
  PImage XImage;
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 800);
    uwuBg = loadImage("uwu.png");
    pain = loadImage("pain.png");
    cart = loadImage("cart.png");
    OImage = loadImage("O.png");
    XImage = loadImage("x.png");
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    //background(210, 255, 173);
  }

  public void mousePressed() {
    fill(0, 255, 0);
    ellipse(mouseX, mouseY, 50, 50);
  }
  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
  if(backgroundCount == 0){
    image(pain, 0, 0);
  }
  if(backgroundCount == 1){
    image(cart, 0, 0);
  }
  if(backgroundCount == 2){
    image(uwuBg,0,0);
  }
for(row = 0; row < rowCount; row++){
  for(column = 0; column < colCount; column++){

    int boxX = (boxWidth * row);
    int boxY = (boxHeight * column);

    stroke(255,0,0);
    strokeWeight(10);
    rect(boxX,boxY,boxWidth,boxHeight);
  }
}
if (mousePressed){
  greenTrue = true;


  if greenTrue = true{
    fill(23, 45, 34);
  }
  

}
  
  }

  public void mouseClicked(){
        textSize(144);
        text(key , 190, 180);
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

  
  // define other methods down here.
}
