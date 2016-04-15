package program.objectsBundle.garbage;

import java.awt.Graphics;
import java.awt.Image;

public class DrawableGameObject extends GameObject {
	private final String objType = "DrawableGameObject";
	private Image img;
	private String imgID;
	public void paint(Graphics g, int x, int y, int width, int height){
		g.drawImage(img, x, y, width, height, null);
	}
	public Image getImg() {
		return img;
	}
	public void setImg(Image img) {
		this.img = img;
	}
	public String getImgID() {
		return imgID;
	}
	public void setImgID(String imgID) {
		this.imgID = imgID;
	}
	public boolean isDrawable() {
		return true;
	}
	public String getObjType() {
		return objType;
	}
}
