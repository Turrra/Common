package dev.turra.codenames.common.network.cb;

import dev.turra.codenames.common.CardColor;
import dev.turra.codenames.common.network.Packet;

public class PacketClientCardReveal extends Packet {

	private int x;
	private int y;
	private CardColor color;

	/**
	 * Client bound packet. Provides the color of the card that was revealed.
	 * @param x X coordinate of the card.
	 * @param y Y coordinate of the card.
	 * @param color Color of the card.
	 */
	public PacketClientCardReveal(int x, int y, CardColor color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}

	/**
	 *
	 * @return X coordinate of the card.
	 */
	public int getX() {
		return x;
	}

	/**
	 *
	 * @return Y coordinate of the card.
	 */
	public int getY() {
		return y;
	}

	/**
	 *
	 * @return The color of the card.
	 */
	public CardColor getColor() {
		return color;
	}
}
