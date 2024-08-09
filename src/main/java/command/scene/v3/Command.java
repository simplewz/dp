package command.scene.v3;

/**
 * Description: 顾客需求命令类<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/9 15:48
 */
public abstract class Command {

    //烤串的人
    protected Barbecuer barbecuer;

    //菜品名称
    private String name;

    //菜品类型
    private String type;

    //单价
    private Integer price;

    //菜品数量
    private int count;

    public Command(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    //执行烤串
    public abstract void bake(int count);

}
