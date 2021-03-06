import processing.core.PApplet;
import processing.core.PImage;

public class Sketch2 extends PApplet {
	
	int row = 0;
  int column = 0;

  int rowCount = 3;
  int colCount = 3;

  int boxWidth = 200;
  int boxHeight = 200;

  int rowBoxCount = 0;
  int rowCont = 0;

  int backgroundCount = 0;
  String bgHelp = "B to change Background";

  int gridFull = 0;

  boolean blooWin = false;
  boolean greenWin = false;
  int blooWincounter = 0;
  int greenWincounter = 0;
  String blooWinStatement = "Blue Wins: ";
  String greenWinStatement = "Green Wins: ";
  String winnerBloo = "Blue Wins! (^O^)／";
  String winnerGreen = "Green Wins! (^O^)／";
  boolean win = false;
  boolean winStatement = false;
  boolean turn = false;
  String clearText = "Space to Clear";
  boolean isFull = false;
  String tie ="Tie （●｀ε´●）";
  boolean winnerPlus = false;

  PImage uwuBg;
  PImage pain;
  PImage cart;

  int [][] intGrid;

  /**
  * Called once at the beginning of execution, put your size all/ loading images in this method
  */
  public void settings() {
    size(800, 800);
    uwuBg = loadImage("uwu.png");
    pain = loadImage("pain.png");
    cart = loadImage("cart.png");
  }

/**
  * Called once at the beginning of execution.  Add initial set up
  * values here i.e background, stroke, fill etc.
  */
  public void setup() {
    intGrid = new int[rowCount][colCount];
    for(int x = 0; x < rowCount; x++){
      for(int y = 0; y < colCount; y++){
        intGrid[x][y] = 0;
      
      
    }
  }
}
/**
  * Called repeatedly, anything drawn to the screen goes here
  */

