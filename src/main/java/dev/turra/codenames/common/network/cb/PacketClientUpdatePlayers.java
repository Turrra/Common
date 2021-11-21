package dev.turra.codenames.common.network.cb;

import dev.turra.codenames.common.Role;
import dev.turra.codenames.common.Team;
import dev.turra.codenames.common.network.Packet;

public class PacketClientUpdatePlayers extends Packet {

	private Team team;
	private Role role;
	private String players;

	public PacketClientUpdatePlayers(Team team, Role role, String players) {
		this.team = team;
		this.role = role;
		this.players = players;
	}

	public Team getTeam() {
		return team;
	}

	public Role getRole() {
		return role;
	}

	public String getPlayers() {
		return players;
	}
}
