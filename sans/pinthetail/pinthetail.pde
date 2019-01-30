PImage donkey;
PImage tail;
int x = 0;
int y = 0;
void setup(){
donkey = loadImage("donkey.jpg");
tail = loadImage("donkey tail.png");
size(300, 221);
tail.resize(100, 75);
}
void draw(){
 if(dist(0, 0, mouseX, mouseY) < 30){
background (donkey);
 }
 else {
   background(#F00C0C);
 }
 if(mousePressed){
   x=mouseX-55;
   y=mouseY-10;
 }
 
 if(x>0){
  background(donkey);
  image(tail, x, y);
 }
 else{

image(tail, mouseX-55, mouseY-10);
 }
rect(0, 0, 30, 30);
rect(250, 50, 40, 40);
}