import javax.swing.JFrame;

/**
 * 
 * @author jeremy
 * Period 6
 *
 */
public class BouncingBall
{
	public static void main(String[] args)
	{
		JFrame hWnd = new JFrame();
		Ball ball = new Ball(100, 100, 50, 50);
		hWnd.setLayout(null);
		hWnd.setBounds(500, 500, 500, 500);
		
		hWnd.add(ball);
		hWnd.setVisible(true);
		
	}
}
