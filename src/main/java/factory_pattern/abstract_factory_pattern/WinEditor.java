package factory_pattern.abstract_factory_pattern;

public class WinEditor implements Editor {
    @Override
    public String getEditorTypeName() {
        return "Windows 系统的编辑器";
    }
}
