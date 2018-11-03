public class TwitterAdapter implements SocialLoginAdapter {
    public User getUserFromToken(String token) {
        System.out.println("Searching user by token into twitter REST API ...");
        System.out.println("Found!");

        User user = new User();
        user.username = "john.smith@gmail.com";
        user.password = "john_smith01";
        user.additionalAttributes.put("tweetsAmount", "80");
        user.additionalAttributes.put("followersAmount", "80");

        return user;
    }

    public User getUserFromCredentials(String username, String password) {
        System.out.println("Searching user by credentials into twitter REST API ...");
        System.out.println("Found!");

        User user = new User();
        user.username = "sara.mells@gmail.com";
        user.password = "sara_mells-78";
        user.additionalAttributes.put("tweetsAmount", "250");
        user.additionalAttributes.put("followersAmount", "4");

        return user;
    }

    public boolean authenticate(String username, String password) {
        System.out.println("Authenticating user into twitter REST API ...");
        System.out.println("Authenticated!");

        return true;
    }
}
