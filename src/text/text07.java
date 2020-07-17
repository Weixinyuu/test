package text;
import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class text07 {
	public static void main(String[] args) {
		JFrame jf = new JFrame("学生测试窗口");
        jf.setSize(700, 470);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // 创建内容面板
        JPanel panel = new JPanel(null);
        //创建一级菜单
        JMenuBar menuBar=new JMenuBar();
  		jf.setJMenuBar(menuBar);
        
  		//菜单
  		JMenu menu1=new JMenu("文件:");
  		JMenu menu2=new JMenu("编辑:");
  		JMenu menu3=new JMenu("视图:");
  		JMenu menu4=new JMenu("帮助:");
  		
  		menuBar.add(menu1);
  		menuBar.add(menu2);
  		menuBar.add(menu3);
  		menuBar.add(menu4);
  		//图片
  		JLabel label_image = new JLabel(new ImageIcon("./src/images/88.jpg")); 
  		label_image.setLocation(5, 8);
  	 	label_image.setSize(150,250);
		 panel.add(label_image);
        
			//学生学号
			JLabel label_username=new JLabel("学号:");
			jf.add(label_username);
			
			JTextField userName = new JTextField(25);
			jf.add(userName);
	        // 设置按钮的坐标
			label_username.setLocation(200, 5);
			userName.setLocation(240,15);
	        // 设置按钮的宽高
			label_username.setSize(300, 50);
			userName.setSize(305,30);
	        panel.add(label_username);
	        panel.add(userName);
	        
        // 学生姓名
        JLabel name=new JLabel("姓名: ");
		jf.add(name);
		
		JTextField userName1 = new JTextField(30);
		jf.add(userName1);
        // 设置按钮的坐标
		name.setLocation(205, 55);
		userName1.setLocation(245,65);
        // 设置按钮的宽高
		name.setSize(300, 55);
		userName1.setSize(305,30);
        panel.add(name);
        panel.add(userName1);
        
        //性别
        JLabel SSex=new JLabel("性别: ");
		panel.add(SSex);
		JRadioButton radio1 = new JRadioButton("女",false);
		panel.add(radio1);
		JRadioButton radio2 = new JRadioButton("男",true);
		panel.add(radio2);
		
		ButtonGroup button1=new ButtonGroup();
		button1.add(radio1);
		button1.add(radio2);
		
		SSex.setLocation(205, 100);
		radio1.setLocation(275,100);
		radio2.setLocation(355,100);
		
        // 设置按钮的宽高
		SSex.setSize(105, 55);
		radio1.setSize(55,55);
		radio2.setSize(55,55);
        panel.add(SSex);
        panel.add(radio1);
        panel.add(radio2);
        
        // 年龄
        JLabel age=new JLabel("年龄: ");
		jf.add(age);
		
		JTextField userName2 = new JTextField(30);
		jf.add(userName2);
        // 设置按钮的坐标
		age.setLocation(205, 145);
		userName2.setLocation(245,155);
        // 设置按钮的宽高
		age.setSize(105, 55);
		userName2.setSize(305,30);
        panel.add(age);
        panel.add(userName2);
        
        // 手机
        JLabel phone=new JLabel("手机: ");
		jf.add(phone);
		
		JTextField userName3 = new JTextField(30);
		jf.add(userName3);
        // 设置按钮的坐标
		phone.setLocation(205, 190);
		userName3.setLocation(245,200);
        // 设置按钮的宽高
		phone.setSize(105, 55);
		userName3.setSize(305,30);
        panel.add(phone);
        panel.add(userName3);
        
        // 住址
        JLabel address=new JLabel("住址: ");
		jf.add(address);
		
		JTextField userName4 = new JTextField(25);
		
        // 设置按钮的坐标
		address.setLocation(200, 230);
		userName4.setLocation(240,240);
        // 设置按钮的宽高
		address.setSize(100, 50);
		userName4.setSize(300,25);
        panel.add(address);
        panel.add(userName4);
        
      //添加按钮
		JButton button11=new JButton("添加照片.");
		panel.add(button11);
		JButton button2=new JButton("增加记录.");
		panel.add(button2);
		JButton button3=new JButton("修改记录.");
		panel.add(button3);
		JButton button4=new JButton("删除记录.");
		panel.add(button4);
        
		button11.setLocation(200,280);
		button2.setLocation(300,280);
		button3.setLocation(400,280);
		button4.setLocation(500,280);
		
		button11.setSize(90, 30);
		button2.setSize(90, 30);
		button3.setSize(90, 30);
		button4.setSize(90, 30);
		
		panel.add(button11);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
        // 显示窗口
        jf.setContentPane(panel);
        jf.setVisible(true);

	}
}