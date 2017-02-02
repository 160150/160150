    import java.awt.*;
    import  java.awt.event.*;
	import javax.swing.*;

	public class TestIcon {
		public static void main(String[] args) {
			FrameMan fm = new FrameMan();
		}
	}
	class FrameMan implements ActionListener{
		
		ImageIcon img;
	    ImageIcon img2;
	    JFrame frame;					
	    JButton button;					
			

		JLabel label;
	    JPanel panel;


		public FrameMan(){	

			openWindow();
    }
          private void openWindow(){
			frame = new JFrame();

			frame.setLocation(400,400);
			frame.setSize(600,600);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    img = new ImageIcon("icon_256.png");
		img2 = new ImageIcon("N.jpg");


	       panel = new JPanel();
			label = new JLabel(img);
			button = new JButton("ClickMe!");
			button.addActionListener(this);
			button.setActionCommand("open");

			button.addActionListener(this);
			button.setActionCommand("close");


		Container con = frame.getContentPane();
			
			panel.add(label);
			panel.add(button);
			frame.add (panel);
			frame.setVisible(true);
}
 public void actionPerformed(ActionEvent ae){
	String cmd = ae.getActionCommand();

		if(cmd.equals("open")){

			label.setIcon(img);
} else if(cmd.equals("close")){

			label.setIcon(img2);

       }
 			
	}
}