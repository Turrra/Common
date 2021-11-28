package dev.turra.codenames.common.network.cb;

import dev.turra.codenames.common.network.Packet;

import java.awt.*;

public class PacketClientAnnouncer extends Packet {

	private String message;
	private Color color;

	/**
	 * Client bound packet. Sets the message in the top middle of the screen
	 * @param message The message to display
	 * @param color The color of the message
	 */
	public PacketClientAnnouncer(String message, Color color) {
		this.message = message;
		this.color = color;
	}

	/**
	 *
	 * @return The message to display
	 */
    public String getMessage() {
        return message;
    }

	/**
	 *
	 * @return The color of the message
	 */
	public Color getColor() {
        return color;
    }

}
