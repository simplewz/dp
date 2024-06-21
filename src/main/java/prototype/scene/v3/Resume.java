package prototype.scene.v3;

/**
 * 个人简历类v3,实现了Cloneable接口
 * 属性字段中有引用类型的字段
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

    public Object Clone() throws CloneNotSupportedException {
        return this.clone();
    }

}
