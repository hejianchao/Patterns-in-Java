package factory_pattern.abstract_factory_pattern;

public class WinFactory implements Factory {
    @Override
    public Button createAButton() {
        return new WinButton();
    }

    @Override
    public Editor createAEditor() {
        return new WinEditor();
    }
}
