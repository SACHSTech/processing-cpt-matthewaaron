import processing.core.PApplet;

/**
 * Main class to execute sketch
 * @author 
 *
 */
class Main {
  public static void main(String[] args) {
    
    String[] processingArgs = {"MySketch"};
	  //Sketch mySketch = new Sketch();  //comment this out to run the other sketch files
	   Sketch1 mySketch = new Sketch1();  // uncomment this to run this sketch file
<<<<<<< HEAD
	//Sketch2 mySketch = new Sketch2();  // uncomment this to run this sketch file
=======
	   //Sketch2 mySketch = new Sketch2();  // uncomment this to run this sketch file
>>>>>>> 0c12e503c28a7183fd69bd8087cb992bd00be1f6
	  
	  PApplet.runSketch(processingArgs, mySketch);
  }
  
}
