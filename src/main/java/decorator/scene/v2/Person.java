package decorator.scene.v2;

/**
 * Person类:仅提供基本属性和基本的形象展示方法，与装饰类的代码分离
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/18 9:24
 */
public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    //形象展示
    public void show(){
        System.out.println("装扮的是："+name);
    }

}
