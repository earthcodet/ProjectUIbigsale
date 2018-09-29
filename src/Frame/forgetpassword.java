package Frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DataManager.UserManager;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class forgetpassword extends JFrame {

	private JPanel contentPane;
	private JTextField textemail;
	private JTextField textname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					forgetpassword frame = new forgetpassword();
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
	public forgetpassword() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("BIG SALE - ลืมรหัสผ่าน");
		String imagePath = "src/Image/ICON.png";
		setIconImage(Toolkit.getDefaultToolkit().getImage(imagePath));
		setBounds(100, 100, 580, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelMain = new JPanel();
		panelMain.setBounds(0, 0, 576, 79);
		panelMain.setBackground(new Color(8,54,69));
		contentPane.add(panelMain);
		panelMain.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0E25\u0E37\u0E21\u0E23\u0E2B\u0E31\u0E2A\u0E1C\u0E48\u0E32\u0E19");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("CS ChatThai", Font.PLAIN, 30));
		lblNewLabel.setBounds(24, 13, 188, 53);
		panelMain.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 204));
		panel.setBounds(0, 79, 576, 375);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(27, 25, 516, 258);
		panel_1.setBackground(new Color(255, 255, 255));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\u0E2D\u0E35\u0E40\u0E21\u0E25\u0E4C");
		lblNewLabel_1.setBounds(34, 13, 203, 43);
		lblNewLabel_1.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		panel_1.add(lblNewLabel_1);
		
		textemail = new JTextField();
		textemail.setBounds(34, 57, 445, 43);
		textemail.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		panel_1.add(textemail);
		textemail.setColumns(10);
		
		textname = new JTextField();
		textname.setBounds(34, 156, 445, 43);
		textname.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		textname.setColumns(10);
		panel_1.add(textname);
		
		JLabel label = new JLabel("\u0E0A\u0E37\u0E48\u0E2D\u0E08\u0E23\u0E34\u0E07  - \u0E19\u0E32\u0E21\u0E2A\u0E01\u0E38\u0E25");
		label.setBounds(34, 113, 203, 43);
		label.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("\u0E44\u0E21\u0E48\u0E1E\u0E1A\u0E02\u0E49\u0E2D\u0E21\u0E39\u0E25\u0E43\u0E19\u0E23\u0E30\u0E1A\u0E1A");
		label_1.setVisible(false);
		label_1.setForeground(Color.RED);
		label_1.setBounds(165, 212, 203, 43);
		label_1.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		panel_1.add(label_1);
		
		JButton btnNewButton = new JButton("\u0E22\u0E37\u0E19\u0E22\u0E31\u0E19");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserManager UserManager = new UserManager();
				label_1.setVisible(false);
				if(textemail.getText().length()<1||textname.getText().length()<1) {
					label_1.setVisible(true);
				}
				String check = UserManager.forget(textemail.getText(), textname.getText());
				if(!check.equals("notFound")) {
					forgetpasswordCom forget = new forgetpasswordCom(textemail.getText(),check);
					forget.setVisible(true);
					dispose();
				}
				else {
					label_1.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(137, 296, 285, 60);
		btnNewButton.setBackground(new Color(255, 102, 51));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("CS ChatThai", Font.PLAIN, 30));
		panel.add(btnNewButton);
		panel_1.setBackground(new Color(255, 255, 255));
		
		textemail.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode () == KeyEvent.VK_ENTER) {
					UserManager UserManager = new UserManager();
					if(textemail.getText().length()<1||textname.getText().length()<1) {
						System.out.println("ไม่พบข้อมูล");
					}
					String check = UserManager.forget(textemail.getText(), textname.getText());
					if(!check.equals("notFound")) {
						forgetpasswordCom forget = new forgetpasswordCom(textemail.getText(),check);
						forget.setVisible(true);
						dispose();
					}
					else {
						System.out.println("ไม่พบข้อมูล");
					}
				}
			}
		});
		
		
		textname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode () == KeyEvent.VK_ENTER) {
					UserManager UserManager = new UserManager();
					if(textemail.getText().length()<1||textname.getText().length()<1) {
						System.out.println("ไม่พบข้อมูล");
					}
					String check = UserManager.forget(textemail.getText(), textname.getText());
					if(!check.equals("notFound")) {
						forgetpasswordCom forget = new forgetpasswordCom(textemail.getText(),check);
						forget.setVisible(true);
						dispose();
					}
					else {
						System.out.println("ไม่พบข้อมูล");
					}
				}
			}
		});
		
	}


}
