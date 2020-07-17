//3.3 CardLayout��GridLayout
//���ӣ�
package text;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class text04 {
	private static JComponent jframe;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		
		JPanel leftPanel = new JPanel();
		final JPanel centerPanel = new JPanel();
		
		frame.add(leftPanel,BorderLayout.WEST);
		frame.add(centerPanel);
		
		//���񲼾�,����,һ��
		leftPanel.setLayout(new GridLayout(3,1)); 
		JButton btnPrev=new JButton("ǰһ��");
		JButton btnNext=new JButton("��һ��");
		JButton btnThree=new JButton("������");
		
		leftPanel.add(btnPrev);
		leftPanel.add(btnNext);
		leftPanel.add(btnThree);		
		
		//�м�������,��Ϊ��Ƭ����
		final CardLayout cl=new CardLayout(); //��Ƭ����
		centerPanel.setLayout(cl);   
		centerPanel.add(new JButton("A"),"1AAA");
		centerPanel.add(new JButton("B"),"2AAA");
		centerPanel.add(new JButton("C"),"3AAA");
		centerPanel.add(new JButton("D"),"4AAA");
		centerPanel.add(new JButton("E"),"5AAA");
		centerPanel.add(new JButton("F"),"6AAA");		
		
		
		//���ڰ�ť�¼�������ڲ���
		class MyActionListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("ǰһ��")){
					cl.previous(centerPanel);
				}
				else if(e.getActionCommand().equals("��һ��")){
					cl.next(centerPanel);
				}
				else if(e.getActionCommand().equals("������")){
					cl.show(centerPanel, "3AAA");  //ָ����ʾ��һ��
				}
			}
		}
		
		MyActionListener listener = new MyActionListener();
		
		btnPrev.addActionListener(listener);
		btnNext.addActionListener(listener);
		btnThree.addActionListener(listener);
		
		   frame.setVisible(true);
    	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}	