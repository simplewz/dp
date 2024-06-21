package prototype.scene.v1;

/**
 *  客户端类
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/21 9:38
 */
public class Client {

    public static void main(String[] args) {
        //每份简历都需要实例化，需要多少份简历就需要实例化多少次，当需要修改简历时，有多少份就需要修改多少次
        Resume resume1 = new Resume("simple");
        resume1.setPersonInfo("男","29");
        resume1.setWorkExperience("2021.05-2024.06","XXX公司");

        Resume resume2 = new Resume("simple");
        resume2.setPersonInfo("男","29");
        resume2.setWorkExperience("2018.10-2021.05","XXX公司");

        resume1.display();
        resume2.display();


        Resume resume3 = new Resume("simple");
        resume3.setPersonInfo("男","29");
        resume3.setWorkExperience("2021.05-2024.06","XXX公司");

        //resume4引用类型变量指向resume3的对应的对象内存地址，即resume3和resume4指向Java堆内存中的同一对象的内存
        //内存中其实只有一份简历对象
        Resume resume4 = resume3;

        resume3.display();
        resume4.display();

    }

}
