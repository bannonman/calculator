import java.awt.Container;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.WindowConstants;



public class calculator extends JFrame implements ActionListener{

	JTextField text;
	JPanel pane;
	JPanel btnPanel;
	JButton one, two, three, four, five, six, seven, eight, nine, zero, plus, minus, multi, divide, equals, blank;
	int prev = 0;
	int operator = 0;
	int num, oldnum, newnum;
	int sum = 0;
	
	public calculator(String MyTitle) throws Exception{
        super(MyTitle);

        setSize(300,300);
        setLocation(100,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(createpane());
        setVisible(true);
        
	}
	    
	public Container createpane() throws Exception{
		
		pane = new JPanel();
        pane.setLayout(new BorderLayout());
        
        
	    text = new JTextField();
	    text.setHorizontalAlignment(JTextField.RIGHT);
	    text.setEditable(false);
	    
	    btnPanel = new JPanel();
	    btnPanel.setLayout(new GridLayout(4,4));   
	    
	    one = new JButton("1");
	    two = new JButton("2");
	    three = new JButton("3");
	    four = new JButton("4");
	    five = new JButton("5");
	    six = new JButton("6");
	    seven = new JButton("7");
	    eight = new JButton("8");
	    nine = new JButton("9");
	    zero = new JButton("0");
	    plus = new JButton("+");
	    minus = new JButton("-");
	    multi = new JButton("*");
	    divide = new JButton("/");
	    equals = new JButton("=");
	    blank = new JButton(" ");
	    
	    zero.addActionListener(this); 
	    one.addActionListener(this); 
	    two.addActionListener(this); 
	    three.addActionListener(this); 
	    four.addActionListener(this); 
	    five.addActionListener(this); 
	    six.addActionListener(this); 
	    seven.addActionListener(this); 
	    eight.addActionListener(this); 
	    nine.addActionListener(this); 
	    plus.addActionListener(this); 
	    minus.addActionListener(this); 
	    multi.addActionListener(this); 
	    divide.addActionListener(this); 
	    equals.addActionListener(this); 
	    
	    
	    btnPanel.add(one);
	    btnPanel.add(two);
	    btnPanel.add(three);
	    btnPanel.add(equals);
	    btnPanel.add(four);
	    btnPanel.add(five);
	    btnPanel.add(six);
	    btnPanel.add(plus);
	    btnPanel.add(seven);
	    btnPanel.add(eight);
	    btnPanel.add(nine);
	    btnPanel.add(minus);
	    btnPanel.add(blank);
	    btnPanel.add(zero);
	    btnPanel.add(divide);
	    btnPanel.add(multi);
	    
	    pane.add(text,BorderLayout.NORTH);
        pane.add(btnPanel);
   
		return pane; 
	}
	
	 public void actionPerformed(ActionEvent e) {
		if(e.getSource() == zero) {
			num = 0;
		}
	 
		if(e.getSource() == one){
			num = 1;
		}
		
		if(e.getSource() == two) {
			num = 2;
		}
		
		if(e.getSource() == three) {
			num = 3;
		}
		
		if(e.getSource() == four)  {
			num = 4;
		}
		
		if(e.getSource() == five)  {
			num = 5;
		}
		
		if(e.getSource() == six)  {
			num = 6;
		}
		
		if(e.getSource() == seven) {
			num = 7;
		}
		
		if(e.getSource() == eight) {
			num = 8;
		}
		
		if(e.getSource() == nine) {
			num = 9;
		}

		text.setText(String.valueOf(num));
		 if(e.getSource() == plus){
			 oldnum = Integer.parseInt(text.getText());
			 text.setText(String.valueOf(sum));
			 operator = 1;
		 }
		 if(e.getSource() == minus){
			 oldnum = Integer.parseInt(text.getText());
			 text.setText(String.valueOf(sum));
			 operator = 2;
		 }
		 if(e.getSource() == multi){
			 oldnum = Integer.parseInt(text.getText());
			 text.setText(String.valueOf(sum));
			 operator = 3;
		 }
		 if(e.getSource() == divide){
			 oldnum = Integer.parseInt(text.getText());
			 text.setText(String.valueOf(sum));
			 operator = 4;
		 }
		 
		 if(e.getSource() == equals){
			 if(operator == 1){
				 newnum = Integer.parseInt(text.getText());
				 sum = oldnum + newnum;
				 text.setText(String.valueOf(sum));
				 sum = 0; 
			 }
			 if(operator == 2){
				 newnum = Integer.parseInt(text.getText());
				 sum = oldnum - newnum;
				 text.setText(String.valueOf(sum));
				 sum = 0; 
			 }
			 if(operator == 3){
				 newnum = Integer.parseInt(text.getText());
				 sum = oldnum * newnum;
				 text.setText(String.valueOf(sum));
				 sum = 0; 
			 }
			 if(operator == 4){
				 newnum = Integer.parseInt(text.getText());
				 sum = oldnum / newnum;
				 text.setText(String.valueOf(sum));
				 sum = 0; 
			 }
		 }
	 }
}
