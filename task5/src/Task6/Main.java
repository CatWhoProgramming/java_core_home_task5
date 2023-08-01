package Task6;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();
        addTeachers(teachers);
        System.out.println(teachers);
        showTheBest(teachers);
    }

    private static void showTheBest(ArrayList<String> teachers) {
        System.out.println(teachers.indexOf("Chemistry"));
    }

    private static void addTeachers(ArrayList<String> teachers) {
        teachers.add("Mathematics");
        teachers.add("Chemistry");
        teachers.add("Literature");
        teachers.add("English");
        teachers.add("Physics");
        teachers.add("History");
    }
}
