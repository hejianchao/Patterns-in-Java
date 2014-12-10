package factory_pattern.abstract_factory_pattern;

public class MacEditor implements Editor {
    @Override
    public String getEditorTypeName() {
        return "Mac 系统的编辑器";
    }
}
