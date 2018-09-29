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
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class forgetpasswordCom extends JFrame {

	private JPanel contentPane;

	public forgetpasswordCom(String Temail , String Tpassword) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("BIG SALE - ลืมรหัสผ่าน");
		String imagePath = "src/Image/ICON.png";
		setIconImage(Toolkit.getDefaultToolkit().getImage(imagePath));
		setBounds(100, 100, 559, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelMain = new JPanel();
		panelMain.setBounds(0, 0, 555, 79);
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
		panel.setBounds(0, 79, 555, 358);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(50, 23, 457, 217);
		panel_1.setBackground(new Color(255, 255, 255));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("\u0E22\u0E37\u0E19\u0E22\u0E31\u0E19");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			try {
				Login news = new Login();
				news.setVisible(true);
				dispose();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		});
		btnNewButton.setBounds(131, 266, 285, 60);
		btnNewButton.setBackground(new Color(255, 102, 51));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("CS ChatThai", Font.PLAIN, 30));
		panel.add(btnNewButton);
		panel_1.setBackground(new Color(255, 255, 255));
		
		JLabel lbl1 = new JLabel("New label");
		lbl1.setFont(new Font("CS ChatThai", Font.PLAIN, 30));
		lbl1.setBounds(48, 33, 454, 38);
		panel_1.add(lbl1);
		
		JLabel lbl2 = new JLabel("New label");
		lbl2.setFont(new Font("CS ChatThai", Font.PLAIN, 30));
		lbl2.setBounds(48, 137, 454, 38);
		panel_1.add(lbl2);
		
		String email = "อีเมล์ : "+Temail;
		String password = "รหัสผ่าน :"+Tpassword;
		lbl1.setText(email);
		lbl2.setText(password);
	}

}
