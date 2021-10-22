package dev.turra.codenames.common.network.sb;

import dev.turra.codenames.common.network.Packet;

public class PacketServerChat extends Packet {

	public String message;

	public PacketServerChat(String message) {
		this.message = message;
	}
}
