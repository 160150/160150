import java.awt.*;
import javax.swing.*;
public class AlohaWindow{
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400,200);
		frame.setTitle("カナル");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout( new FlowLayout() );

		JLabel label = new JLabel("HELLo");
			Container ctnr =frame.getContentPane();		
			ctnr.add(label);
            JButton button = new JButton("Click Me!");
			ctnr.add(button);
		frame.setVisible(true);
			
		}
	}
