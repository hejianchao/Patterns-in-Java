package decorate_pattern;

public class HttpHeaderPacketDecorator extends PacketDecorator {

	public HttpHeaderPacketDecorator(IPacketCreator iPacketCreator) {
		super(iPacketCreator);
	}

	@Override
	public String handleBodyContent() {
		StringBuilder sb = new StringBuilder(2048);
		sb.append("Content-Language:zh-CN")
				.append("Content-Type:text/html;charset=UTF-8")
				.append(super.iPacketCreator.handleBodyContent());
		return sb.toString();
	}

}
