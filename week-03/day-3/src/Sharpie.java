public class Sharpie {
    //- Create `Sharpie` class
    //  - We should know about each sharpie their `color` (which should be a string),
    //            `width` (which will be a floating point number), `inkAmount` (another
    //    floating point number)
    //            - When creating one, we need to specify the `color` and the `width`
    //            - Every sharpie is created with a default 100 as `inkAmount`
    //            - We can `use()` the sharpie objects which decreases inkAmount

    String color;
    float width;
    float inkAmout = 100;

    public Sharpie(String color, float width) {
        this.color = color;
        this.width = width;
    }

    public void use() {
        inkAmout = inkAmout - 8;
        System.out.println("Current "+color + " ink amount is: " + inkAmout);
    }

    public static void main(String[] args) {
        Sharpie black = new Sharpie("black", 2);
        Sharpie blue = new Sharpie("blue", 3);
        Sharpie yellow = new Sharpie("yellow", 1);
        Sharpie pink = new Sharpie("pink", 5);
        Sharpie green = new Sharpie("green", 4);

        black.use();
        black.use();
        black.use();
        black.use();
        black.use();
    }
}
