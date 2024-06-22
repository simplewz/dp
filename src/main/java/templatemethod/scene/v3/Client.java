package templatemethod.scene.v3;

/**
 * 客户端类
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("学生甲抄写的试卷：");
        TestPaper studentA = new TestPaperA();//将子类对象赋值给父类引用，利用多态性实现了代码的复用
        studentA.testQuestion1();
        studentA.testQuestion2();
        studentA.testQuestion3();

        System.out.println("====================================");

        System.out.println("学生乙抄写的试卷：");
        TestPaper studentB = new TestPaperB();
        studentB.testQuestion1();
        studentB.testQuestion2();
        studentB.testQuestion3();
    }
}
