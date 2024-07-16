package builder.scene.v1;

import javax.swing.*;
import java.awt.*;

/**
 * Description: 绘制人<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/28 9:09
 */
public class DrawPersonJComponent extends JComponent{

    public void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        graphics.setColor(Color.BLACK);
        //以下为绘制一个正常身材的人
        //绘制头
        graphics.drawOval(50, 20, 30, 30);
        //绘制身体
        graphics.drawRect(60,50,10,50);
        //左手
        graphics.drawLine(60,50,40,100);
        //右手
        graphics.drawLine(70,50,90,100);
        //左脚
        graphics.drawLine(60,100,45,150);
        //右脚
        graphics.drawLine(70,100,85,150);

        //以下为绘制一个比较胖的人
        /*
        //绘制头
        graphics.drawOval(50, 20, 30, 30);
        //绘制身体
        graphics.drawOval(45,50,40,50);
        //左手
        graphics.drawLine(50,50,30,100);
        //右手
        graphics.drawLine(80,50,100,100);
        //左脚
        graphics.drawLine(60,100,45,150);
        //右脚
        graphics.drawLine(70,100,85,150);
        */
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("DrawPerson");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DrawPersonJComponent drawPerson = new DrawPersonJComponent();
        frame.add(drawPerson); // 添加自定义的面板
        frame.setSize(300, 300); // 设置窗口大小
        frame.setLocationRelativeTo(null); // 窗口居中显示
        frame.setVisible(true); // 显示窗口
    }

}
