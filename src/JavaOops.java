public class JavaOops {
     public static void main(String args[]) {
        // Student s1 = new Student("Faizan");
        // System.out.println(s1.name);

        // Fish shark = new Fish();

        // shark.eat();

        Human hmn = new Human();
        hmn.color = "multicolor";
        System.out.println(hmn.color);
     }
}

class Pen {
    String color;
    int tip;
    String getcolor() {
        return this.color;
    }

    void setColor(String newColor) {
         color = newColor;
    }
    

}

// Polymorphism

class Student {
    String name;
    int num;

    Student(String name) {
         this.name =  name;
    }
}

// Copy Constructor


// Destructors


// Inheritance

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }

}

class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swims");
    }

}

// Multi-level Inheritance

class Mammals extends Animal {
    int legs;
}

class Dog extends Mammals {
    String breed;
}

// Hirarchial Inheritance

// Hibrid Inheritance

class Bird extends Animal {
    int wings;

    void fly() {
        System.out.println("Flies");
    }
}

class Peacock extends Bird {
    String sing;
    void fly() {
        System.out.println("Not flies");
    }
}

class Dolphin extends Fish {
    String nature = "Humble";
    void inteligence() {
        System.out.println("High");
    }
}

class Shark extends Fish {
    String nature = "Dangerous";
    void inteligence() {
        System.out.println("More than Human");
    }
}

class Cat extends Mammals {
    String size;
    
}

class Human extends Mammals {
    String Walk = "On 2 legs";
}

// Polymorphism

// Funtion Overloading

// class calculator {
//     int sum(int a, int b) {
//         return a + b;
//     }

//     float sum(float a, float b) {
//         return a +  b;
//     }

//     int sum(int a, int b, int c) {
//         return a + b + c;
//     }
// }

// Method Overriding

class Animals {
    void eats() {
        System.out.println("Eats Anything");
    }
}

class Deer extends Animal {
    void eats() {
        System.out.println("Eats Grass");
    }
}


// Abstract 



  