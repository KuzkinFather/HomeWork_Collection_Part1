package homework.part1.task1.comparator;

import homework.part1.task1.Chats;

import java.util.Comparator;

public class ChatsTotalUsersComparator implements Comparator<Chats> {


    @Override
    public int compare(Chats o1, Chats o2) {
        return Integer.compare(o2.getTotalUsers(), o1.getTotalUsers());
    }

}
