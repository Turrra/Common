package dev.turra.codenames.common.network.cb;

import dev.turra.codenames.common.Team;
import dev.turra.codenames.common.network.Packet;

public class PacketClientHint extends Packet {

	private String hint;
	private int wordAmount;
	private Team team;

	public PacketClientHint(String hint, int wordAmount, Team team) {
        this.hint = hint;
        this.wordAmount = wordAmount;
		this.team = team;
    }

    public String getHint() {
        return hint;
    }

    public int getWordAmount() {
        return wordAmount;
    }

	public Team getTeam() {
        return team;
    }

}
