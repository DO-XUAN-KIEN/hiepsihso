package event_daily;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import ai.Player_Nhan_Ban;
import client.Player;
import core.Manager;
import core.Service;
import core.Util;
import io.Message;
import map.LeaveItemMap;
import static map.LeaveItemMap.leave_vang;
import map.Map;
import map.MapService;
import map.Mob_in_map;
import map.Vgo;
import template.ItemTemplate3;
import template.MainObject;
import template.Mem_upngocrong;

public class upngocrong {
    private static upngocrong instance;
    private HashMap<String, Mem_upngocrong> list;
    private List<Mem_upngocrong> BXH;
    private int status; // 0 sleep, 1 : register, 2 : start
    private int time;
    public int[] info_house;
    public List<Player_Nhan_Ban> list_ai;
    public List<Mob_in_map> boss;


    public int getStatus() {
        return status;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int i) {
        this.time = i;
    }

    public static upngocrong gI() {
        if (instance == null) {
            instance = new upngocrong();
            instance.init();
        }
        return instance;
    }

    private void init() {
        this.list = new HashMap<>();
        this.BXH = new ArrayList<>();
        this.status = 0;
        this.time = 0;
        list_ai = Player_Nhan_Ban.init();
        this.boss = new ArrayList<>();
        //
    }

    public synchronized void update() {
        try {
            if (this.status == 1) {
                this.time--;
                if (this.time <= 0) {
                    this.start();
                }
            } else if (this.status == 2) {
                this.time--;
                if (this.time <= 0) {
                    this.finish();
                }
            }
        } catch (IOException e) {
        }
    }
    private void start() throws IOException {
        if (this.status == 1) {
            Manager.gI().chatKTGprocess("Map Tiền Tài Đã Mở , hãy đến NPC Doubar Báo danh");
            this.BXH.clear();
            this.status = 2;
            this.time = 60 * 60;
            List<Mem_upngocrong> list = new ArrayList<>();
            for (Entry<String, Mem_upngocrong> en : this.list.entrySet()) {
                list.add(en.getValue());
            }
            //
            for (Entry<String, Mem_upngocrong> en : this.list.entrySet()) {
                Player p0 = Map.get_player_by_name(en.getKey());
                if (p0 != null) {
                    Vgo vgo = new Vgo();
                    vgo.id_map_go = 99;
                    vgo.x_new = 257;
                    vgo.y_new = 1524;
                    p0.change_map(p0, vgo);
                    break;
                }
            }
        }
    }
    private void finish() throws IOException {
        if (this.status == 2) {
            Manager.gI().chatKTGprocess("Map Tiền Tài Đã Kết Thúc");
            //
            for (Entry<String, Mem_upngocrong> en : this.list.entrySet()) {
                Player p0 = Map.get_player_by_name(en.getKey());
                if (p0 != null) {
                    Vgo vgo = new Vgo();
                    vgo.id_map_go = 1;
                    vgo.x_new = 432;
                    vgo.y_new = 354;
                    p0.change_map(p0, vgo);
                    MapService.change_flag(p0.map, p0, -1);
                }
            }
            //
            this.list.clear();
            this.status = 0;
            this.time = 0;
        }
    }

    public synchronized void register(Player p, int type) throws IOException {
        if (this.list.containsKey(p.name)) {
            Service.send_notice_box(p.conn, "Đã đăng ký rồi");
        } else {
            Mem_upngocrong temp = new Mem_upngocrong();
            temp.name = p.name;
            temp.point = 0;
            temp.village = 0;
            temp.received = false;
            this.list.put(p.name, temp);
            Service.send_notice_box(p.conn, "Đăng ký thành công");
        }
    }

    public synchronized void open_register() throws IOException {
        if (this.status == 0) {
            Manager.gI().chatKTGprocess("Tiền Tài Đã Mở Đăng Ký");
            this.status = 1;
            this.time = 60*15;
        }
    }
    public void send_info(Player p) throws IOException {
        this.update_time(p);
        for (int i = 2; i < 6; i++) {
            Message m = new Message(-94);
            m.writer().writeByte(i); //
            m.writer().writeByte(1);
            p.conn.addmsg(m);
            m.cleanup();
        }
    }

    private int total_p_of_house(int i) {
        int result = 0;
        for (Entry<String, Mem_upngocrong> en : this.list.entrySet()) {
            if (en.getValue().village == i) {
                Player p0 = Map.get_player_by_name(en.getKey());
                if (p0 != null && Map.is_map_up_ngoc(p0.map.map_id)) {
                    result++;
                }
            }
        }
        return result;
    }

    private void update_time(Player p) throws IOException {
        Message m = new Message(-94);
        m.writer().writeByte(-1); //
        m.writer().writeByte(0);
        m.writer().writeShort(0);
        m.writer().writeByte(0);
        m.writer().writeLong(System.currentTimeMillis() - (60 * 60 - this.time) * 1000L);
        p.conn.addmsg(m);
        m.cleanup();
    }
    public static void Obj_Die(Map map, MainObject mainAtk, MainObject focus)throws IOException{
        if(!mainAtk.isPlayer() || !focus.isMob())return;
        Player p = (Player)mainAtk;
        Mob_in_map mob = (Mob_in_map)focus;
        if (mob != null) {
            // roi do boss co dinh
            short[] id_item_leave4 = new short[]{};
            short[] id_item_leave = new short[]{};
            short sizeRandomMedal = 0;
            int ran = Util.random(10000);
            switch (mob.template.mob_id) {
                case 198: {
                    if(ran < 1)
                        id_item_leave = new short[]{(short) Util.random(464,471)};
                    break;
                }
                case 200: {
                    if(ran < 1)
                        id_item_leave = new short[]{(short) Util.random(464,471)};
                    break;
                }
            }
            for (int i = 0; i < 1; i++) {
                for (short id : id_item_leave) {
                    LeaveItemMap.leave_item_by_type7(map, id, p, mob.index,p.index);
                }
            }
        }
    }
    public Mem_upngocrong get_infor_register(String name) {
        return this.list.get(name);
    }
}
