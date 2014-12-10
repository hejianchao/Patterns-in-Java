package factory_pattern.abstract_factory_pattern;

public class WinButton implements Button {
    @Override
    public String getButtonTypeName() {
        return "Windows 系统的按钮";
    }
}
