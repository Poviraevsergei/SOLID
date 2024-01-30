package S.good;

import static S.good.Storage.list;

public class Registration {
    public boolean registration(String username, String password, Integer age) {
        if (!validation(age)) {
            return false;
        }
        User saved = store(username, password, age);
        return sendNotification(saved);
    }

    private boolean validation(Integer age) {
        //check validation (Task 1)
        if (age < 0) {
            return false;
        }
        return true;
    }

    private User store(String username, String password, Integer age) {
        User user = new User();
        user.setAge(age);
        user.setUsername(username);
        user.setPassword(password);
        list.add(user);
        return user;
    }

    private boolean sendNotification(User user) {
        //send email
        System.out.println("Your credentials:");
        System.out.println("Login:" + user.getUsername());
        System.out.println("Password:" + user.getPassword());
        return true;
    }
}
