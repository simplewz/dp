package facade.scene.v1;

/**
 *  房地产类
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/27 8:18
 */
public class Realty1 {

    private String code;

    public Realty1(String code) {
        this.code = code;
    }

    public void sell(){
        System.out.println("房地产1卖出");
    }

    public void buy(){
        System.out.println("房地产1买入");
    }


}
