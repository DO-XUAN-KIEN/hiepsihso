package template;

import java.util.ArrayList;
import java.util.List;
import client.Player;

public class Part_fashion {
    public static final List<Short> fashions = new ArrayList<>();
    public static final List<Part_fashion> entrys = new ArrayList<>();
    public short id;
    public byte[] part;

    public static byte[] get_part(Player p) {
        if (p.item.wear[0] != null) {
            for (Part_fashion temp : entrys) {
                if (temp.id == p.item.wear[0].id) {
                    return temp.part;
                }
            }
        }
        if((p.item.wear[1] != null && p.item.wear[6] != null && p.item.wear[7] != null) &&
                (p.item.wear[1].id >= 4850 || p.item.wear[6].id >= 4850 || p.item.wear[7].id >= 4850)) {
            if (p.item.wear[1] != null && p.item.wear[1].id >= 4850) {
                for (Part_fashion temp : entrys) {
                    if (temp.id == p.item.wear[1].id) {
                        return temp.part;
                    }
                }
            }
            if (p.item.wear[7] != null && p.item.wear[7].id >= 4850) {
                for (Part_fashion temp : entrys) {
                    if (temp.id == p.item.wear[7].id) {
                        return temp.part;
                    }
                }
            }
            if (p.item.wear[6] != null && p.item.wear[6].id >= 4850) {
                for (Part_fashion temp : entrys) {
                    if (temp.id == p.item.wear[6].id) {
                        return temp.part;
                    }
                }
            }
        }else {
            if (p.item.wear[11] != null) {
                for (Part_fashion temp : entrys) {
                    if (temp.id == p.item.wear[11].id) {
                        return temp.part;
                    }
                }
            }
        }
        return new byte[]{-1, -1, -1, -1, -1, -1, -1};
    }
}
