package decorator.scene.v1;

/**
 * 装扮模式场景模拟Person类v1版本：模拟给人换装的Avatar系统，类似与QQ的装扮功能
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/18 8:57
 */
public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void wearTShirt(){
        System.out.println("大T恤");
    }

    public void wearBigTrouser(){
        System.out.println("垮裤");
    }

    public void wearSneakers(){
        System.out.println("破球鞋");
    }

    public void wearSuit(){
        System.out.println("西装");
    }

    public void wearTie(){
        System.out.println("领带");
    }

    public void wearLeatherShoes(){
        System.out.println("皮鞋");
    }

    //形象展示方法
    public void show(){
        System.out.println("装扮的是："+name);
    }

}
