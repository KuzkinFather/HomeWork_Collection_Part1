package homework.part1.task1;

import java.util.Objects;

public class Chats {

    private String name;
    private int totalUsers;

    public Chats(String name, int totalUsers) {
        this.name = name;
        this.totalUsers = totalUsers;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chats chats = (Chats) o;
        return totalUsers == chats.totalUsers && Objects.equals(name, chats.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, totalUsers);
    }

    public int getTotalUsers() {
        return totalUsers;
    }

    @Override
    public String toString() {
        return "Chats{" +
                "name='" + name + '\'' +
                ", totalUsers=" + totalUsers +
                '}';
    }
}
