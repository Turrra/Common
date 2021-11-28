package dev.turra.codenames.common.network.cb;

import dev.turra.codenames.common.Team;
import dev.turra.codenames.common.network.Packet;

public class PacketClientHint extends Packet {

	private String hint;
	private int wordAmount;
	private Team team;

	/**
	 * Client bound packet. Provides the hint and amount of words associated with the hint.
	 * @param hint The hint to be displayed.
	 * @param wordAmount The amount of words associated with the hint.
	 * @param team The team that gave the hint.
	 */
	public PacketClientHint(String hint, int wordAmount, Team team) {
        this.hint = hint;
        this.wordAmount = wordAmount;
		this.team = team;
    }

	/**
	 *
	 * @return The hint.
	 */
    public String getHint() {
        return hint;
    }

	/**
	 *
	 * @return The amount of words associated with the hint.
	 */
    public int getWordAmount() {
        return wordAmount;
    }

	/**
	 *
	 * @return The team that gave the hint.
	 */
	public Team getTeam() {
        return team;
    }

}
