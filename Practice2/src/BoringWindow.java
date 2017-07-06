import java.awt.Container;
import java.awt.Graphics;

import javax.swing.*;
import javax.swing.plaf.PanelUI;

public class BoringWindow extends JFrame {
	
	public static void main(String[] args) {
		JFrame f = new BoringWindow();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300, 200);
		f.setVisible(true);
	}

}
class Frame613 extends JFrame
{
	public Frame613()
	{
		setTitle("613 rocks!");
		setSize(300,200);
		setLocation(100,200);
		
		Panel panel = new Panel();
		Container cp = getContentPane();
		cp.add(panel);
	}
}
class Panel extends JPanel
{
	public void paintComponent( Graphics g)
	{
		super.paintComponent(g);
		g.drawString("Hi", 75, 100);
				
	}
}
