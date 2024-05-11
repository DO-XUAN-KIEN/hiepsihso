package template;

import client.Player;

public class Part_player {

    public byte type;
    public byte part;
    public Player p;
    public Part_player(){}
    public Part_player(int type, int part){
        this.type = (byte) type;
        this.part = (byte) part;
    }
}
