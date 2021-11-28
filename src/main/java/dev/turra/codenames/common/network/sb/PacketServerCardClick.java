package dev.turra.codenames.common.network.sb;

import dev.turra.codenames.common.network.Packet;

public class PacketServerCardClick extends Packet {

	private int x;
	private int y;

	/**
	 * Server bound packet. Notifies the server that a card was clicked.
	 * @param x The x coordinate of the card clicked.
	 * @param y The y coordinate of the card clicked.
	 */
	public PacketServerCardClick(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 *
	 * @return The x coordinate of the card clicked.
	 */
	public int getX() {
		return x;
	}

	/**
	 *
	 * @return The y coordinate of the card clicked.
	 */
	public int getY() {
		return y;
	}
}
