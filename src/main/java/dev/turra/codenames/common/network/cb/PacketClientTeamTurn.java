package dev.turra.codenames.common.network.cb;

import dev.turra.codenames.common.Team;
import dev.turra.codenames.common.network.Packet;

public class PacketClientTeamTurn extends Packet {

	private Team team;

	public PacketClientTeamTurn(Team team) {
		this.team = team;
	}

	public Team getTeam() {
		return team;
	}
}
