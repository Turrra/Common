package dev.turra.codenames.common.network.cb;

import dev.turra.codenames.common.network.Packet;

public class PacketClientChat extends Packet {

	public String sender;
	public String message;

	public PacketClientChat(String sender, String message) {
		this.sender = sender;
		this.message = message;
	}

}
