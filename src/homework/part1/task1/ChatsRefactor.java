package homework.part1.task1;

import homework.part1.task1.comparator.ChatsNameComparator;
import homework.part1.task1.comparator.ChatsTotalUsersComparator;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class ChatsRefactor {


    public static void main(String[] args) {


        List<Chats> chatsList = new ArrayList<>();

        chatsList.add(new Chats("lovelasy", 1000));
        chatsList.add(new Chats("hobby", 1200));
        chatsList.add(new Chats("babushkiupadika", 500));
        chatsList.add(new Chats("gdegaiminsk", 1200));
        chatsList.add(new Chats("podusham", 500));


        chatsList.sort(new ChatsNameComparator());
        System.out.println(chatsList);

        for (Iterator<Chats> chatsIterator = chatsList.iterator(); chatsIterator.hasNext(); ) {
            Chats next = chatsIterator.next();
            if (next.getTotalUsers() < 1000) {
                chatsIterator.remove();
            }
        }

        chatsList.sort(new ChatsTotalUsersComparator().thenComparing(new ChatsTotalUsersComparator()));
        System.out.println(chatsList);


    }

}
