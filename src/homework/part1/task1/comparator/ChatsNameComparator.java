package homework.part1.task1.comparator;

import homework.part1.task1.Chats;

import java.util.Comparator;

public class ChatsNameComparator implements Comparator<Chats> {


    @Override
    public int compare(Chats o1, Chats o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
