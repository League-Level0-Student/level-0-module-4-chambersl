PImage face;
void setup(){
 
 face = loadImage("face.jpg");
   size(800,600);
  face.resize(800,600);
    background(face);
         face.resize(800,600);
}
void draw(){
  
  background(face);
  
  fill (#000000);
  ellipse (325, 190, 100, 60);
    ellipse (475, 190, 100, 60);
    fill (#FFFFFF);
    ellipse (mouseX, mouseY, 20, 20); 
    fill (#2B7FEA);
    ellipse (mouseX+150, mouseY, 35, 35);
    if(mouseX<275){
      mouseX=275;
    }
    if(mouseX>375){
      mouseX=375
    }
    if(
    if(
}