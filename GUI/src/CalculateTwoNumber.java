import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumber1;
	private JTextField txtNumber2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculateTwoNumber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 380);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumber1 = new JLabel("Enter Number1");
		lblNumber1.setBounds(52, 23, 111, 26);
		lblNumber1.setForeground(new Color(0, 0, 0));
		lblNumber1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNumber1);
		
		txtNumber1 = new JTextField();
		txtNumber1.setBounds(188, 28, 183, 20);
		contentPane.add(txtNumber1);
		txtNumber1.setColumns(10);
		
		JLabel lblNumber2 = new JLabel("Enter Number2");
		lblNumber2.setBounds(52, 60, 111, 26);
		lblNumber2.setForeground(Color.BLACK);
		lblNumber2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNumber2);
		
		txtNumber2 = new JTextField();
		txtNumber2.setBounds(188, 65, 183, 20);
		txtNumber2.setColumns(10);
		contentPane.add(txtNumber2);
		
		final JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2,sum=0;
				String operator;
				if(e.getSource()==btnOK) {
					num1 = Double.parseDouble(txtNumber1.getText());
					num2 = Double.parseDouble(txtNumber2.getText());
					//sum = num1+num2;
					operator = (String)cmbOperator.getSelectedItem();
					if(operator.equals("+")) {
						sum = num1+num2;
					}
					if(operator.equals("-")) {
						sum = num1-num2;
					}
					if(operator.equals("*")) {
						sum = num1*num2;
					}
					if(operator.equals("/")) {
						sum = num1/num2;
					}
					DecimalFormat frmNumber = null;
					//JRadioButton
					if(onedigit.isSelected()){
						frmNumber = new DecimalFormat("#,###.0");
					}
					if(twodigit.isSelected()){
						frmNumber = new DecimalFormat("#,###.0.");
					}
					lblResult.setText(frmNumber.format(sum));
				}
			}
		});
		btnOK.setBounds(116, 292, 96, 38);
		contentPane.add(btnOK);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(237, 292, 105, 38);
		contentPane.add(btnExit);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setBounds(191, 255, 64, 26);
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblResult);
		
		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setBounds(52, 97, 111, 26);
		lblOperator.setForeground(Color.BLACK);
		lblOperator.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblOperator);
		
		JLabel lblHowToShow = new JLabel("How to show digit");
		lblHowToShow.setBounds(52, 134, 111, 26);
		lblHowToShow.setForeground(Color.BLACK);
		lblHowToShow.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblHowToShow);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("1 digit");
		rdbtnNewRadioButton.setBounds(188, 138, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnDigit = new JRadioButton("2 digit");
		rdbtnDigit.setBounds(188, 164, 109, 23);
		contentPane.add(rdbtnDigit);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(188, 101, 67, 22);
		contentPane.add(comboBox);
	}
}
