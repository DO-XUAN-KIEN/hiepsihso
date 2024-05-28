
package Helps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class CheckItem {
    public static boolean isMeDay(short id)
    {
        if(id >= 4587 && id <= 4590)
            return true;
        return false;
    }
    public static boolean isMeDaysieucap(short id)
    {
        if(id == 4591)
            return true;
        return false;
    }
    
    public static boolean item4CanTrade(short id)
    {
        List<Short> cantrade = new ArrayList<>(java.util.Arrays.asList((short)101,(short)205,(short)206,(short)207,(short)224,(short)249,(short)273,(short)274));
        boolean sknoel = (id >= 113 && id <= 123) || id == 183;
        boolean vpsk = (id >= 28 && id <= 47) || (id >= 89 && id <= 130 && id!= 124 && id!= 125) || (id >= 137 && id <= 145 && id!= 142 && id!= 143) || (id >= 148 && id <= 158) || id == 162
                || id == 172 || (id >= 183 && id <= 195) || (id >= 199 && id <= 204) || (id >= 254 && id <= 259) || (id >= 303 && id <= 308);
        return sknoel || vpsk || cantrade.contains(id);
    }
    public static boolean isBuyItemCoin(short id)
    {
        List<Short> itemcoin = new ArrayList<>(java.util.Arrays.asList((short)4587, (short)4588, (short)4589, (short)4590, (short)4672, (short)4675, (short)4673, (short)4674, (short)4718, (short)4779));
        return itemcoin.contains(id);
    }
    public static boolean isBuyItemSieupham(short id)
    {
        List<Short> itemsieupham = new ArrayList<>(java.util.Arrays.asList((short)4591,(short)4850,(short)4851,(short)4852,(short)4853,(short)4854,(short)4855,(short)4856,(short)4857,(short)4858,(short)4859
                ,(short)4860,(short)4861,(short)4862,(short)4863,(short)4864,(short)4865,(short)4866,(short)4867,(short)4868,(short)4869,(short)4870,(short)4871,(short)4872,(short)4873,(short)4874,(short)4875,(short)4876,(short)4877,(short)4878,(short)4879
                ,(short)4880,(short)4881,(short)4882,(short)4883,(short)4884,(short)4885,(short)4886,(short)4887,(short)4888,(short)4889,(short)4890,(short)4891,(short)4892,(short)4893,(short)4894,(short)4895,(short)4896,(short)4897,(short)4898,(short)4899
                ,(short)4900,(short)4901,(short)4902));
        return itemsieupham.contains(id);
    }
    
    public static boolean isDaKham(short id)
    {
        return
                (id >= 352 && id<= 356) || (id >= 382 && id<= 386) || //hỗn nguyễn
                (id >= 357 && id<= 361) || (id >= 387 && id<= 391) || //khải hoàn
                (id >= 362 && id<= 366) || (id >= 392 && id<= 396) || //lục bảo
                (id >= 367 && id<= 371) || (id >= 397 && id<= 401) || //phong ma
                (id >= 372 && id<= 376) || (id >= 402 && id<= 406) || //sinh mệnh 
                (id >= 377 && id<= 381) || (id >= 407 && id<= 411) ; //tâm linh
    }
}
