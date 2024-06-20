package template;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONValue;

public class Itemselldosieupham {
    public static List<Itemselldosieupham> entry = new ArrayList<>();
    public short id;
    public List<Option> op;
    public int price;
    public byte color;

    static {
        String medal
                = "["
                + "[4591,[[0,3000],[96,111]],5,10000000],"
                + "[4899,[[1,3000],[96,111]],5,10000000],"
                + "[4900,[[2,3000],[96,111]],5,10000000],"
                + "[4901,[[3,3000],[96,111]],5,10000000],"
                + "[4902,[[4,3000],[96,111]],5,10000000],"
                + "]";
        String tt = "["
                //vũ khí
                + "[4887,[[2,3000],[23,30],[33,500],[96,111]],5,10000000],"//lửa
                + "[4889,[[4,3000],[24,30],[34,500],[96,111]],5,10000000],"// độc
                + "[4888,[[3,3000],[26,30],[36,500],[96,111]],5,10000000],"// điện
                + "[4890,[[1,3000],[25,30],[35,500],[96,111]],5,10000000],"// băng
                // mũ
                + "[4882,[[0,800],[96,111]],5,10000000],"
                + "[4883,[[1,800],[96,111]],5,10000000],"
                + "[4884,[[2,800],[96,111]],5,10000000],"
                + "[4885,[[3,800],[96,111]],5,10000000],"
                + "[4886,[[4,800],[96,111]],5,10000000],"
                // áo
                + "[4877,[[0,800],[96,111]],5,10000000],"
                + "[4878,[[1,800],[96,111]],5,10000000],"
                + "[4879,[[2,800],[96,111]],5,10000000],"
                + "[4880,[[3,800],[96,111]],5,10000000],"
                + "[4881,[[4,800],[96,111]],5,10000000],"
                // quần
                + "[4872,[[0,800],[96,111]],5,10000000],"
                + "[4873,[[1,800],[96,111]],5,10000000],"
                + "[4874,[[2,800],[96,111]],5,10000000],"
                + "[4875,[[3,800],[96,111]],5,10000000],"
                + "[4876,[[4,800],[96,111]],5,10000000],"
                // giày
                + "[4862,[[0,800],[96,111]],5,10000000],"
                + "[4863,[[1,800],[96,111]],5,10000000],"
                + "[4864,[[2,800],[96,111]],5,10000000],"
                + "[4865,[[3,800],[96,111]],5,10000000],"
                + "[4866,[[4,800],[96,111]],5,10000000],"
                // găng
                + "[4857,[[0,800],[96,111]],5,10000000],"
                + "[4858,[[1,800],[96,111]],5,10000000],"
                + "[4859,[[2,800],[96,111]],5,10000000],"
                + "[4860,[[3,800],[96,111]],5,10000000],"
                + "[4861,[[4,800],[96,111]],5,10000000],"
                // nhẫn
                + "[4852,[[0,800],[96,111]],5,10000000],"
                + "[4853,[[1,800],[96,111]],5,10000000],"
                + "[4854,[[2,800],[96,111]],5,10000000],"
                + "[4855,[[3,800],[96,111]],5,10000000],"
                + "[4856,[[4,800],[96,111]],5,10000000],"
                // dây chuyền
                + "[4867,[[0,800],[96,111]],5,10000000],"
                + "[4868,[[1,800],[96,111]],5,10000000],"
                + "[4869,[[2,800],[96,111]],5,10000000],"
                + "[4870,[[3,800],[96,111]],5,10000000],"
                + "[4871,[[4,800],[96,111]],5,10000000],"
                // tóc vàng
                + "[4851,[[0,800],[96,111]],5,10000000],"
                + "[4895,[[1,800],[96,111]],5,10000000],"
                + "[4896,[[2,800],[96,111]],5,10000000],"
                + "[4897,[[3,800],[96,111]],5,10000000],"
                + "[4898,[[4,800],[96,111]],5,10000000],"
                // tóc xanh
                + "[4850,[[0,800],[96,111]],5,10000000],"
                + "[4891,[[1,800],[96,111]],5,10000000],"
                + "[4892,[[2,800],[96,111]],5,10000000],"
                + "[4893,[[3,800],[96,111]],5,10000000],"
                + "[4894,[[4,800],[96,111]],5,10000000],"
                + "]";
        JSONArray js = (JSONArray) JSONValue.parse(medal);
        for (int i = 0; i < js.size(); i++) {
            Itemselldosieupham temp = new Itemselldosieupham();
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
            Itemselldosieupham.entry.add(temp);
        }
        //
        js.clear();
        js = (JSONArray) JSONValue.parse(tt);
        for (int i = 0; i < js.size(); i++) {
            Itemselldosieupham temp = new Itemselldosieupham();
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
            Itemselldosieupham.entry.add(temp);
        }
    }
}
