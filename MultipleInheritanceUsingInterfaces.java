public class MultipleInheritanceUsingInterfaces {
    public static void main(String[] args) {
        Person jhon = new NonVegan();
        jhon.breath();
        jhon.eat();
        jhon.breath();
        jhon.message();
        System.out.println("__________________________________________");
        Person mia = new Vegan();
        mia.breath();
        mia.eat();
        mia.breath();
        mia.message();
    }
}

interface IsAlive {
    void breath();
}

interface LiveLife {
    void message();
}

abstract class Person implements IsAlive, LiveLife {
    public void speake() {
        System.out.println("Shares His/Her Thoughts");
    }

    @Override
    public void breath() {
        System.out.println("Be Alive; Remaining Living");
    }

    @Override
    public void message() {
        System.out.println("Life is a journey, keep moving and meet new peoples");
    }

    public abstract void eat();
}

class Vegan extends Person {

    @Override
    public void eat() {
        System.out.println("Eats Vegan Foods");
    }

}

class NonVegan extends Person {

    @Override
    public void eat() {
        System.out.println("Eats Non Vegan Foods");
    }

}
