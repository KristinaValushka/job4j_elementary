package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User userName = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(login)) {
                userName = users[i];
                System.out.println("Found user " + userName);
                break;
            }
        }
        if (userName == null) {
            throw new UserNotFoundException();
        }
        return userName;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || (user.getUsername().length() <= 3)) {
            throw new UserInvalidException();
        }

        return true;
    }

    public static void main(String[] args) throws UserNotFoundException, UserInvalidException {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        User user = findUser(users, "Petr Arsentev");
        if (validate(user)) {
            System.out.println("This user has an access");
        }
    }
}