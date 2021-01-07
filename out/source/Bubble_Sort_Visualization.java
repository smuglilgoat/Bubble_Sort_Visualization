import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Bubble_Sort_Visualization extends PApplet {

float[] values;
int i = 0;
int j = 0;

public void setup() {
  
  values = new float[width];
  for(int i = 0; i < values.length; i++){
    values[i] = noise(i / 100.0f) * height;
  }
  
  for(int i = 0; i < values.length; i++){
    
  }
  
}

public void draw() {
  background(0);
  
  
  
  if(i < values.length) {
    for(int j = 0; j < values.length - i - 1; j++){
      if(values[j] > values[j+1]){
        float temp = values[j];
        values[j] = values[j + 1];
        values[j+1] = temp;
      }
    }
  } else {
    println("finished");
    noLoop();
  }
  
  i++;
  
  for(int i = 0; i < values.length; i++){
    stroke(255);
    line(i, height, i, height - values[i]);
  }
}
  public void settings() {  size(800, 600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Bubble_Sort_Visualization" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
