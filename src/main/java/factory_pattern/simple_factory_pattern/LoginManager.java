package factory_pattern.simple_factory_pattern;

public class LoginManager {
    public static Login createLogin(String loginType) {
        if ("password".equalsIgnoreCase(loginType)) {
            return new PasswordLogin();
        } else if ("domain".equalsIgnoreCase(loginType)) {
            return new DomainLogin();
        } else {
            throw new IllegalArgumentException("bad loginType:" + loginType);
        }
    }
}
