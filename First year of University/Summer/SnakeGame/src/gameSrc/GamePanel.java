package gameSrc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GamePanel extends JPanel implements KeyListener, ActionListener
{
    int length;//蛇的长度
    int[] snakeX = new int[800];//蛇的x坐标
    int[] snakeY = new int[500];//蛇的y坐标
    String fx;//R：右  L：左  U：上  D：下
    boolean isStart = false;//判断游戏是否开始

    //定时器
    Timer timer = new Timer(100,this);

    //定义一个食物
    int foodx;
    int foody;
    Random random = new Random();

    //添加一个死亡判断
    boolean isFail = false;

    //积分
    int score;

    //记录上次的走向
    int lastTrend = KeyEvent.VK_LEFT ;



    //Constructor
    public GamePanel()
    {
        //初始化游戏
        __init__();

        //获取键盘的监听事件
        this.setFocusable(true);
        this.addKeyListener(this);

        //让时间动起来
        timer.start();

    }

    //初始化游戏
    public void __init__()
    {
        length = 3;
        snakeX[0] = 100;snakeY[0] = 100; //头的x和y坐标
        snakeX[1] = 75;snakeY[1] = 100; //第一节身体的x和y坐标
        snakeX[2] = 50;snakeY[2] = 100; //第二节身体的x和y坐标
        fx = "R";//默认蛇一开始朝向右边

        //初始化最开始食物的位置
        foodx = 25 + 25*random.nextInt(34);
        foody = 75 + 25*random.nextInt(24);
        int[] foodPosition = judge_FoodSnake(foodx,foody);
        foodx = foodPosition[0];
        foody = foodPosition[1];
        score = 0;
    }

    //初始化的食物不能与蛇重合
    public int[] judge_FoodSnake(int foodx, int foody)
    {
        for (int i=0; i<length; i++)
        {
            if (foodx==snakeX[i] && foody==snakeY[i])
            {
                foodx = 25 + 25*random.nextInt(34);
                foody = 75 + 25*random.nextInt(24);
                judge_FoodSnake(foodx,foody);
            }
        }
        return new int[] {foodx,foody};
    }


    //画板：画界面、画蛇
    //Graphics：画笔
    @Override
    protected void paintComponent(Graphics g)
    {
        //清屏
        super.paintComponent(g);
        //设置背景颜色
        this.setBackground(Color.WHITE);
        //绘制头部横条
        PicData.header.paintIcon(this,g,25,11);
        //绘制游戏区域
        g.fillRect(25,75,850,600);

        //在游戏最开始绘制出小蛇的头
        if (fx.equals("R"))
        {
            PicData.right.paintIcon(this,g,snakeX[0],snakeY[0]);
        }
        else if (fx.equals("L"))
        {
            PicData.left.paintIcon(this,g,snakeX[0],snakeY[0]);
        }
        else if (fx.equals("U"))
        {
            PicData.up.paintIcon(this,g,snakeX[0],snakeY[0]);
        }
        else if (fx.equals("D"))
        {
            PicData.down.paintIcon(this,g,snakeX[0],snakeY[0]);
        }
        //在游戏最开始绘制出小蛇的身体(此时游戏还没有动起来，处于暂停状态)
        for (int i=1; i<length; i++)//蛇的身体长度通过length来决定
        {
            PicData.body.paintIcon(this,g,snakeX[i],snakeY[i]);
        }

        //画食物
        PicData.food.paintIcon(this,g,foodx,foody);

        //显示积分
        g.setColor(Color.BLACK);//颜色
        g.setFont(new Font("宋体",Font.BOLD,18));//宋体、粗体、大小40
        g.drawString("长度： "+length,750,35);
        g.drawString("分数： "+score,750,50);

        //游戏提示是否开始游戏
        if (isStart==false)
        {
            //在界面上层画一个文字
            g.setColor(Color.WHITE);//颜色
            g.setFont(new Font("宋体",Font.BOLD,40));//宋体、粗体、大小40
            g.drawString("按下空格并开始",325,350);

        }

        //失败提醒
        if (isFail==true)
        {
            //在界面上层画一个文字
            g.setColor(Color.RED);//颜色
            g.setFont(new Font("宋体",Font.BOLD,80));//宋体、粗体、大小40
            g.drawString("菜",400,350);
        }

    }


    /**
     * 以下三个重写的方法都能实现对键盘的监听，
     * 但是相应方式不同，我们只需要取一种方式就行
     */
    @Override
    public void keyTyped(KeyEvent e)
    {
        //响应方式：按下键盘，有一定的延迟，但不需要等到弹起
    }
    @Override
    public void keyPressed(KeyEvent e)
    {
        //响应方式：按下键盘立即反应
        //我们选用这个方式来响应

        //获取按下的键盘是哪一个键
        int keyCode = e.getKeyCode();
        if (keyCode==KeyEvent.VK_SPACE)//如果按下空格键
        {
            if (isFail)//游戏失败，重新开始
            {
                isFail = false;
                __init__();//重新初始化游戏
            }
            else
            {
                //不是死亡就改变游戏状态，运动改暂停，暂停改运动
                isStart = !isStart;
            }
            repaint();//刷新界面
        }

        //控制键盘走向
        if (keyCode == KeyEvent.VK_LEFT && lastTrend != KeyEvent.VK_RIGHT )
        {
            fx="L";
            lastTrend = KeyEvent.VK_LEFT;
        }
        else if (keyCode == KeyEvent.VK_RIGHT && lastTrend != KeyEvent.VK_LEFT)
        {
            fx="R";
            lastTrend = KeyEvent.VK_RIGHT;
        }
        else if (keyCode == KeyEvent.VK_UP && lastTrend != KeyEvent.VK_DOWN)
        {
            fx="U";
            lastTrend = KeyEvent.VK_UP;
        }
        else if (keyCode == KeyEvent.VK_DOWN && lastTrend != KeyEvent.VK_UP)
        {
            fx="D";
            lastTrend = KeyEvent.VK_DOWN;
        }

    }
    @Override
    public void keyReleased(KeyEvent e)
    {
        //响应方式：按下键盘，弹起后才反应
    }

    /**
     * 定时器，监听时间和帧，执行定时操作
     */
    @Override
    public void actionPerformed(ActionEvent e)
    {
        //如果处于启动状态
        if (isStart && isFail==false)
        {
            //右移
            for (int i=length-1; i>0; i--)//身体移动，身体每次都向它前面那个身体的位置移动
            {
                snakeX[i] = snakeX[i-1];
                snakeY[i] = snakeY[i-1];
            }

            //通过控制方向让头部移动
            //边界判断
            if (fx.equals("R"))
            {
                snakeX[0] = snakeX[0]+25;//头部移动
                if (snakeX[0]>850)//边界判断，一段出界，就会从另一边出来
                {
                    snakeX[0] = 25;
                }
            }
            else if (fx.equals("L"))
            {
                snakeX[0] = snakeX[0]-25;//头部移动
                if (snakeX[0]<25)//边界判断，一段出界，就会从另一边出来
                {
                    snakeX[0] = 850;
                }
            }
            else if (fx.equals("U"))
            {
                snakeY[0] = snakeY[0]-25;//头部移动
                if (snakeY[0]<75)//边界判断，一段出界，就会从另一边出来
                {
                    snakeY[0] = 650;
                }
            }
            else if (fx.equals("D"))
            {
                snakeY[0] = snakeY[0]+25;//头部移动
                if (snakeY[0]>650)//边界判断，一段出界，就会从另一边出来
                {
                    snakeY[0] = 75;
                }
            }

            //如果吃到食物
            if (snakeX[0] == foodx && snakeY[0] == foody)
            {
                //吃到了食物蛇变长
                length++;
                snakeX[length-1] = foodx-1;
                snakeY[length-1]= foody-1;

                //加分
                score += 10;

                //生成新的食物
                foodx = 25 + 25*random.nextInt(34);
                foody = 75 + 25*random.nextInt(24);
            }

            //死亡判断
            for (int i=1; i<length; i++)
            {
                //通过遍历进行判断头部是否与身体发生碰撞
                if (snakeX[0]==snakeX[i] && snakeY[0]==snakeY[i])
                {
                    //死亡
                    isFail=true;
                }
            }


            repaint();//刷新界面
        }
        timer.start();//让时间动起来

    }
}
