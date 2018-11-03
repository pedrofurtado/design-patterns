public class FacebookAdapter implements SocialLoginAdapter {
    public User getUserFromToken(String token) {
        System.out.println("Searching user by token into Facebook REST API ...");
        System.out.println("Found!");

        User user = new User();
        user.username = "elvis.presley@gmail.com";
        user.password = "elvis_presley1990";
        user.additionalAttributes.put("friendsAmount", "13");

        return user;
    }

    public User getUserFromCredentials(String username, String password) {
        System.out.println("Searching user by credentials into Facebook REST API ...");
        System.out.println("Found!");

        User user = new User();
        user.username = "george.lucas@gmail.com";
        user.password = "george_lucas_pass";
        user.additionalAttributes.put("friendsAmount", "2");

        return user;
    }

    public boolean authenticate(String username, String password) {
        System.out.println("Authenticating user into Facebook REST API ...");
        System.out.println("Not authenticated!");

        return false;
    }
}
