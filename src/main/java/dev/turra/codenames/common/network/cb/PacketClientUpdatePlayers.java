package dev.turra.codenames.common.network.cb;

import dev.turra.codenames.common.Role;
import dev.turra.codenames.common.Team;
import dev.turra.codenames.common.network.Packet;

public class PacketClientUpdatePlayers extends Packet {

	private Team team;
	private Role role;
	private String players;

	/**
	 * Client bound packet. Sent when a player joins a team and a role.
	 * @param team The team the player joined.
	 * @param role The role the player joined.
	 * @param players Players in that team and role.
	 */
	public PacketClientUpdatePlayers(Team team, Role role, String players) {
		this.team = team;
		this.role = role;
		this.players = players;
	}

	/**
	 *
	 * @return The team the player joined.
	 */
	public Team getTeam() {
		return team;
	}

	/**
	 *
	 * @return The role the player joined.
	 */
	public Role getRole() {
		return role;
	}

	/**
	 *
	 * @return The players in that team and role.
	 */
	public String getPlayers() {
		return players;
	}
}
