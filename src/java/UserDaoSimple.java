import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserDaoSimple {
    private List<String> users = new ArrayList<>();

    public void addUser(String user) {
        users.add(user);
    }

    public List<String> getUsers() {
        return users;
    }

    public void reverseUsers() {
        Collections.reverse(users);
    }

    public static void main(String[] args) {
        UserDaoSimple userDao = new UserDaoSimple();


        userDao.addUser("John");
        userDao.addUser("Jane");


        System.out.println("Initial array: " + userDao.getUsers());


        userDao.reverseUsers();


        System.out.println("Reversed array: " + userDao.getUsers());
    }
}
