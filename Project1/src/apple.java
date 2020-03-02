import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class apple extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JLabel item1;
	
	public apple () {
		super("The title bar");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("Hello Shankar");
		item1.setToolTipText("Tool Tip From Shankar");
		
		add(item1);
	}
	
}
