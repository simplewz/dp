package decorator.scene.v3;

/**
 * 公共服饰装饰类
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/18 10:39
 */
public class Finery extends Person{

    private Person person;

    //装饰
    public void decorate(Person person) {
        this.person = person;
    }

    @Override
    public void show(){
        if(person != null){
            person.show();
        }
    }
}
