/*----------------------------------------------
        public class SomethingIsWrong {
        public static void main(String[] args) {
        Rectangle myRect; -----> /******** Se necesita crear un objeto nuevo
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area());
            }
        }
        -----------------------------------------*/

public class Rect {
    // Aquí se declaran las variables que se van a usar en la clase
    int width = 0;
    int height = 0;
    float area = 0;

    // El constructor de la clase
    public Rect() {

    }

    // Método de los objetos Rect para obtener el área
    public float getArea() {
        area = width * height;
        return area;
    }

    public static void main(String[] args) {
        Rect myRectangle = new Rect();
        myRectangle .width = 40;
        myRectangle .height = 50;
        System.out.println("myRectangle area is " + myRectangle .getArea());
    }
}



