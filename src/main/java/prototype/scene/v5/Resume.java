package prototype.scene.v5;

import java.io.*;

/**
 * 个人简历类v5,序列化实现对象的深拷贝
 *
 * 序列化是将对象写到流中便于传输，而反序列化则是把对象从流中读取出来。这里写到流中的对象则是原始对象的一个拷贝，因为原始对象还存在 JVM 中，所以我们可以利用对象的序列化产生克隆对象，然后通过反序列化获取这个对象。
 * 注意每个需要序列化的类都要实现 Serializable 接口，如果有某个属性不需要序列化，可以将其声明为 transient，即将其排除在克隆属性之外
 *
 * 属性字段中有引用类型的字段
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/21 9:29
 */
public class Resume implements Serializable {

    //姓名
    private String name;

    //性别
    private String sex;

    //年龄
    private String age;

    //工作经历,引用类型
    private WorkExperience workExperience;

    public Resume(String name) {
        this.name = name;
        this.workExperience = new WorkExperience();
    }

    //设置个人信息
    public void setPersonInfo(String sex,String age){
        this.sex = sex;
        this.age = age;
    }

    //设置工作经历
    public void setWorkExperience(String timeArea,String company){
        workExperience.setTimeArea(timeArea);
        workExperience.setCompany(company);
    }

    //简历展示
    public void  display(){
        System.out.println( name+" "+sex+" "+age);
        System.out.println("工作经历："+workExperience.getTimeArea()+" "+workExperience.getCompany());
    }

    //序列化实现深度拷贝
    public Object Clone() throws Exception{
        // 序列化
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(this);

        // 反序列化
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);

        return ois.readObject();
    }

}
