package dev.turra.codenames.common;

public enum Team {
	RED("Red", CardColor.RED), BLUE("Blue", CardColor.BLUE);

	private String name;
	private CardColor color;

	Team(String name, CardColor color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
        return name;
    }

	public CardColor getColor() {
        return color;
    }
}
