package decorate_pattern;

public class HtmlPacketDecorator extends PacketDecorator {

	public HtmlPacketDecorator(IPacketCreator iPacketCreator) {
		super(iPacketCreator);
	}

	@Override
	public String handleBodyContent() {
		StringBuilder sb = new StringBuilder(1024);
		sb.append("<html><h1>")
				.append(super.iPacketCreator.handleBodyContent())
				.append("</h1></html>");

		return sb.toString();
	}

}
