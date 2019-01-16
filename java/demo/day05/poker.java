package demo.day05;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class poker {
    public static void main(String[] args) {
        int[] cards = new poker().getCards();
        for (int i : cards) {
            System.out.print(i+"  ");
        }
    }
    public int[] getCards(){
        List<Integer> list = new LinkedList<Integer>();
        int index = 1;
        for (int i = 0; i < 52; i++) {
            list.add(index++);
        }
        Collections.shuffle(list);
        int[] cards = new int[52];
        for (int i = 0; i < cards.length; i++) {
            cards[i] = list.remove(0);
        }
        return cards;
    }
}


