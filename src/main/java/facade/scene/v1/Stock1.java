package facade.scene.v1;

/**
 * 股票1类
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/26 9:31
 */
public class Stock1 {

    /**
     * 股票代码
     */
    private String code;


    public Stock1(String code) {
        this.code = code;
    }

    public void sell(){
        System.out.println("股票1卖出");
    }

    public void buy(){
        System.out.println("股票1买入");
    }

}
