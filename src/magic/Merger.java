package magic;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Merger {
    public static void main(String[] args) {
        ImageReader reader = new ImageReader();
        Magic magic = new Magic();
        String type = Util.typeReader();
        List<BufferedImage> imageList = reader.getNormalMaps("C:\\Users\\22799\\Desktop\\" + type);
        BufferedImage normalMap = magic.WTF(imageList, Util.colorMapping(type));
        File outPutFile = new File("C:\\Users\\22799\\Desktop\\knife_" + type + ".png");
        try {
            ImageIO.write(normalMap, "png", outPutFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
