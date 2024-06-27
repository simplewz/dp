package facade.scene.v1;

/**
 * 股票3类
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/26 9:31
 */
public class Stock3 {

    /**
     * 股票代码
     */
    private String code;


    public Stock3(String code) {
        this.code = code;
    }

    public void sell(){
        System.out.println("股票3卖出");
    }

    public void buy(){
        System.out.println("股票3买入");
    }

}
