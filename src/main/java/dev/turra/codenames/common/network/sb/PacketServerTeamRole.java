package dev.turra.codenames.common.network.sb;

import dev.turra.codenames.common.network.Packet;
import dev.turra.codenames.common.Role;
import dev.turra.codenames.common.Team;

public class PacketServerTeamRole extends Packet {

	private Team team;
	private Role role;

	/**
	 * Server bound packet. Sent when a player joins a team and a role.
	 * @param team The team the player joined.
	 * @param role The role the player joined.
	 */
	public PacketServerTeamRole(Team team, Role role) {
		this.team = team;
		this.role = role;
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
}
