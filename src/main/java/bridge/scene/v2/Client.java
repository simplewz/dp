package bridge.scene.v2;

/**
 * Description: 客户端类<br/>
 * 使手机游戏在不同品牌的手机上运行
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/8 16:40
 */
public class Client {

    public static void main(String[] args) {

        HandsetGame game;
        //在N品牌的手机上运行游戏
        game= new HandsetNGame();
        game.run();

        //在M品牌上的手机运行游戏
        game = new HandsetMGame();
        game.run();
    }

}
