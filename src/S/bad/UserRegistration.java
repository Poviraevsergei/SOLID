package S.bad;

import java.util.ArrayList;

public class UserRegistration {
    private String username;
    private String password;
    private Integer age;

    public ArrayList<UserRegistration> list = new ArrayList<>(); //(Task 2)

    public boolean registration(String username, String password, Integer age){
        //check validation (Task 1)
        if (age < 0){
            return false;
        }

        UserRegistration user = new UserRegistration();
        user.age = age;
        user.username = username;
        user.password = password;

        //save user (Task 2)
        list.add(user);

        //send email
        System.out.println("Your credentials:");
        System.out.println("Login:" + username);
        System.out.println("Password:" + password);
        return true;
    }
}