  public void draw() {

    if(backgroundCount == 2){
      image(pain, 0, 0);
    }
    if(backgroundCount == 1){
      image(cart, 0, 0);
    }
    if(backgroundCount == 0){
      image(uwuBg,0,0);
    }
    winCounter();
    
    textSize(25);
    fill(255,0,0);
    text(bgHelp,527,800);
    
    textSize(25);
    fill(255,0,0);
    text(clearText,527,775);
  
  for(row = 0; row < rowCount; row++){
    for(column = 0; column < colCount; column++){

      for(row = 0; row < rowCount; row++){
        for(column = 0; column < colCount; column++){
    
          int boxX = (boxWidth * row);
          int boxY = (boxHeight * column);
    
          stroke(255,0,0);
          strokeWeight(10);
          
    
          if(intGrid[column][row] == 2){
            fill(0,0,255);
            rect(boxX,boxY,boxWidth,boxHeight);
          }
          if(intGrid[column][row] == 1){
            fill(0,255,0);
            rect(boxX,boxY,boxWidth,boxHeight);
          }
          if(intGrid[column][row] == 0){
 
            noFill();
            rect(boxX,boxY,boxWidth,boxHeight);
          }
        
        }
      }
    }
        
      }
      
  }
  /**
   * Detects if a key is pressed and trigger the code that the key is assinged to
   */
  public void keyPressed(){

    if (key == 'b'){

      backgroundCount++;
      if(backgroundCount>=3){
        backgroundCount = 0;
      }

    }

  //  Developer Hotkey
  //if (key == 'l'){

    //  win = true;
   //   blooWin = true;

    //}

    if (keyCode == ' '){
      if (win == true){
      intGrid[0][0] = 0;
      intGrid[0][1] = 0;
      intGrid[0][2] = 0;
      intGrid[1][0] = 0;
      intGrid[1][1] = 0;
      intGrid[1][2] = 0;
      intGrid[2][0] = 0;
      intGrid[2][1] = 0;
      intGrid[2][2] = 0;
      
      win = false;
      blooWin = false;
      greenWin = false;
      gridFull = 0;
      winnerPlus = false;
      
      }
      if (win == false && gridFull >= 9){
          intGrid[0][0] = 0;
          intGrid[0][1] = 0;
          intGrid[0][2] = 0;
          intGrid[1][0] = 0;
          intGrid[1][1] = 0;
          intGrid[1][2] = 0;
          intGrid[2][0] = 0;
          intGrid[2][1] = 0;
          intGrid[2][2] = 0;
        
        win = false;
        blooWin = false;
        greenWin = false;
        gridFull = 0;
        winnerPlus = false;
        
        
        }


    }

    
  }
  /**
   * Check if green has 3 in a column and sets win condition
   */
  public void greenCols(){
    if (intGrid[0][0] == 1 && intGrid[0][1] == 1 && intGrid[0][2] == 1 && winnerPlus == false) {
      win = true;
      greenWin = true;
      winnerPlus = true;

      if(winnerPlus == true){
      greenWincounter+=1;
      gridFull = 9;
      }
  }
  if (intGrid[1][0] == 1 && intGrid [1][1] == 1 && intGrid[1][2] == 1 && winnerPlus == false){
    win = true;
    greenWin = true;
    winnerPlus = true;

    if(winnerPlus == true){
    greenWincounter+=1;
    gridFull = 9;
    }
  }
  if (intGrid[2][0] == 1 && intGrid [2][1] == 1 && intGrid[2][2] == 1 && winnerPlus == false){
    win = true;
    greenWin = true;
    winnerPlus = true;

      if(winnerPlus == true){
      greenWincounter+=1;
      gridFull = 9;
      }
  }

  }
/**
 * Checks if green has 3 in a row and sets win condition
 */
  public void greenRows(){
    if (intGrid[0][0] == 1 && intGrid[1][0] == 1 && intGrid[2][0] == 1 && winnerPlus == false) {
      win = true;
      greenWin = true; 
      winnerPlus = true;

      if(winnerPlus == true){
      greenWincounter+=1;
      gridFull = 9;
      }
    }
    if (intGrid[0][1] == 1 && intGrid [1][1] == 1 && intGrid[2][1] == 1 && winnerPlus == false){
    win = true;
    greenWin = true;
    winnerPlus = true;

    if(winnerPlus == true){
    greenWincounter+=1;
    gridFull = 9;
    }
    }
    if (intGrid[0][2] == 1 && intGrid [1][2] == 1 && intGrid[2][2] == 1 && winnerPlus == false){
    win = true;
    greenWin = true;
    winnerPlus = true;

    if(winnerPlus == true){
    greenWincounter+=1;
    gridFull = 9;
    }
    }
  }
  /**
   * Checks if green has 3 in a diagonal and sets win condition
   */
  public void greenDiags(){
    if (intGrid[0][0] == 1 && intGrid [1][1] == 1 && intGrid[2][2] == 1 && winnerPlus == false){
      win = true;
      greenWin = true;
      winnerPlus = true;

      if(winnerPlus == true){
      greenWincounter+=1;
      gridFull = 9;
      }
      }
      if (intGrid[0][2] == 1 && intGrid [1][1] == 1 && intGrid[2][0] == 1 && winnerPlus == false){
      win = true;
      greenWin = true;
      winnerPlus = true;

      if(winnerPlus == true){
      greenWincounter+=1;
      gridFull = 9;
      }
      }
  
  }
  /**
   * Checks if blue has 3 in a column and sets win condition
   */
  public void blooCols(){
    if (intGrid[0][0] == 2 && intGrid[0][1] == 2 && intGrid[0][2] == 2 && winnerPlus == false) {
      win = true;
      blooWin = true; 
      winnerPlus = true;

      if(winnerPlus == true){
      blooWincounter+=1;
      gridFull = 9;
      }
  }
  
  if (intGrid[1][0] == 2 && intGrid [1][1] == 2 && intGrid[1][2] == 2 && winnerPlus == false){
    win = true;
    blooWin = true;
    winnerPlus = true;

      if(winnerPlus == true){
      blooWincounter+=1;
      gridFull = 9;
      }
  }
  if (intGrid[2][0] == 2 && intGrid [2][1] == 2 && intGrid[2][2] == 2 && winnerPlus == false){
    win = true;
    blooWin = true;
    winnerPlus = true;

      if(winnerPlus == true){
      blooWincounter+=1;
      gridFull = 9;
      }
  }

  }
  /**
   * Checks if blue has 3 in a row and sets win condition
   */
  public void blooRows(){
    if (intGrid[0][0] == 2 && intGrid[1][0] == 2 && intGrid[2][0] == 2 && winnerPlus == false) {
      win = true;
      blooWin = true; 
      winnerPlus = true;

      if(winnerPlus == true){
      blooWincounter+=1;
      gridFull = 9;
      }

    }
    if (intGrid[0][1] == 2 && intGrid [1][1] == 2 && intGrid[2][1] == 2 && winnerPlus == false){
    win = true;
    blooWin = true;

    winnerPlus = true;

    if(winnerPlus == true){
    blooWincounter+=1;
    gridFull = 9;
    }

    }
    if (intGrid[0][2] == 2 && intGrid [1][2] == 2 && intGrid[2][2] == 2 && winnerPlus == false){
    win = true;
    blooWin = true;

    winnerPlus = true;

    if(winnerPlus == true){
    blooWincounter+=1;
    gridFull = 9;
    }

    }
  }
  /**
   * Checks if blue has 3 in a diagonal and sets win condition
   */
  public void blooDiags(){
    if (intGrid[0][0] == 2 && intGrid [1][1] == 2 && intGrid[2][2] == 2 && winnerPlus == false){
      win = true;
      blooWin = true;
      winnerPlus = true;

        if(winnerPlus == true){
        blooWincounter+=1;
        gridFull = 9;
        }
      }
      if (intGrid[0][2] == 2 && intGrid [1][1] == 2 && intGrid[2][0] == 2 && winnerPlus == false){
      win = true;
      blooWin = true;
      winnerPlus = true;

        if(winnerPlus == true){
        blooWincounter+=1;
        gridFull = 9;
        }
      }
    }
    /**
  * Checks for when the mouse is pressed, fill a square with either Blue or green depending on whose turn it is. 
  */

