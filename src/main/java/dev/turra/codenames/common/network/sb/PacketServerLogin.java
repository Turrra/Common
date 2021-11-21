package dev.turra.codenames.common.network.sb;

import dev.turra.codenames.common.network.Packet;

public class PacketServerLogin extends Packet {

	private String name;

	public PacketServerLogin(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
