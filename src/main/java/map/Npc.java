package map;

import java.io.IOException;
import client.Player;
import io.Message;

public class Npc {
    public static String CHAT_MR_BALLARD = "Chiến trường mở đăng ký vào 21h00 các ngày lẻ trong tuần và " +"Chiến trường bắt đầu vào 21h30 phút ";
    public static String CHAT_TOP = "Cám ơn các bạn đã like cho mình,hihi!";
    public static String CHAT_PHO_CHI_HUY = "Muốn chơi mà không muốn nạp thì chỉ có như sever này\n" +
            "Hãy là một người chơi thông minh";
    public static String CHAT_PHAP_SU = "Sever đang trong gian đoạn test\n" +
            "Vượt Link thi làm trên web";
    public static String CHAT_ZORO = "sever thuê kênh youtube KĐT Game đồng hành đến khi sập\n" +
            "Ủng hộ cho cả chủ kênh nha !!!";
    public static String CHAT_AMAN = "Đm có cái ghim ở box zalo mà không chịu check, hỏi hỏi cc\n" +
            "Làm gì thì cũng phải dùng cái đầu trên đừng suy nghĩ bằng đầu dưới";
    public static String CHAT_ODA = "Check zalo đều đều nha mấy ní, chủ yếu là chơi đông mới vui\n" +
            "Cũng như tình yêu không một nửa bao giờ...";
    public static String CHAT_LISA ="Ai làm chả phải vì tiền, có đam mê thì cũng phải ra tiền\n" +
            "Chứ không thì bỏ thời gian ra để làm cái gì ?";
    public static String CHAT_SOPHIA ="1 ngày bỏ ra 60 phút vượt link có ngay 100k coin để sắm đồ\n" +
            "Hoặc bạn có thể đi buôn admin sẽ mua lại chỗ vàng của bạn";
    public static String CHAT_HAMMER = "Tôi chỉ cần các bạn vượt link thôi nạp làm gì cho tốn tiền ra\n" +
            "Bạn được niềm vui tụi tôi có tiền duy trì sever.";
    public static String CHAT_ZULU = "Vượt link thì mới nhanh giàu\n" +
            "chăm chỉ vượt link giúp mình giúp cả đội ngũ sever..";
    public static String CHAT_DOUBA = "Đừng mơ tưởng đến tạo nhiều clone\n" +
            "Nay anh xử lý sạch và sẽ hết";
    public static String CHAT_ANNA = "Có làm thì mới có ăn\n" +
            "Lúc đéo nào cũng nạp thì sao mà khá lên được";
    public static String CHAT_BXH = "Có Lỗi Đéo Báo Tội Đáng Muôn Band, Sống Ngay Thẳng Thì Đỡ Bị Thoát Vị Đĩa Đệm";
      
	public static void chat(Map map, String txt, int id) throws IOException {
		Message m = new Message(23);
		m.writer().writeUTF(txt);
		m.writer().writeByte(id);
		for (int j = 0; j < map.players.size(); j++) {
			Player p0 = map.players.get(j);
			if (p0 != null && p0.map.equals(map)) {
				p0.conn.addmsg(m);
			}
		}
		m.cleanup();
	}
}
