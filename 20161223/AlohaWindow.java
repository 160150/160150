import java.awt.*;
	import javax.swing.*;

	public class AlohaWindow {
		public static void main(String[] args) {
			JFrame frame;

			frame = new JFrame();
            frame.setLocation(300, 300);
			frame.setSize(400, 400);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			frame.setVisible(true);
		}
	}