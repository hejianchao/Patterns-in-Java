package factory_pattern.abstract_factory_pattern;

public class Client {
    public static void main(String[] args) {
        Factory factory = new WinFactory();
        Button button = factory.createAButton();
        Editor editor = factory.createAEditor();

        System.out.println("button: " + button.getButtonTypeName());
        System.out.println("editor: " + editor.getEditorTypeName());
    }
}
