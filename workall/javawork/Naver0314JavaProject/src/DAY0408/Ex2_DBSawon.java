package DAY0408;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import db.common.DbConnect;

public class Ex2_DBSawon extends JFrame{
	DbConnect db=new DbConnect();
	JTextField tfName,tfScore;
	JComboBox<String> cbGender,cbBuseo,cbSearchBuseo;
	JRadioButton []rb=new JRadioButton[3];
	JButton btnAdd,btnDel;
	DefaultTableModel tableModel;
	JTable table;

	int buseoIndex=1;//부서전체
	int genderIndex=1;//성별전체	
	
	public Ex2_DBSawon(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		this.setLocation(100, 100);//시작위치
		this.setSize(500, 400);//창크기
		this.getContentPane().setBackground(new Color(93, 199, 187));//배경색 변경
		//this.getContentPane().setBackground(Color.yellow);//배경색 변경
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프레임 종료
		this.initDesign();//각종 컴포넌트 생성
		this.setVisible(true);
	}
	
	public void writeSawon()
	{
		
	}
	public void initDesign()
	{
		JPanel p1=new JPanel();
		p1.add(new JLabel("이름"));
		tfName=new JTextField(4);
		p1.add(tfName);
		
		p1.add(new JLabel("점수"));
		tfScore=new JTextField(4);
		p1.add(tfScore);
		
		String []g= {"남자","여자"};
		cbGender=new JComboBox<String>(g);
		
		p1.add(new JLabel("성별"));
		p1.add(cbGender);
		
		String []b= {"홍보부","인사부","교육부"};
		cbBuseo=new JComboBox<String>(b);
		
		p1.add(new JLabel("부서"));
		p1.add(cbBuseo);
		
		this.add("North",p1);
		//////////////////////////////////
		/// 중간은 테이블 ////////////////////
		String []title= {"시퀀스","사원명","점수","성별","부서명"};
		tableModel=new DefaultTableModel(title, 0);
		table=new JTable(tableModel);
		this.add("Center",new JScrollPane(table));
		
		///////////////////////////////////
		JPanel p2=new JPanel();
		btnAdd=new JButton("추가");
		btnDel=new JButton("삭제");
		p2.add(btnAdd);
		p2.add(btnDel);
		
		String []b2= {"전체부서","홍보부","교육부","인사부"};
		cbSearchBuseo=new JComboBox<String>(b2);
		p2.add(cbSearchBuseo);
		
		//RadioButton
		ButtonGroup bg=new ButtonGroup();
		String []g2= {"전체","남자","여자"};
		for(int i=0;i<rb.length;i++)
		{
			rb[i]=new JRadioButton(g2[i], i==0?true:false);
			bg.add(rb[i]);
			p2.add(rb[i]);
			
			final int idx=i;
			//라디오버튼 이벤트
			rb[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					genderIndex=idx+1;
					writeSawon();
				}
			});
		}
		
		this.add("South",p2);
		
		//부서검색 이벤트
		cbSearchBuseo.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				buseoIndex=cbSearchBuseo.getSelectedIndex()+1;
				writeSawon();
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex2_DBSawon a=new Ex2_DBSawon("사원관리");
	}

}