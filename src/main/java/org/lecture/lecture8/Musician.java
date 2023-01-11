package org.lecture.lecture8;

//Реализовать классы музыкантов, которые играют на гитаре и клавишных.
// Каждый класс должен возвращать по методу описания строку с именем музыканта и названием инструмента на котором играет.
// Пример: John plays a keyboard. Bob plays a guitar.
public class Musician {
    protected String name;
    public Musician(){}
    public Musician(String name) {
        this.name = name;
    }

    public String description() {
        return name + " plays anything.";
    }

    protected String getName() {
        return name;
    }

    public static void main(String[] args) {
        System.out.println("Кит Ричардс играет на гитаре: " + new GuitarPlayer("Кит Ричардс").description());
    }
}

class GuitarPlayer extends Musician {
    public GuitarPlayer(){}
    public GuitarPlayer(String name) {
        this.name = name;
     }

    @Override
    public String description() {
//TODO
        return super.description();
    }
}

class KeyboardPlayer extends Musician {
    public KeyboardPlayer(String name) {
//TODO
    }

    @Override
    public String description() {
//TODO
        return super.description();
    }
}