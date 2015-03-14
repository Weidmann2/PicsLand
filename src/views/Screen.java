import javax.swing.JFrame;

public class Screen extends JFrame{
	public Screen(){
		super();
		init("Application",1200,700,true);
	}
	public Screen(String title,int width,int height,boolean is_visible){
		super();
		init(title,width,height,is_visible);
	}
	private void init(String title,int width,int height,boolean is_visible){
		setTitle(title);
		setSize(width,height);
		setLocationRelativeTo(null);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(is_visible);
	}
	public void refresh(){
		setVisible(true);
	}
}
