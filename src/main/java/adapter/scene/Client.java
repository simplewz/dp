package adapter.scene;

/**
 * Description: 客户端类<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/31 14:58
 */
public class Client {

    public static void main(String[] args) {
        Player b = new Forwards("巴蒂尔");
        b.attack();
        Player m = new Guards("麦克格雷迪");
        m.attack();

        Translator translator = new Translator("翻译官");
        ForeignCenter foreignCenter = new ForeignCenter("姚明");
        translator.setForeignCenter(foreignCenter);
        translator.attack();
        translator.defense();
    }
}
