package dev.turra.codenames.common.network.cb;

import dev.turra.codenames.common.network.Packet;

public class PacketClientChat extends Packet {

	public int sender;
	public String message;

	public PacketClientChat(int sender, String message) {
		this.sender = sender;
		this.message = message;
	}

}
