package templatemethod.scene.v2;

/**
 * 客户端类
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("学生甲抄写的试卷：");
        TestPaperA studentA = new TestPaperA();
        studentA.testQuestion1();
        studentA.testQuestion2();
        studentA.testQuestion3();

        System.out.println("====================================");

        System.out.println("学生乙抄写的试卷：");
        TestPaperB studentB = new TestPaperB();
        studentB.testQuestion1();
        studentB.testQuestion2();
        studentB.testQuestion3();
    }
}
