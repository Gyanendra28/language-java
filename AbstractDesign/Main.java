package AbstractDesign;

// abstract class Bird {
//     abstract void fly();
//     abstract void eat();

//     public void sleep() {
//         System.out.println("Bird is sleeping");
//     }
// }

// class Nightingale extends Bird {
//     @Override
//     void fly() {
//         System.out.println("Nightingale is flying");
//     }

//     @Override
//     void eat() {
//         System.out.println("Nightingale is eating");
//     }
// }

// class Sparrow extends Bird {
//     @Override
//     void fly() {
//         System.out.println("Sparrow is flying");
//     }

//     @Override
//     void eat() {
//         System.out.println("Sparrow is eating");
//     }
// }

public class Main {
    public static void doBirdStuff(Bird b) {
        b.fly();
        b.eat();
        b.sleep();
    }
    public static void main(String[] args) {
        doBirdStuff(new Nightingale());
        doBirdStuff(new Sparrow());

        // Bird b = new Nightingale();
        // b.fly();
        // b.eat();

        // b = new Sparrow();
        // b.eat();
        // b.fly();

        // b.sleep();
    }
}

// Interface
interface Bird {
    void fly(); // Public
    void eat();

    default void sleep() {
        System.out.println("Bird is sleeping");
    }
}

interface Walk {
    void walk();
}

class Nightingale implements Bird, Walk {
    @Override
    public void fly() {
        System.out.println("Nightingale is flying");
    }

    @Override
    public void eat() {
        System.out.println("Nightingale is eating");
    }

    @Override
    public void walk() {
        System.out.println("Nightingale is walking");
    }
}

class Sparrow implements Bird {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
    
    @Override
    public void eat() {
        System.out.println("Sparrow is eating");
    }
}