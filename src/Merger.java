import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Merger {
    public static void main(String[] args) {
        ImageReader reader = new ImageReader();
        Magic magic = new Magic();
        List<BufferedImage> imageList = reader.getNormalMaps("C:\\Users\\22799\\Desktop\\normalMaps");
        BufferedImage normalMap = magic.WTF(imageList, 0x7F7FFF);
        File outputfile = new File("C:\\Users\\22799\\Desktop\\saved.png");
        try {
            ImageIO.write(normalMap, "png", outputfile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
