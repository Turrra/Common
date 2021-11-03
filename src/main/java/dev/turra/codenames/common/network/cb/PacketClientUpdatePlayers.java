package dev.turra.codenames.common.network.cb;

import dev.turra.codenames.common.Role;
import dev.turra.codenames.common.Team;
import dev.turra.codenames.common.network.Packet;

public class PacketClientUpdatePlayers extends Packet {

	public Team team;
	public Role role;
	public String players;

	public PacketClientUpdatePlayers(Team team, Role role, String players) {
		this.team = team;
		this.role = role;
		this.players = players;
	}
}
