import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class ButtonsEX {
	public static void main(String[] args) {
		new GUI();	
	}
}
class GUI extends javax.swing.JFrame {
	public GUI() {
		setDefaultCloseOperation(3);
		setTitle("Excerise RadioButton");

		setLayout(null);


		setSize(800, 600);


		numButtons(this);


		setVisible(true);
	}
	private static JRadioButton[] numButtons(JFrame window) {

		ButtonGroup group = new ButtonGroup();
		JRadioButton[] buttons = new JRadioButton[4]; // Create array with radio buttons

		int x = 10;
		int y = 270;
		int width = (window.getWidth() / buttons.length) - 10; // Occupate all the screen
		int height = 30;

		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JRadioButton();

			buttons[i].setText(i + " Hijos"); // Set text for the buttons

			if(i == buttons.length) {
				buttons[3].setText("Más hijos"); // Set text for the last button
			}

			buttons[i].setBounds(x, y, width, height);
			x = x + width;

			group.add(buttons[i]); // Add the buttons to a group

			window.add(buttons[i]); // Add buttons to the window
			
		}

		return buttons;
	}
}