package dev.turra.codenames.common.network.sb;

import dev.turra.codenames.common.network.Packet;

public class PacketServerLogin extends Packet {

	private String name;

	/**
	 * Server bound packet. Sent when a player logs in to the server.
	 * @param name
	 */
	public PacketServerLogin(String name) {
		this.name = name;
	}

	/**
	 *
	 * @return The name of the player.
	 */
	public String getName() {
		return name;
	}
}
