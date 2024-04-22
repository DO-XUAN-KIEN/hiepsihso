package template;

import java.util.ArrayList;
import java.util.List;

import core.Manager;
import core.Service;
import org.json.simple.JSONArray;
import org.json.simple.JSONValue;

public class itemselldosieupham {
    public static List<itemselldosieupham> entry = new ArrayList<>();
    public short id;
    public List<Option> op;
    public int price;
    public byte color;

    static {
        String medal
                = "["
                + "[4591,[[0,3000],[96,111]],5,10000000],"
                + "[4591,[[1,3000],[96,111]],5,10000000],"
                + "[4591,[[2,3000],[96,111]],5,10000000],"
                + "[4591,[[3,3000],[96,111]],5,10000000],"
                + "[4591,[[4,3000],[96,111]],5,10000000],"
                + "]";
        String tt = "["
                // găng
                + "[4853,[[0,800],[96,111]],5,10000000],"
                + "[4853,[[1,800],[96,111]],5,10000000],"
                + "[4853,[[2,800],[96,111]],5,10000000],"
                + "[4853,[[3,800],[96,111]],5,10000000],"
                + "[4853,[[4,800],[96,111]],5,10000000],"
                // giày
                + "[4855,[[0,800],[96,111]],5,10000000],"
                + "[4855,[[1,800],[96,111]],5,10000000],"
                + "[4855,[[2,800],[96,111]],5,10000000],"
                + "[4855,[[3,800],[96,111]],5,10000000],"
                + "[4855,[[4,800],[96,111]],5,10000000],"
                // nhẫn
                + "[4852,[[0,800],[96,111]],5,10000000],"
                + "[4852,[[1,800],[96,111]],5,10000000],"
                + "[4852,[[2,800],[96,111]],5,10000000],"
                + "[4852,[[3,800],[96,111]],5,10000000],"
                + "[4852,[[4,800],[96,111]],5,10000000],"
                // dây chuyền
                + "[4854,[[0,800],[96,111]],5,10000000],"
                + "[4854,[[1,800],[96,111]],5,10000000],"
                + "[4854,[[2,800],[96,111]],5,10000000],"
                + "[4854,[[3,800],[96,111]],5,10000000],"
                + "[4854,[[4,800],[96,111]],5,10000000],"
                // tóc vàng
                + "[4851,[[0,800],[96,111]],5,10000000],"
                + "[4851,[[1,800],[96,111]],5,10000000],"
                + "[4851,[[2,800],[96,111]],5,10000000],"
                + "[4851,[[3,800],[96,111]],5,10000000],"
                + "[4851,[[4,800],[96,111]],5,10000000],"
                // tóc xanh
                + "[4850,[[0,800],[96,111]],5,10000000],"
                + "[4850,[[1,800],[96,111]],5,10000000],"
                + "[4850,[[2,800],[96,111]],5,10000000],"
                + "[4850,[[3,800],[96,111]],5,10000000],"
                + "[4850,[[4,800],[96,111]],5,10000000],"
                + "]";
        JSONArray js = (JSONArray) JSONValue.parse(medal);
        for (int i = 0; i < js.size(); i++) {
            itemselldosieupham temp = new itemselldosieupham();
            JSONArray js2 = (JSONArray) JSONValue.parse(js.get(i).toString());
            temp.id = Short.parseShort(js2.get(0).toString());
            //Manager.item_sell.get(Service.SHOP_ITEM).add(temp.id);
            temp.op = new ArrayList<>();
            JSONArray js3 = (JSONArray) JSONValue.parse(js2.get(1).toString());
            for (int j = 0; j < js3.size(); j++) {
                JSONArray js4 = (JSONArray) JSONValue.parse(js3.get(j).toString());
                temp.op.add(new Option(Byte.parseByte(js4.get(0).toString()), Integer.parseInt(js4.get(1).toString())));
            }
            temp.color = Byte.parseByte(js2.get(2).toString());
            temp.price = Integer.parseInt(js2.get(3).toString());
            itemselldosieupham.entry.add(temp);
        }
        //
        js.clear();
        js = (JSONArray) JSONValue.parse(tt);
        for (int i = 0; i < js.size(); i++) {
            itemselldosieupham temp = new itemselldosieupham();
            JSONArray js2 = (JSONArray) JSONValue.parse(js.get(i).toString());
            temp.id = Short.parseShort(js2.get(0).toString());
            //Manager.i.get(Service.SHOP_ITEM).add(temp.id);
            temp.op = new ArrayList<>();
            JSONArray js3 = (JSONArray) JSONValue.parse(js2.get(1).toString());
            for (int j = 0; j < js3.size(); j++) {
                JSONArray js4 = (JSONArray) JSONValue.parse(js3.get(j).toString());
                temp.op.add(new Option(Byte.parseByte(js4.get(0).toString()), Integer.parseInt(js4.get(1).toString())));
            }
            temp.color = Byte.parseByte(js2.get(2).toString());
            temp.price = Integer.parseInt(js2.get(3).toString());
            itemselldosieupham.entry.add(temp);
        }
    }
}
