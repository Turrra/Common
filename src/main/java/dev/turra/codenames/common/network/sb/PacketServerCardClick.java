package dev.turra.codenames.common.network.sb;

import dev.turra.codenames.common.network.Packet;

public class PacketServerCardClick extends Packet {

	private int x;
	private int y;

	public PacketServerCardClick(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
