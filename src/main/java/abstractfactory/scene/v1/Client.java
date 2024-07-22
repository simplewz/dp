package abstractfactory.scene.v1;

import abstractfactory.scene.common.User;

import java.util.UUID;

/**
 * Description: <br/>
 * 客户端类：模拟底层为SQL数据库存储和查询用户业务操作
 * 直接指明使用SQL Server操作数据库，若存储用户信息的数据库切换了，需要切换为新的数据库类对象来操作数据库
 * 可以使用多态，为操作数据库的方法定义一个统一的接口，各数据库有对应的实现类，这样在底层数据库发生变化时，不需要修改客户端代码
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/19 14:43
 */
public class Client {

    public static void main(String[] args) {
        User insertUser = new User("1",UUID.randomUUID().toString());

        //与SQL Server耦合
        SqlServerUser sqlServerUser = new SqlServerUser();
        //插入用户
        sqlServerUser.insert(insertUser);
        //得到Id为1的用户
        User queryUser = sqlServerUser.selectById("1");
    }

}
