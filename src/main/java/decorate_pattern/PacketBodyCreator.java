package decorate_pattern;

public class PacketBodyCreator implements IPacketCreator {

	@Override
	public String handleBodyContent() {
		return "This is body content";
	}

}
