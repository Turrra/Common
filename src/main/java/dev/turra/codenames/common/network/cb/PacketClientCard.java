package dev.turra.codenames.common.network.cb;

import dev.turra.codenames.common.CardColor;
import dev.turra.codenames.common.Team;
import dev.turra.codenames.common.network.Packet;

import java.awt.*;

public class PacketClientCard extends Packet {

	private int x;
	private int y;
	private String word;
	private CardColor color;

	public PacketClientCard(int x, int y, String word, CardColor color) {
		this.x = x;
		this.y = y;
		this.word = word;
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String getWord() {
		return word;
	}

	public CardColor getColor() {
		return color;
	}
}
