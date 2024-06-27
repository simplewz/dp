package facade.scene.v1;

/**
 * 国债1
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/26 9:36
 */
public class NationalDebt1 {

    private String code;

    public NationalDebt1(String code) {
        this.code = code;
    }


    public void sell(){
        System.out.println("国债1卖出");
    }

    public void buy(){
        System.out.println("国债1买入");
    }

}
