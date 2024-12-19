package main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Async
 * Date: 2024-12-13
 * Time: 11:10
 */
public class ImageDisplay extends JFrame {
    public ImageDisplay() throws IOException {
        setTitle("A");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel();

        BufferedImage image = ImageIO.read(new File("C:\\Users\\Async\\Desktop\\药屋少女的呢喃\\新建文件夹\\7ddf4dbaa7a49fad1ba607d152b549fd62043450.jpg"));

        label.setIcon((Icon) image);
        add(label);
        setVisible(true);

    }
}
