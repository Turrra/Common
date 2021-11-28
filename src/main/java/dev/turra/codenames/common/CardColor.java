package dev.turra.codenames.common;

import java.awt.*;
public enum CardColor {
	RED(new Color(231, 11, 81)),
	BLUE(new Color(42, 157, 143)),
	ASSASSIN(new Color(38, 70, 83)),
	CITIZEN(new Color(244, 162, 97)),
	EMPTY(new Color(233,192,106)),
	BG(new Color(119, 119, 119)),
	REVEALED(new Color(255, 255, 255));

	Color color;

	CardColor(Color color) {
		this.color = color;
	}

	/**
	 * @return Returns the {@link Color} value of the {@link CardColor}
	 */
	public Color getColor() {
		return color;
	}
}
