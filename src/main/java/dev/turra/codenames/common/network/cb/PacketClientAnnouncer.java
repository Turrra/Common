package dev.turra.codenames.common.network.cb;

import dev.turra.codenames.common.network.Packet;

import java.awt.*;

public class PacketClientAnnouncer extends Packet {

	private String message;
	private Color color;

	public PacketClientAnnouncer(String message, Color color) {
		this.message = message;
		this.color = color;
	}

    public String getMessage() {
        return message;
    }

	public Color getColor() {
        return color;
    }

}
