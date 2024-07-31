package adapter.scene;

/**
 * Description: 翻译官类<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/31 15:06
 */
public class Translator extends Player{

    //给外籍中锋翻译，持有外籍中锋对象的引用
    private ForeignCenter foreignCenter;

    public Translator(String name) {
        super(name);
    }

    //翻译教练的进攻指令
    @Override
    public void attack() {
        foreignCenter.attack();
    }

    //翻译教练的防守指令
    @Override
    public void defense() {
        foreignCenter.defense();
    }

    public ForeignCenter getForeignCenter() {
        return foreignCenter;
    }

    public void setForeignCenter(ForeignCenter foreignCenter) {
        this.foreignCenter = foreignCenter;
    }
}
