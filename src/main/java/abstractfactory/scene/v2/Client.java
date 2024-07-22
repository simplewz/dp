package abstractfactory.scene.v2;

import abstractfactory.scene.common.User;

/**
 * Description: 使用工厂方法模式访问数据表<br/>
 *
 * 优点：利用多态性，在进行数据库访问时，userDao对象事先不知道是在访问哪个数据库，却可以很好完成工作，实现了业务逻辑与数据访问的解耦
 * 存在的问题：代码中有指明new SQLServerUserDaoFactory()，需要修改的地方依然很多，数据库中有Department及其他表时需要新增很多类，代码量激增
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/19 15:16
 */
public class Client {

    public static void main(String[] args) {
        User user = new User("1","userName");

        //使用了多态，若要更改成Access数据库，只需修改这里即可
        //UserDaoFactory userDaoFactory = new AccessUserDaoFactory();
        UserDaoFactory userDaoFactory = new SQLServerUserDaoFactory();
        UserDao userDao = userDaoFactory.createUserDao();

        userDao.insert(user);
        userDao.selectById("1");
    }

}
