
public class Picsland{
	public static void main(String[] args){
		//Screen screen = new Screen();
		BaseScreen screen2 = new BaseScreen();
		Model model = new Model();
		Maincontroller controller = new Maincontroller();
		Picture pictureModel = new Picture();
		screen2.setController(controller);
		screen2.init();
		model.addObserver(screen2);
		
		pictureModel.setTitle("yo");
		pictureModel.setInfos("juste une image");
		pictureModel.setPath("images");
		pictureModel.addObserver(screen2);
		controller.setModel(model);
		controller.setPictureModel(pictureModel);
	}
}
