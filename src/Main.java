import java.awt.AWTException;

import java.awt.Color;

import java.awt.Robot;

import java.awt.event.KeyEvent;

import java.io.IOException;
public class Main {
    public static void main(String[] args) throws AWTException, IOException {
        Robot robot1 = new Robot();

        //延迟5秒开始运行脚本
        robot1.delay(5000);

        //死循环
        while (true) {
            //540是第一个格中间的横坐标，每加124到第二个，第三个，第四个格。
            for (int i = 540; i < 1015; i += 124) {
                Color color = robot1.getPixelColor(i, 574);//485是纵坐标保持不变
                System.out.println("==="+color);//打印颜色，此步骤可以省略

                //当颜色的R值为51时，进行判断
                if (color.getRed() == 51) {

                    //横坐标为460，按下D键
                    if (i == 540) {

                        robot1.keyPress(KeyEvent.VK_D);

                        robot1.keyRelease(KeyEvent.VK_D);
                        //横坐标为560，按下F
                    } else if (i == 664) {

                        robot1.keyPress(KeyEvent.VK_F);

                        robot1.keyRelease(KeyEvent.VK_F);

                        //横坐标为660，按下J
                    } else if (i == 788) {

                        robot1.keyPress(KeyEvent.VK_J);

                        robot1.keyRelease(KeyEvent.VK_J);

                        //横坐标为760，按下K

                    } else if (i == 912) {
                        robot1.keyPress(KeyEvent.VK_K);
                        robot1.keyRelease(KeyEvent.VK_K);
                    }

                }

                robot1.delay(1);//延迟1ms，开始下一轮循环（可省略）

            }

        }
    }
}