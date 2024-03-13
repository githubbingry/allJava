package Soal_Pemro_Comp.soal8.soal8_1;

class Rectangle {
    double width;
    double height;
    String s;
    char c;
    boolean b;

    Rectangle(){
        width = 1;
        height = 1;
    }

    Rectangle(double newWidth, double newHeight){
        width = newWidth;
        height = newHeight;
    }

    double getWidth(){ return width; }
    
    double getHeight(){ return height; }

    double getArea(){ return width*height; }

    double getPerimeter(){ return 2*(width+height); }
}
