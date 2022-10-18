package homework.part1.task2;

import java.util.Objects;

public class Chats {

    private String name;
    private User users;

    public Chats() {

    }

    public Chats(User users) {
        this.users = users;
    }
    public Chats(String name, User users) {
        this.name = name;
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public User getUsers() {
        return users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chats chats = (Chats) o;
        return Objects.equals(name, chats.name) && Objects.equals(users, chats.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, users);
    }

    @Override
    public String toString() {
        return "Chats{" +
                "name='" + name + '\'' +
                ", users=" + users +
                '}';
    }
}
