import javax.swing.JFrame;

public class Screen extends JFrame{
	public Screen(){
		super();
		init("Application",800,600);
	}
	private init(String title,int width,int height){
		setTitle(title);
		setSize(width,height);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
