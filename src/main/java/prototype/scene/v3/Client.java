package prototype.scene.v3;

/**
 * Java默认使用的克隆方式是浅克隆方式，即类的成员变量如果是基本类型，则将其值复制到克隆对象对应的属性中，而对引用类型
 *          属性，复制的是引用变量的地址，克隆对象与原始对象的引用变量指向内存中的同一对象地址。这种方式的弊端是当修改原始对象
 *          引用类型指向的对象时，克隆对象引用变量指向的对象也会被修改。即克隆对象与原始对象的引用类型的变量指向的对象不是独立的。
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/21 10:54
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Resume resume1 = new Resume("simple");
        resume1.setPersonInfo("男","29");
        resume1.setWorkExperience("2021.05-2024.06","XXX公司");

        Resume resume2 = (Resume)resume1.Clone();
        resume2.setWorkExperience("2024.07-2030.10","XXX公司");

        resume1.display();
        resume2.display();

        /**
         * 这里我们期望输出：
         *    simple 男 29
         *    工作经历：2021.05-2024.06 XXX公司
         *    simple 男 29
         *    工作经历：2024.07-2030.10 XXX公司
         * 实际输出：
         *    simple 男 29
         *    工作经历：2024.07-2030.10 XXX公司
         *    simple 男 29
         *    工作经历：2024.07-2030.10 XXX公司
         *
         *  原因是：Resume的属性工作经历workExperience为引用类型，克隆对象与原始对象的变量都指向了同一对象地址，修改后两处都会显示被修改了
         */
    }

}
