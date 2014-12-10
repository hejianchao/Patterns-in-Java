package factory_pattern.abstract_factory_pattern;

public class MacFactory implements Factory {
    @Override
    public Button createAButton() {
        return new MacButton();
    }

    @Override
    public Editor createAEditor() {
        return new MacEditor();
    }
}
