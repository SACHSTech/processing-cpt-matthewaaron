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

  PImage uwuBg;
  PImage pain;
  PImage cart;

  int [][] intGrid;


  public void settings() {
    size(800, 800);
    uwuBg = loadImage("uwu.png");
    pain = loadImage("pain.png");
    cart = loadImage("cart.png");
  }


  public void setup() {
    //background(210, 255, 173);

    intGrid = new int[rowCount][colCount];
    for(int x = 0; x < rowCount; x++){
      for(int y = 0; y < colCount; y++){
        intGrid[x][y] = 0;
      
      
    }
  }
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
    
    textSize(25);
    fill(255,0,0);
    text(bgHelp,527,800);
  
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
  
  public void keyPressed(){

    if (key == 'b'){

      backgroundCount++;
      if(backgroundCount>=3){
        backgroundCount = 0;
      }

    }

  //  if (key == 'l'){

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
      
      }
      if (win == false && gridFull == 9){
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
        
        
        }


    }

    
  }
  public void greenCols(){
    if (intGrid[0][0] == 1 && intGrid[0][1] == 1 && intGrid[0][2] == 1) {
      win = true;
      greenWin = true;
      greenWincounter++; 
  }
  if (intGrid[1][0] == 1 && intGrid [1][1] == 1 && intGrid[1][2] == 1){
    win = true;
    greenWin = true;
    greenWincounter++;
  }
  if (intGrid[2][0] == 1 && intGrid [2][1] == 1 && intGrid[2][2] == 1){
    win = true;
    greenWin = true;
    greenWincounter++;
  }

  }
  public void greenRows(){
    if (intGrid[0][0] == 1 && intGrid[1][0] == 1 && intGrid[2][0] == 1) {
      win = true;
      greenWin = true; 
      greenWincounter++;
    }
    if (intGrid[0][1] == 1 && intGrid [1][1] == 1 && intGrid[2][1] == 1){
    win = true;
    greenWin = true;
    greenWincounter++;
    }
    if (intGrid[0][2] == 1 && intGrid [1][2] == 1 && intGrid[2][2] == 1){
    win = true;
    greenWin = true;
    greenWincounter++;
    }
  }
  public void greenDiags(){
    if (intGrid[0][0] == 1 && intGrid [1][1] == 1 && intGrid[2][2] == 1){
      win = true;
      greenWin = true;
      greenWincounter++;
      }
      if (intGrid[0][2] == 1 && intGrid [1][1] == 1 && intGrid[2][0] == 1){
      win = true;
      greenWin = true;
      greenWincounter++;
      }
  
  }
  public void blooCols(){
    if (intGrid[0][0] == 2 && intGrid[0][1] == 2 && intGrid[0][2] == 2) {
      win = true;
      blooWin = true; 
      blooWincounter+=1;
  }
  if (intGrid[1][0] == 2 && intGrid [1][1] == 2 && intGrid[1][2] == 2){
    win = true;
    blooWin = true;
    blooWincounter+=1;
  }
  if (intGrid[2][0] == 2 && intGrid [2][1] == 2 && intGrid[2][2] == 2){
    win = true;
    blooWin = true;
    blooWincounter+=1;
  }

  }
  public void blooRows(){
    if (intGrid[0][0] == 2 && intGrid[1][0] == 2 && intGrid[2][0] == 2) {
      win = true;
      blooWin = true; 
    }
    if (intGrid[0][1] == 2 && intGrid [1][1] == 2 && intGrid[2][1] == 2){
    win = true;
    blooWin = true;
    blooWincounter+=1;
    }
    if (intGrid[0][2] == 2 && intGrid [1][2] == 2 && intGrid[2][2] == 2){
    win = true;
    blooWin = true;
    blooWincounter+=1;
    }
  }
  public void blooDiags(){
    if (intGrid[0][0] == 2 && intGrid [1][1] == 2 && intGrid[2][2] == 2){
      win = true;
      blooWin = true;
      }
      if (intGrid[0][2] == 2 && intGrid [1][1] == 2 && intGrid[2][0] == 2){
      win = true;
      blooWin = true;
      blooWincounter+=1;
      }
    }

  public void mousePressed(){
    
    
    if (mouseButton == LEFT) {
      if (turn == false){
        intGrid [mouseY/200][mouseX/200] = 1;
        turn =true;
        gridFull++;
      }
      

    }

    
    if (mouseButton == RIGHT){
      if (turn == true){
        intGrid [mouseY/200][mouseX/200] = 2;
        gridFull++;
        turn = false;
      }
    }
    greenCols();
    greenRows();
    greenDiags();
    blooCols();
    blooRows();
    blooDiags();
   
}
  

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

  }

}
