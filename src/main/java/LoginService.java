public class LoginService {
    public boolean isValidUser(String username, String pwd){
        return username.equalsIgnoreCase("priya") && pwd.equals("123");
    }
}
