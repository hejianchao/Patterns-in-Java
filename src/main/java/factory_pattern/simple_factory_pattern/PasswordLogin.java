package factory_pattern.simple_factory_pattern;

public class PasswordLogin implements Login {
    @Override
    public boolean verify(String name, String password) {
        return true;
    }
}
