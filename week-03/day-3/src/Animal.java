public class Animal {
    //- Create an `Animal` class
    //  - Every animal has a `hunger` value, which is a whole number
    //  - Every animal has a `thirst` value, which is a whole number
    //  - when creating a new animal object these values are created with the default
    //    `50` value
    //  - Every animal can `eat()` which decreases their hunger by one
    //  - Every animal can `drink()` which decreases their thirst by one
    //  - Every animal can `play()` which increases both by one

    String species;
    int hunger = 50;
    int thirst = 50;

    public Animal(String species) {
        this.species = species;
    }

    public void eat() {
        System.out.println("The " + species + " is eating. Hunger changed to: " + hunger--);
    }

    public void drink() {
        System.out.println("The " + species + " is drinking. Thirst changed to: " + thirst--);
    }

    public void play() {
        System.out.println("The " + species + " is playing. Hunger changed to: " + hunger++ + ", thirst changed to: " + thirst++);
    }

    public static void main(String[] args) {
        Animal cat = new Animal("cat");
        Animal dog = new Animal("dog");
        Animal fox = new Animal("fox");

        cat.eat();
        cat.eat();
        cat.eat();

        dog.play();
        dog.play();

        fox.drink();
        fox.play();
    }
}
