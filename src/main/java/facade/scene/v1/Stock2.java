package facade.scene.v1;

/**
 * 股票2类
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/26 9:31
 */
public class Stock2 {

    /**
     * 股票代码
     */
    private String code;


    public Stock2(String code) {
        this.code = code;
    }

    public void sell(){
        System.out.println("股票2卖出");
    }

    public void buy(){
        System.out.println("股票2买入");
    }

}
