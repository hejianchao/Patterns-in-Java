package decorate_pattern;

public class Client {

	public static void main(String[] args) {
		IPacketCreator creator = new HttpHeaderPacketDecorator(
				new HtmlPacketDecorator(new PacketBodyCreator()));
		System.out.println(creator.handleBodyContent());
	}

}
