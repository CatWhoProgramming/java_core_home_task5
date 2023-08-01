package Task5;

public class Main {
    public static void main(String[] args) {
        Friends friends = new Friends();
        addFriends(friends);
        System.out.println(friends.friends);
        friends.sort();
        System.out.println(friends.friends);
    }

    private static void addFriends(Friends friends) {
        String[] arrayFriends = new String[]{"Kamila", "Leon",
                "Jasmin", "Lena",
                "Masha", "Jack", "Denis"};
        int index;
        for (int i = 0; i < arrayFriends.length; i++) {
            index = (int) (Math.random() * (arrayFriends.length));
            friends.add(arrayFriends[index]);

        }
    }
}
