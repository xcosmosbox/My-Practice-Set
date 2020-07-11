package gameSrc;

import javax.swing.*;
import java.net.URL;


//存放外部数据
public class PicData
{
    //头部图片 URL:定位图片的地址  ImageIcon：绘制图片
    public static URL headerURL = PicData.class.getResource("/staticsPic/header.png");
    public static ImageIcon header = new ImageIcon(headerURL);

    //向上的头
    public static URL upURL = PicData.class.getResource("/staticsPic/up.png");
    public static ImageIcon up = new ImageIcon(upURL);
    //向下的头
    public static URL downURL = PicData.class.getResource("/staticsPic/down.png");
    public static ImageIcon down = new ImageIcon(downURL);
    //向左的头
    public static URL leftURL = PicData.class.getResource("/staticsPic/left.png");
    public static ImageIcon left = new ImageIcon(leftURL);
    //向右的头
    public static URL rightURL = PicData.class.getResource("/staticsPic/right.png");
    public static ImageIcon right = new ImageIcon(rightURL);

    //身体
    public static URL bodyURL = PicData.class.getResource("/staticsPic/body.png");
    public static ImageIcon body = new ImageIcon(bodyURL);

    //食物
    public static URL foodURL = PicData.class.getResource("/staticsPic/food.png");
    public static ImageIcon food = new ImageIcon(foodURL);
}
