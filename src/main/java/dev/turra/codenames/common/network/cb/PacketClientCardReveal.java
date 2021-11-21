package dev.turra.codenames.common.network.cb;

import dev.turra.codenames.common.CardColor;
import dev.turra.codenames.common.network.Packet;

public class PacketClientCardReveal extends Packet {

	private int x;
	private int y;
	private CardColor color;

	public PacketClientCardReveal(int x, int y, CardColor color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public CardColor getColor() {
		return color;
	}
}
