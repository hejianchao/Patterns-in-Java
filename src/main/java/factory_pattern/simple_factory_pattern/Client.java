package factory_pattern.simple_factory_pattern;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Client {
    public static void main(String[] args) {
        String user = "hello";
        String password = "world";

        String loginType = "password";
        Login login = LoginManager.createLogin(loginType);

        boolean loginResult = login.verify(user, password);
        System.out.println(loginResult);

        System.out.println(DateFormat.getDateInstance() instanceof SimpleDateFormat);
    }
}
