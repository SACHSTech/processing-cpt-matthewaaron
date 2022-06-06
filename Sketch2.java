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

  boolean blooWin = false;
  boolean greenWin = false;
  int blooWincounter = 0;
  int greenWincounter = 0;
  String blooWinStatement = "Blue Wins: ";
  String greenWinStatement = "Green Wins: ";

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
    

      boolean inARow = true;
      int value = intGrid [x][0];
      if (value == 0){
        inARow = false;
      }else{
        for(int y =1; y<intGrid[x].length; y++){
          if (intGrid [x][y] != value){
            inARow = false;
            fill(155, 155, 155);
          }
      }
    }

      boolean inACol = true;
      int value5 = intGrid [0][y];
      if (value5 == 0){
        inACol = false;
      }else{
        for(int x =1; x<intGrid.length; x++){
          if (intGrid [x][y] != value){
            inACol = false;
            fill(155, 155, 155);
          }
      }
    }

    

    boolean inADiag1 = true;
    int value1 = intGrid [0][0];

    if(value1 == 0){
      inADiag1 = false;
    } else{
      for(int x = 1; x < intGrid.length; x++){
        if(intGrid[x][x] != value1){
          inADiag1 = false;
          fill(155, 155, 155);
        }
      }
    }

    boolean inADiag2 = true;
    int value2 = intGrid [0][intGrid.length -1];

    if(value2 == 0){
      inADiag2 = false;
    } else{
      for(int x = 1; x < intGrid.length; x++){
        if(intGrid[x][intGrid.length-1-x] != value2){
          inADiag2 = false;
          fill(155, 155, 155);
        }
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
    if (keyCode == SHIFT){
      intGrid [mouseY/200][mouseX/200] = 0;
    }


  }

  public void mousePressed(){
    if (mouseButton == LEFT) {
      
      intGrid [mouseY/200][mouseX/200] = 1;

    }

    
    if (mouseButton == RIGHT){

      intGrid [mouseY/200][mouseX/200] = 2;

    }

    if (playerHasWon(intGrid) == 'x')

    rowCont = 0;
    for(int i = 0; i < rowCount; i++){
      for (int h = 0; h <colCount; h++){
    if(intGrid[h][i] == 1){
      rowBoxCount++;
    }
  }
}
  }
  private char playerHasWon(int[][] intGrid2) {
    return 0;
  }


  public void winPosition(int x, int y, int value){
    
  }
  public void winCounter(){


    textSize(50);
    fill(255,0,0);
    text(blooWinStatement,0,700);
    if(blooWin = true){

    }
    textSize(50);
    fill(255,0,0);
    text(greenWinStatement,0,750);
    if(greenWin = true){

    }

  }
  public static boolean boardIsFull(int[][]intGrid){
    for(int x=0; x<intGrid.length; x++){
      for(int y = 0; y<intGrid[y].length; y++){
        if(intGrid[x][y] == 0){
          return false;
        }
      }
    }
    return true;
  }
}
