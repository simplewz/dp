package templatemethod.scene.v2;

/**
 * 将试题抽象到一个公共的父类中，所有学生的试题部分相同，防止学生抄错题目，老师要修改题目，也仅需修改试题类，无需每个学生的试题都修改
 */
public class TestPaper {
    //试题1
    public void testQuestion1(){
        System.out.println("1.杨过得到，后来给了郭靖，炼成倚天剑、屠龙刀的玄铁可能是[ ]");
        System.out.println("a.球磨铸铁 b.马口铁 c.高速合金钢 d.碳素纤维");
    }

    //试题2
    public void testQuestion2(){
        System.out.println("2.杨过、程英、陆无双铲除了情花，造成[ ]");
        System.out.println("a.是这种植物不再害人 b.使一种珍惜物种灭绝 c.破坏了那个生物圈的生态平衡 d.造成该地区沙漠化");
    }

    //试题3
    public void testQuestion3(){
        System.out.println("3.蓝凤凰致使华山师徒、桃谷六仙呕吐不止，如果你是大夫，会给他们开什么药[ ]");
        System.out.println("a.阿司匹林 b.牛黄解毒片 c.氟哌酸 d.牛奶 e.以上均不对");
    }
}
