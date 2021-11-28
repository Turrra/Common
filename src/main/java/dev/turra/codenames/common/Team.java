package dev.turra.codenames.common;

public enum Team {
	RED("Red", CardColor.RED), BLUE("Blue", CardColor.BLUE);

	private String name;
	private CardColor color;

	Team(String name, CardColor color) {
		this.name = name;
		this.color = color;
	}

	/**
	 * @return Returns the name of the team
	 */
	public String getName() {
        return name;
    }

	/**
	 * @return Returns the color of the team
	 */
	public CardColor getColor() {
        return color;
    }
}
