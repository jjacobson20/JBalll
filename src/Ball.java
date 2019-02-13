/**
 * 
 * @author jeremy
 * Period 6
 *
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class Ball extends JComponent
{
	private Ellipse2D.Double ball;
	
	public Ball(int x, int y, int width, int height)
	{
		ball = new Ellipse2D.Double(x, y, width, height);
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		g2.draw(ball);
		g2.fill(ball);
	}
}
