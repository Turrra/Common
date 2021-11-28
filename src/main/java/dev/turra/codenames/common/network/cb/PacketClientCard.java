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

	/**
	 * Client bound packet. Provides information about the card at x and y coordinates
	 * @param x x coordinate
	 * @param y y coordinate
	 * @param word word on the card
	 * @param color color of the card
	 */
	public PacketClientCard(int x, int y, String word, CardColor color) {
		this.x = x;
		this.y = y;
		this.word = word;
		this.color = color;
	}

	/**
	 *
	 * @return X coordinate
	 */
	public int getX() {
		return x;
	}

	/**
	 *
	 * @return X coordinate
	 */
	public int getY() {
		return y;
	}

	/**
	 *
	 * @return Word on the card
	 */
	public String getWord() {
		return word;
	}

	/**
	 *
	 * @return Color of the card
	 */
	public CardColor getColor() {
		return color;
	}
}
