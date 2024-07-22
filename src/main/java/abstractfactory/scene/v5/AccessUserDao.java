package abstractfactory.scene.v5;

import abstractfactory.scene.common.User;

import java.util.UUID;

/**
 * Description:  Access 操作用户表数据实现类<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/19 15:04
 */
public class AccessUserDao implements UserDao {

    @Override
    public void insert(User user) {
        System.out.println("在Access数据库中给user表添加一条记录！");
    }

    @Override
    public User selectById(String id) {
        System.out.println("在Access数据库中根据id得到user表中的一条记录！");
        User user = new User(id, UUID.randomUUID().toString());
        return user;
    }
}
