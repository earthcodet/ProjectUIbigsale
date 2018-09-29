package Frame;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import DataManager.UserManager;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.awt.Cursor;
import javax.swing.UIManager;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField textphone;
	private JTextField textname;
	private JTextField textemail;
	private JTextField textShow;
	private JPasswordField txtpass;
	private JTextField textdate;
static int checkShow =0;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */

private static Icon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
    Image img = icon.getImage();
    Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight,  java.awt.Image.SCALE_SMOOTH);
    return new ImageIcon(resizedImage);
    }

	public Register() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("BIG SALE - สมัครสมาชิก");
		String imagePath = "src/Image/ICON.png";
		setIconImage(Toolkit.getDefaultToolkit().getImage(imagePath));
		setBounds(100, 100, 970, 614);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelMain = new JPanel();
		panelMain.setBounds(0, 0, 981, 95);
		panelMain.setBackground(new Color(8,54,69));
		contentPane.add(panelMain);
		panelMain.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0E01\u0E23\u0E38\u0E13\u0E32\u0E01\u0E23\u0E2D\u0E01\u0E02\u0E49\u0E2D\u0E21\u0E39\u0E25\u0E40\u0E1E\u0E37\u0E48\u0E2D\u0E2A\u0E21\u0E31\u0E04\u0E23\u0E2A\u0E21\u0E32\u0E0A\u0E34\u0E01");
		lblNewLabel.setFont(new Font("CS ChatThai", Font.PLAIN, 30));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(38, 13, 345, 82);
		panelMain.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 204));
		panel.setBounds(0, 81, 981, 500);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(29, 35, 913, 441);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		textphone = new JTextField();
		textphone.setBounds(483, 199, 366, 50);
		panel_1.add(textphone);
		textphone.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		textphone.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u0E2B\u0E21\u0E32\u0E22\u0E40\u0E25\u0E02\u0E42\u0E17\u0E23\u0E28\u0E31\u0E1E\u0E17\u0E4C");
		lblNewLabel_1.setBounds(483, 153, 184, 50);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		
		JLabel label = new JLabel("\u0E0A\u0E37\u0E48\u0E2D - \u0E19\u0E32\u0E21\u0E2A\u0E01\u0E38\u0E25");
		label.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		label.setBounds(483, 24, 169, 33);
		panel_1.add(label);
		
		textname = new JTextField();
		textname.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		textname.setColumns(10);
		textname.setBounds(483, 70, 366, 50);
		panel_1.add(textname);
		
		JLabel label_1 = new JLabel("\u0E2D\u0E35\u0E40\u0E21\u0E25\u0E4C");
		label_1.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		label_1.setBounds(56, 24, 83, 33);
		panel_1.add(label_1);
		
		textemail = new JTextField();
		textemail.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		textemail.setColumns(10);
		textemail.setBounds(56, 70, 366, 50);
		panel_1.add(textemail);
		
		JLabel label_2 = new JLabel("\u0E23\u0E2B\u0E31\u0E2A\u0E1C\u0E48\u0E32\u0E19");
		label_2.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		label_2.setBounds(56, 153, 83, 50);
		panel_1.add(label_2);
		
		textShow = new JTextField();
		textShow.setVisible(false);
		
		txtpass = new JPasswordField();
		txtpass.setBounds(56, 199, 312, 50);
		panel_1.add(txtpass);
		textShow.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		textShow.setColumns(10);
		textShow.setBounds(56, 199, 312, 50);
		panel_1.add(textShow);
		
		JLabel lbleye = new JLabel("");
		ImageIcon icon = new ImageIcon(Login.class.getResource("/Image/\u0E0B\u0E48\u0E2D\u0E19\u0E15\u0E32.png"));
		lbleye.setBounds(373, 199, 60, 50);
		int offset = lbleye.getInsets().left;
        lbleye.setIcon(resizeIcon(icon, lbleye.getWidth() - offset, lbleye.getHeight() - offset));
		panel_1.add(lbleye);
		
		textdate = new JTextField();
		textdate.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		textdate.setColumns(10);
		textdate.setBounds(56, 338, 366, 50);
		panel_1.add(textdate);
		
		JLabel label_3 = new JLabel("\u0E27\u0E31\u0E19\u0E40\u0E14\u0E37\u0E2D\u0E19\u0E1B\u0E35\u0E40\u0E01\u0E34\u0E14 (\u0E23\u0E39\u0E1B\u0E41\u0E1A\u0E1A\u0E15\u0E31\u0E27\u0E2D\u0E22\u0E48\u0E32\u0E07 28/12/2511)");
		label_3.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		label_3.setBounds(56, 292, 366, 33);
		panel_1.add(label_3);
		
		JLabel labelalertemail = new JLabel("\u0E23\u0E38\u0E1B\u0E41\u0E1A\u0E1A\u0E2D\u0E35\u0E40\u0E21\u0E25\u0E4C\u0E44\u0E21\u0E48\u0E16\u0E39\u0E01\u0E15\u0E49\u0E2D\u0E07");
		labelalertemail.setVisible(false);
		labelalertemail.setForeground(Color.RED);
		labelalertemail.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		labelalertemail.setBounds(56, 133, 198, 33);
		panel_1.add(labelalertemail);
		
		JLabel labelalertdate = new JLabel("\u0E23\u0E38\u0E1B\u0E41\u0E1A\u0E1A\u0E27\u0E31\u0E19\u0E40\u0E01\u0E34\u0E14\u0E44\u0E21\u0E48\u0E16\u0E39\u0E01\u0E15\u0E49\u0E2D\u0E07");
		labelalertdate.setVisible(false);
		labelalertdate.setForeground(Color.RED);
		labelalertdate.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		labelalertdate.setBounds(66, 395, 198, 33);
		panel_1.add(labelalertdate);
		
		JLabel labelalertphone = new JLabel("\u0E23\u0E38\u0E1B\u0E41\u0E1A\u0E1A\u0E2B\u0E21\u0E32\u0E22\u0E40\u0E25\u0E02\u0E44\u0E21\u0E48\u0E16\u0E39\u0E01\u0E15\u0E49\u0E2D\u0E07");
		labelalertphone.setVisible(false);
		labelalertphone.setForeground(Color.RED);
		labelalertphone.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		labelalertphone.setBounds(483, 251, 198, 33);
		panel_1.add(labelalertphone);
		
		JLabel lblalert1 = new JLabel("\u0E0A\u0E48\u0E2D\u0E07\u0E19\u0E35\u0E49\u0E40\u0E27\u0E49\u0E19\u0E27\u0E32\u0E07\u0E44\u0E21\u0E48\u0E44\u0E14\u0E49");
		lblalert1.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		lblalert1.setVisible(false);
		lblalert1.setForeground(Color.RED);
		lblalert1.setBounds(55, 253, 266, 44);
		panel_1.add(lblalert1);
		
		JLabel lblalert2 = new JLabel("\u0E0A\u0E48\u0E2D\u0E07\u0E19\u0E35\u0E49\u0E40\u0E27\u0E49\u0E19\u0E27\u0E32\u0E07\u0E44\u0E21\u0E48\u0E44\u0E14\u0E49");
		lblalert2.setVisible(false);
		lblalert2.setForeground(Color.RED);
		lblalert2.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		lblalert2.setBounds(483, 120, 266, 44);
		panel_1.add(lblalert2);
		
		JLabel lblalert3 = new JLabel("New label");
		lblalert3.setVisible(false);
		lblalert3.setForeground(Color.RED);
		lblalert3.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		lblalert3.setBounds(56, 123, 366, 53);
		panel_1.add(lblalert3);
		
		JLabel lblalert4 = new JLabel("New label");
		lblalert4.setVisible(false);
		lblalert4.setForeground(Color.RED);
		lblalert4.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		lblalert4.setBounds(483, 251, 366, 46);
		panel_1.add(lblalert4);
		
		JLabel lblregister = new JLabel("");
		lblregister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblregister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				labelalertphone.setVisible(false);
				labelalertdate.setVisible(false);
				labelalertemail.setVisible(false);
				lblalert1.setVisible(false);
				lblalert2.setVisible(false);
				lblalert3.setVisible(false);
				lblalert4.setVisible(false);
				boolean pass = true;
				boolean emailnotnull = true;
				boolean phonenotnull = true;
				if (!(Pattern.matches("^[0]+[0-9]+$", textphone.getText()))) {
				       labelalertphone.setVisible(true);
				       pass=false;
				       phonenotnull=false;
				}
				if(!(Pattern.matches("^[0-9]+[0-9]+[/]{1}+[0-1]+[0-9]+[/]{1}+[2]+[4-5]+[0-9]+[0-9]+$", textdate.getText()))) {
						labelalertdate.setVisible(true);
					       pass=false;
				}
				if(!(Pattern.matches("^[a-zA-Z0-9_.]+[@]{1}+[a-zA-Z0-9.]+[.]{1}+[a-zA-Z0-9]+$", textemail.getText()))) {
					labelalertemail.setVisible(true);
				       pass=false;
				       emailnotnull=false;
				}
				if(textname.getText().trim().length() < 1) {
					lblalert1.setVisible(true);
				       pass=false;
				}
				if(new String(txtpass.getPassword()).trim().length() < 1) {
					lblalert2.setVisible(true);
				       pass=false;
				}
				
						UserManager c = new UserManager();
						boolean checkemail = c.check_Email(textemail.getText());
						boolean checkphone = c.check_Phone(textphone.getText());
						if(!checkemail&&emailnotnull) {
						lblalert3.setText("email นี้มีผู้ใช้งานแล้ว");
						lblalert3.setVisible(true);
					       pass=false;
					}
					if(!checkphone&&phonenotnull) {
						lblalert4.setText("phone นี้มีผู้ใช้งานแล้ว");
						lblalert4.setVisible(true);
					       pass=false;
					}
					if(pass) {
						boolean checkInsert = c.Insert(textemail.getText(), textphone.getText(), textdate.getText(), new String(txtpass.getPassword()).trim(), textname.getText());
						if(checkInsert) {
						JLabel title = new JLabel("สมัครสมาชิกเรียบร้อย");
						title.setFont(new Font("CS ChatThai", Font.PLAIN, 35));
						JOptionPane.showMessageDialog(null,  title,"แจ้งเตือน", JOptionPane.PLAIN_MESSAGE);
						try {
							Login login = new Login();
							login.setVisible(true);
							
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						dispose();
						}else {
							JLabel title = new JLabel("เกิดข้อผิดพลาด");
							title.setFont(new Font("CS ChatThai", Font.PLAIN, 35));
							JOptionPane.showMessageDialog(null,  title,"แจ้งเตือน", JOptionPane.WARNING_MESSAGE);	
						}
					}
			}
		});
		lblregister.setIcon(new ImageIcon(Register.class.getResource("/Image/registerColor .PNG")));
		lblregister.setBounds(483, 326, 366, 62);
		panel_1.add(lblregister);
		
		JLabel lblNewLabel_2 = new JLabel("\u0E01\u0E25\u0E31\u0E1A\u0E2B\u0E19\u0E49\u0E32\u0E25\u0E47\u0E2D\u0E01\u0E2D\u0E34\u0E19");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Login login = new Login();
					login.setVisible(true);
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
		lblNewLabel_2.setBorder(UIManager.getBorder("MenuBar.border"));
		lblNewLabel_2.setFont(new Font("CS ChatThai", Font.PLAIN, 20));
		lblNewLabel_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2.setBounds(731, 395, 109, 33);
		panel_1.add(lblNewLabel_2);
		
		lbleye.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(checkShow==0) {
					textShow.setText(new String(txtpass.getPassword()).trim());
					textShow.setVisible(true);
					txtpass.setVisible(false);
					ImageIcon icon = new ImageIcon(Login.class.getResource("/Image/\u0E44\u0E21\u0E48\u0E0B\u0E48\u0E2D\u0E19\u0E15\u0E32.png"));
					lbleye.setBounds(373, 199, 60, 50);
			        int offset = lbleye.getInsets().left;
			        lbleye.setIcon(resizeIcon(icon, lbleye.getWidth() - offset, lbleye.getHeight() - offset));
					checkShow++;
				}
				else {
					txtpass.setText(textShow.getText());
					textShow.setVisible(false);
					txtpass.setVisible(true);
					ImageIcon icon = new ImageIcon(Login.class.getResource("/Image/\u0E0B\u0E48\u0E2D\u0E19\u0E15\u0E32.png"));
					lbleye.setBounds(373, 199, 60, 50);
			        int offset = lbleye.getInsets().left;
			        lbleye.setIcon(resizeIcon(icon, lbleye.getWidth() - offset, lbleye.getHeight() - offset));
					checkShow--;
				}
			}
		});
	}
}
