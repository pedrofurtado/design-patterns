public class GooglePlusAdapter implements SocialLoginAdapter {
    public User getUserFromToken(String token) {
        System.out.println("Searching user by token into Google Plus REST API ...");
        System.out.println("Found!");

        User user = new User();
        user.username = "elton.john@gmail.com";
        user.password = "elton_john1990";
        user.additionalAttributes.put("friendsAmount", "13");

        return user;
    }

    public User getUserFromCredentials(String username, String password) {
        System.out.println("Searching user by credentials into Google Plus REST API ...");
        System.out.println("Found!");

        User user = new User();
        user.username = "brian.oconnor@gmail.com";
        user.password = "brian_oconnor_pass";
        user.additionalAttributes.put("friendsAmount", "2");

        return user;
    }

    public boolean authenticate(String username, String password) {
        System.out.println("Authenticating user into Google Plus REST API ...");
        System.out.println("Not authenticated!");

        return false;
    }
}
