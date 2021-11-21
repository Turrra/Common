package dev.turra.codenames.common;

public enum Team {
	RED(CardColor.RED), BLUE(CardColor.BLUE);

	private CardColor color;

	Team(CardColor color) {
		this.color = color;
	}

	public CardColor getColor() {
        return color;
    }
}
