package Frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DataManager.UserManager;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.border.BevelBorder;
import java.awt.ComponentOrientation;

public class Login extends JFrame  {

	private JPanel contentPane;
	private JTextField txtuser;
	private JTextField textshow;
	private JPasswordField txtpass;
	static int checkShow=0;
	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	 private static Icon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
		    Image img = icon.getImage();
		    Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight,  java.awt.Image.SCALE_SMOOTH);
		    return new ImageIcon(resizedImage);
		    }
	public Login() throws IOException {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("BIG SALE - เข้าสู่ระบบ");
		setBounds(100, 100, 734, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelMain = new JPanel();
		panelMain.setBounds(0, 0, 728, 86);
		panelMain.setBackground(new Color(8,54,69));
		contentPane.add(panelMain);
		panelMain.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0E22\u0E34\u0E19\u0E14\u0E35\u0E15\u0E49\u0E2D\u0E19\u0E23\u0E31\u0E1A\u0E40\u0E02\u0E49\u0E32\u0E2A\u0E39\u0E48\u0E1A\u0E34\u0E4A\u0E01\u0E40\u0E0B\u0E25 \u0E01\u0E23\u0E38\u0E13\u0E32\u0E40\u0E02\u0E49\u0E32\u0E2A\u0E39\u0E48\u0E23\u0E30\u0E1A\u0E1A ");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("CS ChatThai", Font.PLAIN, 35));
		lblNewLabel.setBounds(37, 13, 522, 70);
		panelMain.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 204));
		panel.setBounds(0, 87, 728, 317);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(27, 23, 471, 272);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel(" \n\u0E2B\u0E21\u0E32\u0E22\u0E40\u0E25\u0E02\u0E42\u0E17\u0E23\u0E28\u0E31\u0E1E\u0E17\u0E4C\u0E2B\u0E23\u0E37\u0E2D\u0E2D\u0E35\u0E40\u0E21\u0E25\u0E4C\n\n\n\u2028 ");
		lblNewLabel_1.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(12, 13, 245, 43);
		panel_1.add(lblNewLabel_1);
		
		txtuser = new JTextField();
		txtuser.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtuser.setBounds(12, 57, 441, 46);
		panel_1.add(txtuser);
		txtuser.setColumns(10);
		
		textshow = new JTextField();
		textshow.setFont(new Font("CS ChatThai", Font.PLAIN, 20));
		textshow.setVisible(false);
		
		
		JLabel lbleye = new JLabel("");
		lbleye.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbleye.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(checkShow==0) {
					textshow.setText(new String(txtpass.getPassword()).trim());
					textshow.setVisible(true);
					txtpass.setVisible(false);
					ImageIcon icon = new ImageIcon(Login.class.getResource("/Image/\u0E44\u0E21\u0E48\u0E0B\u0E48\u0E2D\u0E19\u0E15\u0E32.png"));
					lbleye.setBounds(398, 166, 55, 46);
			        int offset = lbleye.getInsets().left;
			        lbleye.setIcon(resizeIcon(icon, lbleye.getWidth() - offset, lbleye.getHeight() - offset));
					checkShow++;
				}
				else {
					txtpass.setText(textshow.getText());
					textshow.setVisible(false);
					txtpass.setVisible(true);
					ImageIcon icon = new ImageIcon(Login.class.getResource("/Image/\u0E0B\u0E48\u0E2D\u0E19\u0E15\u0E32.png"));
					lbleye.setBounds(398, 166, 55, 46);
			        int offset = lbleye.getInsets().left;
			        lbleye.setIcon(resizeIcon(icon, lbleye.getWidth() - offset, lbleye.getHeight() - offset));
					checkShow--;
				}
			}
		});
		//"user.dir") + "/src/Image/ซ่อนตา.png"
		//ไม่ซ่อนตา
		//Login.class.getResource("/Image/\u0E44\u0E21\u0E48\u0E0B\u0E48\u0E2D\u0E19\u0E15\u0E32.png")
		ImageIcon icon = new ImageIcon(Login.class.getResource("/Image/\u0E0B\u0E48\u0E2D\u0E19\u0E15\u0E32.png"));
		lbleye.setBounds(398, 166, 55, 46);
        int offset = lbleye.getInsets().left;
        lbleye.setIcon(resizeIcon(icon, lbleye.getWidth() - offset, lbleye.getHeight() - offset));
		panel_1.add(lbleye);
		
		txtpass = new JPasswordField();
		txtpass.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpass.setBounds(12, 166, 380, 46);
		panel_1.add(txtpass);
		textshow.setColumns(10);
		textshow.setBounds(12, 166, 380, 46);
		panel_1.add(textshow);
		
		JLabel label = new JLabel("\u0E23\u0E2B\u0E31\u0E2A\u0E1C\u0E48\u0E32\u0E19");
		label.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		label.setBounds(12, 110, 245, 43);
		panel_1.add(label);
		
		JLabel lblexlogin = new JLabel("\u0E01\u0E23\u0E38\u0E13\u0E32\u0E01\u0E23\u0E2D\u0E01\u0E02\u0E49\u0E2D\u0E21\u0E39\u0E25\u0E43\u0E2B\u0E49\u0E04\u0E23\u0E1A");
		lblexlogin.setForeground(new Color(255, 0, 51));
		lblexlogin.setVisible(false);
		lblexlogin.setFont(new Font("CS ChatThai", Font.PLAIN, 30));
		lblexlogin.setBounds(37, 218, 296, 39);
		panel_1.add(lblexlogin);
		
		JLabel lblNewLabel_2 = new JLabel("\u0E25\u0E37\u0E21\u0E23\u0E2B\u0E31\u0E2A\u0E1C\u0E48\u0E32\u0E19");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				forgetpassword nw = new forgetpassword();
				nw.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_2.setBorder(UIManager.getBorder("MenuBar.border"));
		//WAIT_CURSOR
		lblNewLabel_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2.setForeground(Color.BLUE);
		//font.setStyle(Font.UNDERLINE);
		lblNewLabel_2.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(356, 225, 97, 26);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblregister = new JLabel("");
		lblregister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblregister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Register regis = new Register();
				regis.setVisible(true);
				dispose();
			}
		});
		lblregister.setIcon(new ImageIcon(Login.class.getResource("/Image/register.PNG")));
		lblregister.setBounds(510, 180, 218, 69);
		panel.add(lblregister);
		
		JLabel lblLogin = new JLabel("");
		lblLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UserManager UserManager = new UserManager();
				if(txtuser.getText().trim().length() < 1 || new String(txtpass.getPassword()).trim().length() < 1) {
					lblexlogin.setVisible(true);
				}
				else {
					boolean check = UserManager.checkLogin(txtuser.getText().trim(),new String(txtpass.getPassword()).trim()); 
					if(!check) {
						JLabel title = new JLabel("ยินดีต้อนรับเข้าสู่ระบบ ");
						title.setFont(new Font("CS ChatThai", Font.PLAIN, 35));
						JOptionPane.showMessageDialog(Login.this, title, "แจ้งเตือน", JOptionPane.PLAIN_MESSAGE);
						dispose();
						
					}
					else {
						JLabel title = new JLabel("ชื่อผู้ใช้และรหัสผ่านไม่ถูกต้อง");
						title.setFont(new Font("CS ChatThai", Font.PLAIN, 35));
						JOptionPane.showMessageDialog(null,  title,"แจ้งเตือน", JOptionPane.WARNING_MESSAGE);
					}
				}
			}
		});
		lblLogin.setIcon(new ImageIcon(Login.class.getResource("/Image/Login in.PNG")));
		lblLogin.setBounds(510, 70, 193, 66);
		panel.add(lblLogin);
		
		JLabel label_1 = new JLabel("\u0E01\u0E25\u0E31\u0E1A\u0E2B\u0E19\u0E49\u0E32\u0E2B\u0E25\u0E31\u0E01");
		label_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Homes home = new Homes();
				home.setVisible(true);
				dispose();
			}
		});
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("CS ChatThai", Font.PLAIN, 25));
		label_1.setBorder(UIManager.getBorder("MenuBar.border"));
		label_1.setBounds(597, 269, 106, 26);
		panel.add(label_1);
		
		String imagePath = "src/Image/ICON.png";
		setIconImage(Toolkit.getDefaultToolkit().getImage(imagePath));
		
		txtuser.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					UserManager UserManager = new UserManager();
					if(txtuser.getText().trim().length() < 1 || new String(txtpass.getPassword()).trim().length() < 1) {
						lblexlogin.setVisible(true);
					}
					else {
						boolean check = UserManager.checkLogin(txtuser.getText().trim(),new String(txtpass.getPassword()).trim()); 
						if(check) {
							JLabel title = new JLabel("ยินดีต้อนรับเข้าสู่ระบบ ");
							title.setFont(new Font("CS ChatThai", Font.PLAIN, 35));
							JOptionPane.showMessageDialog(Login.this, title, "แจ้งเตือน", JOptionPane.PLAIN_MESSAGE);
							dispose();
							
						}
						else {
							JLabel title = new JLabel("ชื่อผู้ใช้และรหัสผ่านไม่ถูกต้อง");
							title.setFont(new Font("CS ChatThai", Font.PLAIN, 35));
							JOptionPane.showMessageDialog(null,  title,"แจ้งเตือน", JOptionPane.WARNING_MESSAGE);
						}
					}
				}
			}
		});
	
		
		txtpass.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					UserManager UserManager = new UserManager();
					if(txtuser.getText().trim().length() < 1 || new String(txtpass.getPassword()).trim().length() < 1) {
						lblexlogin.setVisible(true);
					}
					else {
						boolean check = UserManager.checkLogin(txtuser.getText().trim(),new String(txtpass.getPassword()).trim()); 
						if(!check) {
							JLabel title = new JLabel("ยินดีต้อนรับเข้าสู่ระบบ ");
							title.setFont(new Font("CS ChatThai", Font.PLAIN, 35));
							JOptionPane.showMessageDialog(Login.this, title, "แจ้งเตือน", JOptionPane.PLAIN_MESSAGE);
							dispose();
							
						}
						else {
							JLabel title = new JLabel("ชื่อผู้ใช้และรหัสผ่านไม่ถูกต้อง");
							title.setFont(new Font("CS ChatThai", Font.PLAIN, 35));
							JOptionPane.showMessageDialog(null,  title,"แจ้งเตือน", JOptionPane.WARNING_MESSAGE);
						}
					}
				}
			}
		});
		
		
		textshow.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					UserManager UserManager = new UserManager();
					if(txtuser.getText().trim().length() < 1 || new String(txtpass.getPassword()).trim().length() < 1) {
						lblexlogin.setVisible(true);
					}
					else {
						boolean check = UserManager.checkLogin(txtuser.getText().trim(),new String(txtpass.getPassword()).trim()); 
						if(!check) {
							JLabel title = new JLabel("ยินดีต้อนรับเข้าสู่ระบบ ");
							title.setFont(new Font("CS ChatThai", Font.PLAIN, 35));
							JOptionPane.showMessageDialog(Login.this, title, "แจ้งเตือน", JOptionPane.PLAIN_MESSAGE);
							dispose();
							
						}
						else {
							JLabel title = new JLabel("ชื่อผู้ใช้และรหัสผ่านไม่ถูกต้อง");
							title.setFont(new Font("CS ChatThai", Font.PLAIN, 35));
							JOptionPane.showMessageDialog(null,  title,"แจ้งเตือน", JOptionPane.WARNING_MESSAGE);
						}
					}
				}
			}
		});
		
	}
}
