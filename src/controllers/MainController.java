import javax.swing.AbstractAction;
import java.awt.event.*;


class Maincontroller extends AbstractAction{
	private BaseScreen mainScreen;
	private Model model;
	private Picture pictureModel;
	
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
 
		if(source == mainScreen.getLanguage()){
			System.out.println("select");
			//this.model.test();
			this.pictureModel.setInfos("une nouvelle info");
			//if(this.mainScreen != null)
				this.mainScreen.updateLanguages();
		} else {
			
		}
	}
	public void setMainScreen(BaseScreen s){
		this.mainScreen = s;
	}
	public  void setModel(Model m){
		this.model = m;
	}
	public  void setPictureModel(Picture m){
		this.pictureModel = m;
	}
	public String[] getLanguageList(){
		
		if(mainScreen.getLanguage() != null && mainScreen.getLanguage().getSelectedIndex() == 1){
			String[] s = {"Francais","Anglais","Chinois"};
			return s;
		}
		else{
			 String[] s = {"French","English","Chinese"};
			 return s;
		}
	}
}

