package main;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Async
 * Date: 2024-12-10
 * Time: 21:39
 */
public class Main {
    public static void main(String[] args) throws IOException {

//        BufferedImage image = null;
//        try {
//            image = ImageIO.read(new File("C:\\Users\\Async\\Desktop\\药屋少女的呢喃\\新建文件夹\\7ddf4dbaa7a49fad1ba607d152b549fd62043450.jpg"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(image);
        //new ImageDisplay();
        LinkedList list = new LinkedList();
        list.add(1, "张", 50);
        list.add(2, "李", 60);
        list.add(3, "王", 70);
        int n;
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            System.out.println("1.添加学生信息");
            System.out.println("2.删除学生信息");
            System.out.println("3.修改学生信息");
            System.out.println("4.查询全部学生信息");
            System.out.println("5.查询指定学生信息");
            System.out.println("6.排名");
            System.out.println("输入选项：");
            n = scanner.nextInt();
            switch (n) {
                case 1:
                    System.out.println("输入学生信息");
                    StudentLinkNode st1 = new StudentLinkNode(list.getHead());
                    st1.setInfo();
                    list.add(st1);
                    break;
                case 2:
                    System.out.println("删除学生的学号");
                    int stno = scanner.nextInt();
                    list.del(stno);
                    System.out.println("删除成功");
                    break;
                case 3:
                    System.out.println("输入修改学生学号：");
                    int sno = scanner.nextInt();
                    System.out.println("修改后的name：");
                    String sname = scanner.next();
                    System.out.println("修改后的score：");
                    int sscore = scanner.nextInt();
                    StudentLinkNode s3 = new StudentLinkNode(sno, sname, sscore);
                    list.update(s3);
                    System.out.println("修改成功");
                    break;
                case 4:
                    list.show();
                    break;
                case 5:
                    System.out.println("输入查询学生学号：");
                    int sno1 = scanner.nextInt();
                    StudentLinkNode s4 = new StudentLinkNode(sno1);
                    list.onlyshow(s4);
                    break;
                case 6:

                    StudentLinkNode st5 = new StudentLinkNode(list.getHead());
                    list.bubbleSort(st5);
                    break;
            }
        }
    }
}
