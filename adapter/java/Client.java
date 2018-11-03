public class Client {
    public static void main(String args[]) {
        SocialLoginAdapter adapter = new GooglePlusAdapter(); // or FacebookAdapter or TwitterAdapter

        SocialAuthenticator socialAuthenticator = new SocialAuthenticator(adapter, "clientId", "clientSecret", "redirectUrl");

        System.out.format("%nAuthentication result: %s .%n", socialAuthenticator.auth("another-username", "another-password") ? "Success" : "Error");

        User fetchedUserByCredentials = socialAuthenticator.fetchUserFromCredentials("some-username", "some-password");
        System.out.format("%nUser fetched with username '%s' and password '%s'.%n", fetchedUserByCredentials.username, fetchedUserByCredentials.password);

        User fetchedUserByToken = socialAuthenticator.fetchUserFromToken("my-token");
        System.out.format("%nUser fetched with username '%s' and password '%s'.%n", fetchedUserByToken.username, fetchedUserByToken.password);

        if (fetchedUserByToken.additionalAttributes.containsKey("tweetsAmount"))    { System.out.format("%nAdditional attributes tweetsAmount: %s.%n", fetchedUserByToken.additionalAttributes.get("tweetsAmount")); }
        if (fetchedUserByToken.additionalAttributes.containsKey("followersAmount")) { System.out.format("%nAdditional attributes followersAmount: %s.%n", fetchedUserByToken.additionalAttributes.get("followersAmount")); }
        if (fetchedUserByToken.additionalAttributes.containsKey("friendsAmount"))   { System.out.format("%nAdditional attributes friendsAmount: %s.%n", fetchedUserByToken.additionalAttributes.get("friendsAmount")); }
        if (fetchedUserByToken.additionalAttributes.containsKey("groupsAmount"))    { System.out.format("%nAdditional attributes groupsAmount: %s.%n", fetchedUserByToken.additionalAttributes.get("groupsAmount")); }
    }
}
