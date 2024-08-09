package command.scene.v3;

/**
 * Description: 烤串的人<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/9 15:03
 */
public class Barbecuer {

    private String name;

    public Barbecuer(String name) {
        this.name = name;
    }

    public void bakeMutton(int count){
        System.out.println(String.format("烤%s串羊肉串！",count));
    }

    public void bakeChickenWing(int count){
        System.out.println(String.format("烤%s串鸡翅！",count));
    }

}
