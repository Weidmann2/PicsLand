import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import javax.swing.border.EmptyBorder;
import java.util.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Dimension;

public class BaseScreen extends Screen implements Observer{
	private JPanel header;
	private JPanel footer;
	private JPanel right;
	private JPanel mainer;
	private JPanel container;
	private JTextField search;
	private JComboBox language;
	private JButton[] header_actions;
	private Color baseColor;
	
	private Maincontroller controller;
	public BaseScreen(){
		super();
		this.baseColor = new Color(10,90,100);
		setTitle("Pics'Land");
		
	}
	public JComboBox getLanguage(){
		return this.language;
	}
	public BaseScreen(String title,int width,int height,boolean is_visible){
		super(title,width,height,is_visible);
		this.baseColor = new Color(10,90,100);
	}
	public void init_header(){
		header = new JPanel();
		JPanel content = new JPanel(new GridLayout(2,7));
		content.setSize(900,400);
		search = new JTextField("Rechercher");
		header.add(search);
		header_actions = new JButton[3];
		header_actions[0] = new JButton("Mosaique");
		header_actions[1] = new JButton("Dossier");
		header_actions[2] = new JButton("Mots clés");
		header.setBackground(this.baseColor);
		content.setBackground(this.baseColor);
		
		JPanel action_panel = new JPanel();
		action_panel.setOpaque(false);
		for(int i = 0;i < 3 ; i +=1){
			header.add(header_actions[i]);
		}
		content.setBorder(new EmptyBorder(30, 0, 30, 0) );
		header.add(content);
	}
	public void init_footer(){
		footer = new JPanel();
		JPanel content = new JPanel();
		footer.setBackground(this.baseColor);
		content.setBackground(this.baseColor);
		content.setBorder(new EmptyBorder(0, 0, 10, 0) );
		footer.add(content);
	}
	public void init_right(){
		right = new JPanel();
		JPanel content = new JPanel();
		right.setBackground(new Color(255,255,255));
		content.setBackground(new Color(255,255,255));
		content.setBorder(new EmptyBorder(0,300, 0, 0) );
		right.add(content);
	}
	public void setController(Maincontroller c){
		controller = c;
		controller.setMainScreen(this);
	}
	public void init(){
		container = new JPanel(new BorderLayout());
		
		mainer = new JPanel();
		init_header();
		init_footer();
		init_right();
		
		updateLanguages();
		language.addActionListener(controller);
		//language.setSelectedIndex(1);
		header.add(language);
		container.add(header, BorderLayout.NORTH);
		container.add(footer, BorderLayout.SOUTH);
		container.add(right, BorderLayout.EAST);
		container.add(mainer);
		/*
		browser = new JButton("Parcourir");
		Maincontroller controller = new Maincontroller();
		browser.addActionListener(controller);
		panel = new JPanel();
		panel.add(browser);
		
		
		*/
		setContentPane(container);
		refresh();
	}
	public void updateLanguages(){
		String[] s = controller.getLanguageList();
		language = new JComboBox(s);
		//language.addActionListener(controller);
		//language.setSelectedIndex(1);
		refresh();
		
	}
	public void update(Observable o, Object data){
		if(o instanceof Picture){
			JLabel l = new JLabel(((Picture)data).getInfos());
			mainer.add(l);
			refresh();
		}
		else
		this.header_actions[1].setLabel((String)data);
	}
}
