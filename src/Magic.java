import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;

public class Magic {
    public BufferedImage WTF(List<BufferedImage> normalMaps, int baseColor) {
        int height = normalMaps.get(0).getHeight();
        int width = normalMaps.get(0).getWidth();
        BufferedImage result = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = result.getGraphics();
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, width, height);
        for (BufferedImage item : normalMaps) {
            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    int rgb = item.getRGB(i, j) & 0xFFFFFF ^ baseColor;
                    result.setRGB(i, j, rgb ^ result.getRGB(i, j));
                }
            }
        }
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                int rgb = result.getRGB(i, j) & 0xFFFFFF ^ baseColor;
                result.setRGB(i, j, rgb);
            }
        }
        return result;
    }
}
