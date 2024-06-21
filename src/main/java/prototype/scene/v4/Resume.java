package prototype.scene.v4;

/**
 * 个人简历类v4,实现了Cloneable接口,并添加了一个传入工作经历的私有构造方案，在对象克隆时，先调用工作经历对象的clone方法克隆一个新的工作经历对象
 * 将克隆的新的工作经历对象赋值给克隆的简历对象的工作经历引用变量，然后逐位复制原始简历对象的属性值到克隆对象的属性中，实现对象属性深拷贝
 * 缺点：对象的克隆链很长时，所有的引用对象类型都需要进行克隆操作
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/21 9:29
 */
public class Resume implements Cloneable{

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

    /**
     * 私有构造方法，在对象克隆时传入引用对象，在其中实现工作经历对象的拷贝
     * @param workExperience
     */
    private Resume (WorkExperience workExperience){
        try {
            this.workExperience = (WorkExperience) workExperience.Clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
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

    //实现克隆对象属性的深拷贝
    public Object Clone() throws CloneNotSupportedException {
        Resume resume = new Resume(this.workExperience);
        resume.name = this.name;
        resume.sex = this.sex;
        resume.age = this.age;
        return resume;
    }

}
