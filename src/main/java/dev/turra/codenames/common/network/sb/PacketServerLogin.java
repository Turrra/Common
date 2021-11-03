package dev.turra.codenames.common.network.sb;

import dev.turra.codenames.common.network.Packet;

public class PacketServerLogin extends Packet {

	public String name;

	public PacketServerLogin(String name) {
		this.name = name;
	}
}