  public void mousePressed(){
    
    
      if(turn == false && mouseButton == LEFT && win == false && gridFull <= 9 && intGrid [mouseY/200][mouseX/200] == 0 && blooWin == false && greenWin == false){
        intGrid [mouseY/200][mouseX/200] = 2;
        gridFull++;
        turn = true;
        
      }
      else if (turn == true && mouseButton == LEFT&& win == false && gridFull <= 9 && intGrid [mouseY/200][mouseX/200] == 0 && blooWin == false && greenWin == false){
        intGrid [mouseY/200][mouseX/200] = 1; 
        gridFull++;
        turn = false;
      }

    greenCols();
    greenRows();
    greenDiags();
    blooCols();
    blooRows();
    blooDiags();
   
}
  
/**
  * Win Counter to detect who has won and increase the counter on screen by 1 for the respective player. 
  */
  public void winCounter(){


    textSize(50);
    fill(0,0,255);
    text(blooWinStatement,0,725);
    
    textSize(50);
    fill(0,0,255);
    text(blooWincounter,240,725);

    
    if(blooWin == true){
      
      win = true;
      winStatement = true;

      if (winStatement == true){
        textSize(70);
        fill(0,0,255);
        text(winnerBloo,0,670);

      }
      

    }
    textSize(50);
    fill(0,255,0);
    text(greenWinStatement,0,775);

    textSize(50);
    fill(0,255,0);
    text(greenWincounter,280,775);

    if(greenWin == true){

      win = true;
      winStatement = true;

      if (winStatement == true){
        textSize(70);
        fill(0,255,0);
        text(winnerGreen,0,670);

      }
    }
  
    if (win == false && gridFull >= 9){
      textSize(70);
          fill(0,255,255);
          text(tie,0,670);
        
      }
    

  }


}
