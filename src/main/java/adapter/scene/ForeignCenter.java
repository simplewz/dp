package adapter.scene;

/**
 * Description: 外籍中锋<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/31 15:04
 */
public class ForeignCenter{

    private String name;

    public ForeignCenter() {
    }

    public ForeignCenter(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println(String.format("外籍中锋：%s进攻",name));
    }


    public void defense() {
        System.out.println(String.format("外籍中锋：%s防守",name));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
