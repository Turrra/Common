package dev.turra.codenames.common.network.sb;

import dev.turra.codenames.common.network.Packet;

public class PacketServerHint extends Packet {

	private String hint;
	private int wordAmount;

    /**
     * Server bound packet. Sent when a player provides a hint
     * @param hint The hint
     * @param wordAmount The amount of words associated with the hint
     */
    public PacketServerHint(String hint, int wordAmount) {
        this.hint = hint;
        this.wordAmount = wordAmount;
    }

    /**
     *
     * @return The hint
     */
    public String getHint() {
        return hint;
    }

    /**
     *
     * @return The amount of words associated with the hint
     */
    public int getWordAmount() {
        return wordAmount;
    }

}
