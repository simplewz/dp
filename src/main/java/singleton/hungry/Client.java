package singleton.hungry;

/**
 * Description: 客户端类<br/>
 *
 *  单例模式：保证一个类仅有一个实例，并提供一个访问它的全局访问点
 *  通常我们可以让一个全局变量是的一个对象被访问，但它不能防止你实例化多个对象。一个最好的办法就是。让类自身负责保存它的唯一实例。
 *  这个类可以保证没有其他实例可以被创建，并且它可以提供一个访问该实例的方法
 *
 *  单例模式的好处：
 *  1.保证类对象的唯一性，避免频繁创建对象，节省内存
 *  2.严格控制客户端程序如何访问以访问该类的实例对象，对唯一实例的受控访问
 *
 *  使用场景：
 *  1.有状态的工具类对象；
 *  2.频繁访问数据库或文件的对象；
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/7 15:16
 */
public class Client {

    public static void main(String[] args) {
        HungrySingleton s1 = HungrySingleton.getInstance();
        HungrySingleton s2 = HungrySingleton.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("s1与s2是否相等："+(s1==s2));
    }

}
