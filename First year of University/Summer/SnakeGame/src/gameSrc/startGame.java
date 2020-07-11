package gameSrc;

import javax.swing.*;

public class startGame
{
    public static void main(String[] args)
    {
        //1.绘制静态窗口
        JFrame frame = new JFrame(" 贪吃蛇 ");
        //设计界面大小
        frame.setBounds(30,30,900,720);
        //窗口大小不可改变
        frame.setResizable(false);
        //设置关闭事件
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //2.利用JPanel面板运行游戏
        //将JPanel加入到JFrame
        frame.add(new GamePanel());


        //让窗口展现出来
        frame.setVisible(true);
    }
}
