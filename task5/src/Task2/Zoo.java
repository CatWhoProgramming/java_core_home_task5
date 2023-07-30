package Task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Zoo {
    ArrayList<String> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }


    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.setAnimals();
        System.out.println(zoo.animals);
    }

    public void setAnimals() {
        animals.add(0, "cat");
        animals.add(1, "wolf");
        animals.add(2, "tiger");
        animals.add(3, "giraffe");
        animals.add(4, "monkey");
        animals.add(5, "elephant");
        animals.add(6, "lion");
        animals.add(7, "bear");
    }

    public ArrayList<String> getAnimals() {
        return animals;
    }
}
