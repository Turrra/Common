package dev.turra.codenames.common.network.cb;

import dev.turra.codenames.common.Team;
import dev.turra.codenames.common.network.Packet;

public class PacketClientTeamTurn extends Packet {

	private Team team;

	/**
	 * Client bound packet. Sent when the team provided gets their turn.
	 * @param team The team whose turn it is.
	 */
	public PacketClientTeamTurn(Team team) {
		this.team = team;
	}

	/**
	 *
	 * @return The team whose turn it is.
	 */
	public Team getTeam() {
		return team;
	}
}
