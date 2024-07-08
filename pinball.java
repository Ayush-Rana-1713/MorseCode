import java.awt.*;
import java.awt.event.*; 
import javax.swing.*; 

public class pinball extends JPanel implements ActionListener { 

	private Timer timer; 
	private int ballX, ballY; 
	private int paddleX; 
	private int dx, dy; 

	public pinball() { 
		
		setBackground(Color.BLACK); 
		setPreferredSize(new Dimension(600, 400)); 
		setFocusable(true); 

		ballX = 200; 
		ballY = 200; 
		paddleX = 250; 
		dx = 3; 
		dy = 3; 

		timer = new Timer(10, this); 
		timer.start(); 

		addKeyListener(new KeyAdapter() { 
			public void keyPressed(KeyEvent e) { 
				if (e.getKeyCode() == KeyEvent.VK_LEFT) { 
					paddleX -= 10; 
					if (paddleX < 0) 
						paddleX = 0; 
				} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) { 
					paddleX += 10; 
					if (paddleX > getWidth() - 100) 
						paddleX = getWidth() - 100; 
				} 
			} 
		}); 
	} 

	public void paintComponent(Graphics g) { 
		super.paintComponent(g); 
		g.setColor(Color.WHITE); 
		g.fillOval(ballX, ballY, 20, 20); 
		g.fillRect(paddleX, getHeight() - 20, 100, 10); 
	} 

	public void actionPerformed(ActionEvent e) { 
		
		ballX += dx; 
		ballY += dy; 

		if (ballX < 0 || ballX > getWidth() - 20) 
			dx = -dx; 

		if (ballY < 0 || ballY > getHeight() - 20) 
			dy = -dy; 

		if (ballY > getHeight() - 30 && ballX >= paddleX && ballX <= paddleX + 100) 
			dy = -dy; 

		repaint(); 
	} 

	public static void main(String[] args) { 
		JFrame frame = new JFrame("Pinball"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.getContentPane().add(new pinball()); 
		frame.pack(); 
		frame.setVisible(true); 
	} 
}
