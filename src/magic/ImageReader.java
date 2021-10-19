package magic;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ImageReader {
    private File file;
    private File[] files;

    public List<BufferedImage> getNormalMaps(String path) {
        List<BufferedImage> imageList = new ArrayList<>();
        file = new File(path);
        File[] files = file.listFiles();
        for (File f : files) {
            try {
                BufferedImage image = ImageIO.read(f);
                imageList.add(image);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return imageList;
    }
}
