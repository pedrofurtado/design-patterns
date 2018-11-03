public class SocialAuthenticator {
    private String clientId;
    private String clientSecret;
    private String redirectUrl;
    private SocialLoginAdapter socialLoginAdapter;

    public SocialAuthenticator(SocialLoginAdapter socialLoginAdapter, String clientId, String clientSecret, String redirectUrl) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.redirectUrl = redirectUrl;
        this.socialLoginAdapter = socialLoginAdapter;
    }

    public User fetchUserFromToken(String token) {
        return this.socialLoginAdapter.getUserFromToken(token);
    }

    public User fetchUserFromCredentials(String username, String password) {
        return this.socialLoginAdapter.getUserFromCredentials(username, password);
    }

    public boolean auth(String username, String password) {
        return this.socialLoginAdapter.authenticate(username, password);
    }
}
