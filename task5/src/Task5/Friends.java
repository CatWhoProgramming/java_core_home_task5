package Task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Friends {
    ArrayList<String> friends;

    Friends() {
        this.friends = new ArrayList<>();
    }

    public void add(String value) {
        this.friends.add(value);
    }

    public void show() {
        System.out.println(friends);
    }

    public void sort() {
        Collections.sort(this.friends);
    }
}
