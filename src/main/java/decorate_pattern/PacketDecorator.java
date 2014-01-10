package decorate_pattern;

public abstract class PacketDecorator implements IPacketCreator {
	IPacketCreator iPacketCreator;

	public PacketDecorator(IPacketCreator iPacketCreator) {
		this.iPacketCreator = iPacketCreator;
	}

}
