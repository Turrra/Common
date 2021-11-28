package dev.turra.codenames.common.network.cb;

import dev.turra.codenames.common.Team;
import dev.turra.codenames.common.network.Packet;

public class PacketClientUpdateScore extends Packet {

	private Team team;
	private int score;

	/**
	 * Client bound packet. Sent to the client to notify about the score change.
	 * @param team The team whose score was changed
	 * @param score The new score
	 */
	public PacketClientUpdateScore(Team team, int score) {
        this.team = team;
        this.score = score;
    }

	/**
	 *
	 * @return The team whose score was changed
	 */
	public Team getTeam() {
        return team;
    }

	/**
	 *
	 * @return The new score
	 */
	public int getScore() {
        return score;
    }

}
