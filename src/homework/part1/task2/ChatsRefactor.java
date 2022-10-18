package homework.part1.task2;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChatsRefactor {

    public static void main(String[] args) {

        List<Chats> listChats = new ArrayList<>();
        listChats.add(new Chats("babushkipodpadikom", new User(28,"Nadezhda",63)));
        listChats.add(new Chats("futbolchik", new User(14,"Pavel",22)));
        listChats.add(new Chats("baraholka", new User(55,"Evgeniy",41)));
        listChats.add(new Chats("newsminsk", new User(83,"Elena",42)));
        listChats.add(new Chats("multiki", new User(22,"Elena",10)));
        listChats.add(new Chats("school169", new User(45,"Elena",15)));

        ArrayList<User> changeListChats = new ArrayList<>();
        for (Iterator<Chats> iterator = listChats.iterator(); iterator.hasNext();) {
            Chats next = iterator.next();
            if (next.getUsers().getAge() > 18) {
                changeListChats.add(next.getUsers());
            }
        }
        System.out.println(changeListChats);



        double resultAgesUsers = 0;
        for (Iterator<User> iterator2 = changeListChats.iterator(); iterator2.hasNext(); ) {
            User next = iterator2.next();
            resultAgesUsers += next.getAge();
        }
        double remainingUsers = changeListChats.size();
        BigDecimal.valueOf(resultAgesUsers /= remainingUsers);
        System.out.println("Average age of remaining users: " + resultAgesUsers);

    }

}
