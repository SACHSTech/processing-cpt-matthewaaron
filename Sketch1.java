import processing.core.PApplet;

public class Sketch1 extends PApplet {
	
	int row = 0;
  int column = 0;

  int rowCount = 3;
  int colCount = 3;

  int boxWidth = 200;
  int boxHeight = 200;

  public void settings() {

    size(400, 400);
  }


  public void setup() {
    background(210, 255, 173);
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
  
  // define other methods down here.
}
