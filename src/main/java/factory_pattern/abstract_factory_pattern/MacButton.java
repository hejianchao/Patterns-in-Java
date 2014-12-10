package factory_pattern.abstract_factory_pattern;

public class MacButton implements Button {
    @Override
    public String getButtonTypeName() {
        return "Mac 系统的按钮";
    }
}
