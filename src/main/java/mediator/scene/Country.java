package mediator.scene;

/**
 * Description: 抽象国家类<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/22 16:16
 */
public abstract class Country {

    protected UnitedNations unitedNations;

    protected String name;

    public Country(UnitedNations unitedNations,String name) {
        this.unitedNations = unitedNations;
        this.name = name;
    }
}
