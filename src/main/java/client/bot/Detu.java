package client.bot;

import client.Player;
import io.Session;

public class Detu extends Player {
    public Detu(Session conn) {
        super(conn);
    }

    private void init(){
        Detu detu = new Detu(conn);
        detu.level = 1;
        detu.index = 1;
        detu.x = conn.p.x;
        detu.y = conn.p.y;
        detu.x_old = conn.p.x_old;
        detu.y_old = conn.p.y_old;
        detu.name = conn.p.name;
        detu.name_trade = conn.p.name_trade;
        detu.eye = conn.p.eye;
        detu.map = conn.p.map;
        detu.body = conn.p.body;
        detu.head = conn.p.head;
        detu.hair = conn.p.hair;
        detu.hp = conn.p.hp;
        detu.mp = conn.p.mp;
        detu.hp_max = conn.p.get_HpMax();
        detu.mp_max = conn.p.get_MpMax();
        detu.clazz = conn.p.clazz;
        detu.exp = conn.p.exp;
        detu.item = conn.p.item;
        detu.kham = conn.p.kham;
        detu.point1 = conn.p.point1;
        detu.point2 = conn.p.point2;
        detu.point3 = conn.p.point4;
        detu.point4 = conn.p.point4;
        detu.tiemnang = conn.p.tiemnang;
        detu.kynang = conn.p.kynang;
        detu.skills = conn.p.skills;
        detu.mypet = conn.p.mypet;
        detu.isdie = conn.p.isdie;
        detu.party = conn.p.party;
        detu.isATK = conn.p.isATK;
        detu.part_p = conn.p.part_p;
        detu.pointpk = conn.p.pointpk;
        detu.in4_auto = conn.p.in4_auto;
        detu.hieuchien = conn.p.hieuchien;
        detu.pointarena = conn.p.pointarena;
        detu.pet_atk_speed = conn.p.pet_atk_speed;
        detu.time_use_item_arena = conn.p.time_use_item_arena;
        detu.time_affect_special_sk = conn.p.time_affect_special_sk;
        detu.already_setup = conn.p.already_setup;
        detu.name_trade = conn.p.name_trade;
        detu.money_trade = conn.p.money_trade;
        detu.type_use_mount = conn.p.type_use_mount;
        detu.point_active = conn.p.point_active;
        detu.skill_point = conn.p.skill_point;
        detu.quest_daily = conn.p.quest_daily;
        detu.id_horse = conn.p.id_horse;
        detu.my_store = conn.p.my_store;
        detu.medal_create_material = conn.p.medal_create_material;
        detu.list_item_trade = conn.p.list_item_trade;
        detu.fashion = conn.p.fashion;
        detu.other_mob_inside = conn.p.other_mob_inside;
        detu.MainEff = conn.p.list_eff;
        detu.MaterialItemStar = conn.p.MaterialItemStar;
        detu.rms_save = conn.p.rms_save;
        detu.pet_follow = conn.p.pet_follow;
        detu.Eff_me_kham = conn.p.list_eff;
        detu.it_wedding = conn.p.it_wedding;
        detu.in4_wedding = conn.p.in4_wedding;
        detu.dame = conn.p.get_DameProp(1);
        detu.def = conn.p.get_DefBase();
        detu.map_id =conn.p.map_id;
    }

}
