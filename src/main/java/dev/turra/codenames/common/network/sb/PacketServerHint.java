package dev.turra.codenames.common.network.sb;

import dev.turra.codenames.common.network.Packet;

public class PacketServerHint extends Packet {

	private String hint;
	private int wordAmount;

    public PacketServerHint(String hint, int wordAmount) {
        this.hint = hint;
        this.wordAmount = wordAmount;
    }

    public String getHint() {
        return hint;
    }

    public int getWordAmount() {
        return wordAmount;
    }

}
