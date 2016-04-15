package resPkg;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageLoader {
	private static ImageLoader rl = new ImageLoader();
	public static Image getImage(String fileName){ 
		BufferedImage img = null;
		URL temp = rl.getClass().getResource("images/"+fileName);
		try {
		    img = ImageIO.read(rl.getClass().getResource("images/"+fileName));
		} catch (IOException e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println(temp);
		return img;
	}
}
