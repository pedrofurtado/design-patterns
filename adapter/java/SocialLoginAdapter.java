public interface SocialLoginAdapter {
    public User getUserFromToken(String token);
    public User getUserFromCredentials(String username, String password);
    public boolean authenticate(String username, String password);
}
