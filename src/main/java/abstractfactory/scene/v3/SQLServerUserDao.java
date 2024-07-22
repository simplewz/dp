package abstractfactory.scene.v3;

import abstractfactory.scene.common.User;

import java.util.UUID;

/**
 * Description: SQL Server操作用户数据实现类<br/>
 *
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/19 15:02
 */
public class SQLServerUserDao implements UserDao {

    @Override
    public void insert(User user) {
        System.out.println("在SQL Server数据库中给user表添加一条记录！");
    }

    @Override
    public User selectById(String id) {
        System.out.println("在SQL Server数据库中根据id得到user表中的一条记录！");
        User user = new User(id, UUID.randomUUID().toString());
        return user;
    }
}
