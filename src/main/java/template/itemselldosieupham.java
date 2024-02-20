package template;

import java.util.ArrayList;
import java.util.List;
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
                = "   [[4587,[[2,1000],[96,10]],4,50000],"
                + "[4590,[[3,1000],[96,10]],4,50000],"
                + "[4589,[[4,1000],[96,10]],4,50000],"
                + "[4588,[[1,1000],[96,10]],4,50000]]";
        String tt = "[[4756,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],4,100000]," // giáp ma tốc độ
                //+ "[4757,[[15,2000],[27,2000]],4,50000]," // mặt nạ ma tốc độ
                + "[4716,[[23,10],[24,10],[25,10],[26,10],[27,1000],[30,1000]],5,50000]" // khẩu trang xanh
                + "[4717,[[23,15],[24,15],[25,15],[26,15],[27,1500],[29,1500]],5,100000]" // khẩu trang đỏ
                + "[4718,[[7,1500],[8,1500],[9,1500],[10,1500],[11,1500],[-76, 1000]],5,50000]" // tai nghe phong cách
                + "[4719,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[-76, 1500]],5,100000]" // tai nghe mộng mơ
                // áo choàng
                + "[4676,[[7,1500],[8,1500],[9,1500],[10,1500],[11,1500],[27,1500],[28,1500]],5,100000]"
                + "[4677,[[7,1500],[8,1500],[9,1500],[10,1500],[11,1500],[27,1500],[28,1500]],5,100000]"
                + "[4678,[[7,1500],[8,1500],[9,1500],[10,1500],[11,1500],[27,1500],[28,1500]],5,100000]"
                + "]";
        JSONArray js = (JSONArray) JSONValue.parse(medal);
        for (int i = 0; i < js.size(); i++) {
            itemselldosieupham temp = new itemselldosieupham();
            JSONArray js2 = (JSONArray) JSONValue.parse(js.get(i).toString());
            temp.id = Short.parseShort(js2.get(0).toString());
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
