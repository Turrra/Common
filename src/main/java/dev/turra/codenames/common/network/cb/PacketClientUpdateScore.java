package dev.turra.codenames.common.network.cb;

import dev.turra.codenames.common.Team;
import dev.turra.codenames.common.network.Packet;

public class PacketClientUpdateScore extends Packet {

	private Team team;
	private int score;

	public PacketClientUpdateScore(Team team, int score) {
        this.team = team;
        this.score = score;
    }

	public Team getTeam() {
        return team;
    }

	public int getScore() {
        return score;
    }

}
