import java.util.ArrayList;

public class Assignment4_CharacterList {
    public static void main(String[] args) {
        ArrayList<Character> characters = new ArrayList<>();

        characters.add('A');
        characters.add('B');
        characters.add('C');
        characters.add('D');
        characters.add('E');
        characters.add('F');

        characters.add(2, 'Z');
        characters.set(4, 'X');
        characters.remove(0);

        System.out.println("Character at index 3: " + characters.get(3));
        System.out.println("Size of list: " + characters.size());

        characters.clear();
        System.out.println("Is list empty? " + characters.isEmpty());
    }
}
