package openEngine;
/**
 * Simple easily modified MainFrame (main window) class
 * Contains a canvas JPanel and functionality to quickly access:
 * Device Screen, Canvas Graphics etc
 * 
 * @author A.Audette
 * @version 1
 */
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame {
	private GraphicsDevice gd;
	private JPanel contentPane;
	private JPanel canvas;
	/**
	 * Default constructor - creates the MainFrame with a JPanel canvas element in it's contentPane. 
	 */
	public MainFrame() {
		gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(new BorderLayout(0, 0));
		canvas = new JPanel();
		contentPane.add(canvas, BorderLayout.CENTER);
		setContentPane(contentPane);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		this.setBounds(0,0,250,250+getInsets().top);
	}
	/**
	 * @return GraphicsDevice - access to the system's display devices
	 */
	public GraphicsDevice getScreen(){
		return gd;
	}
	/**
	 * @return Graphics - the canvas graphics element
	 */
	public Graphics getCanvasGraphics(){
		return canvas.getGraphics();
	}
	/**
	 * @return int - the width of the main display device
	 */
	public int getScreenWidth(){
		return gd.getDisplayMode().getWidth();
	}
	/**
	 * @return int - the height of the main display device
	 */
	public int getScreenHeight(){
		return gd.getDisplayMode().getHeight();
	}
	/**
	 * @return JPanel - the canvas JPanel
	 */
	public JPanel getCanvas(){
		return canvas;
	}

}
