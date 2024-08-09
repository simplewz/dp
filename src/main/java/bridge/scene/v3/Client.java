package bridge.scene.v3;

/**
 * Description: 客户端类<br/>
 * 使用继承：将手机品牌抽象，不同的手机品牌实现手机品牌这个抽象类
 * 不同的手机软件在对应的手机品牌下实现其需要的软件功能
 *
 * 存在的问题：当需要新增手机品牌时，需要新增实现抽象手机品牌类，然后为其增加所有的软件功能实现类，代码量大
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/8 16:55
 */
public class Client {

    public static void main(String[] args) {
        HandsetBrand hb;
        hb = new HandsetBrandMContact();
        hb.run();

        hb = new HandsetBrandNContact();
        hb.run();

        hb = new HandsetBrandMGame();
        hb.run();

        hb = new HandsetBrandNGame();
        hb.run();

        hb = new HandsetBrandNMp3();
        hb.run();

        hb = new HandsetBrandMMp3();
        hb.run();
    }

}
