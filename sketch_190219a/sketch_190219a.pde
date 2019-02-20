int x= 225;
int y= 450;
PImage creeper; 
PImage jungle;//at the top of your program
void setup(){
size(1280,720);
jungle = loadImage("jungle.jpg");     //in setup method
jungle.resize(1280, 720);          //in setup method
background(jungle);          //in setup method
creeper=loadImage("creeper.png");
creeper.resize(75, 50);     //in setup method
}
void draw(){
image(creeper, x, y);
if(mousePressed){
  
  if(isNear(x, mouseX)){
    fill(#00FC12);

  }
}
else{fill(#FC0000);
}
 ellipse(mouseX, mouseY, 50, 50);
}
  boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}