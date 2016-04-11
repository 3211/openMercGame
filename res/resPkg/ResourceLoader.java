package resPkg;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ResourceLoader {
	private static ResourceLoader rl = new ResourceLoader();
	public static Image getImage(String fileName){ 
		BufferedImage img = null;
		try {
		    img = ImageIO.read(rl.getClass().getResource("images/"+fileName));
		} catch (IOException e) {
		}
		return img;
		//return Toolkit.getDefaultToolkit().getImage(rl.getClass().getResource("images/"+fileName));
	}
}
