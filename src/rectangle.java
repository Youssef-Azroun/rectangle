public class rectangle {
    private double x;
    private double y;
    private double width;
    private double height;


    public rectangle(){

    }


    public rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }


    public rectangle (double x, double y, double width, double height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }


    public double getY() {
        return y;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateArea(){
        return width*height;
    }
    public double calculatePerimeter(){
        return width+height+width+height;
    }
    public void setXY (double x, double y){
        this.x =x;
        this.y = y;

    }


    }




