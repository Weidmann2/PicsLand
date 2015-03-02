import javax.swing.JFrame;

public class PicScreen extends Screen{
	public Screen(){
		super();
		init("Pics'Land",1200,950,true);
	}
	public Screen(String title,int width,int height,boolean is_visible){
		super();
		init(title,width,height,is_visible);
	}
	private void init(String title,int width,int height,boolean is_visible){
		setTitle(title);
		setSize(width,height);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(is_visible);
	}
}
