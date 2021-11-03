package dev.turra.codenames.common.network.sb;

import dev.turra.codenames.common.network.Packet;
import dev.turra.codenames.common.Role;
import dev.turra.codenames.common.Team;

public class PacketServerTeamRole extends Packet {

	public Team team;
	public Role role;

	public PacketServerTeamRole(Team team, Role role) {
		this.team = team;
		this.role = role;
	}
}
