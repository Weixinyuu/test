//3.1 BorderLayout���߽粼��
//package text;
//import java.awt.BorderLayout;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//
//public class text03 {
//       public static void main(String[] args){
//    	   JFrame jframe = new JFrame();
//    	   jframe.setSize(600,600);
//    	   jframe.setLocation(200,200);
//   	   
//   	   jframe.setLayout(new BorderLayout()); //���ñ߿򲼾�
//    	   jframe.add(new JButton("��ť1"),BorderLayout.SOUTH);
//    	   jframe.add(new JButton("��ť2"),BorderLayout.WEST);
//    	   jframe.add(new JButton("��ť3"),BorderLayout.NORTH);
//   	   jframe.add(new JButton("��ť4"),BorderLayout.EAST);
 //   	   jframe.add(new JButton("��ť5"),BorderLayout.CENTER);
 //   	   
 //   	   jframe.setVisible(true);
 //   	   jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    	   
//       }
//}

//		3.2 FlowLayout����ʽ����
//					FlowLayout �������е���������ң����ϵ����������С�
//					���ĳ�������� FlowLayout ���֣���ô��add������ָ����λ�ò����������ԡ�
//					���������ڴ�С�ı�ʱ�������λ�ÿ��ܻᷢ���仯��������ߴ粻�䡣
//					FlowLayout ����壨JPanel����Ĭ�ϲ���
package text;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class text03 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setLayout(new FlowLayout());
		frame.add(new JButton("��ť1"),BorderLayout.SOUTH);   //�˲���ʧЧ
		frame.add(new JButton("��ť2"));
		frame.add(new JButton("��ť3"));
		frame.add(new JButton("��ť4"));
		frame.add(new JButton("��ť5"));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}



//�Զ��岼��
//package text;
//import java.awt.BorderLayout;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//
//public class text03 {
//       public static void main(String[] args){
//    	    JFrame frame = new JFrame();
//			frame.setSize(500, 500);
//			frame.setLayout(null);  //ȡ��Ĭ�ϲ���
//			
//			JButton btn = new JButton("�Զ��尴ť");
//			btn.setBounds(20, 60, 200, 40); //��x,y,width,height��
//			frame.add(btn);
//			frame.setVisible(true);
//			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		}		
//       }
