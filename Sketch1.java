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

  PImage uwuBg;

  public void settings() {
    size(800, 800);
    uwuBg = loadImage("uwu.png");
  }


  public void setup() {
    //background(210, 255, 173);
    image(uwuBg, 0, 0);
  }


  public void draw() {
  for(row = 0; row < rowCount; row++){
    for(column = 0; column < colCount; column++){

      int boxX = (boxWidth * row);
      int boxY = (boxHeight * column);


      strokeWeight(10);
      noFill();
      rect(boxX,boxY,boxWidth,boxHeight);
    }
  }
  }
  
  public void keyPressed(){

    if (key == 'B'){

      backgroundCount++;
      if(backgroundCount>3){
        backgroundCount = 0;
      }

    }


  }
}
