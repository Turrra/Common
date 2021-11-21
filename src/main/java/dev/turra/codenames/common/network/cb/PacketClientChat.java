package dev.turra.codenames.common.network.cb;

import dev.turra.codenames.common.network.Packet;

public class PacketClientChat extends Packet {

	private String sender;
	private String message;

	public PacketClientChat(String sender, String message) {
		this.sender = sender;
		this.message = message;
	}

	public String getSender() {
		return sender;
	}

	public String getMessage() {
		return message;
	}
}
