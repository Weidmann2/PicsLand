import java.util.ArrayList;
import java.util.List;

public class Picture extends Model{
	private String title;
	private String infos;
	private String path;
	private List<String> keywords;
	public Picture(){
		keywords =  new ArrayList<String>();
	}
	
	public void setTitle(String t){
		this.title = t;
	}
	public String getTitle(){
		return this.title;
	}
	public void setInfos(String i){
		this.infos = i;
		setChanged();
		notifyObservers(this);
	}
	public String getInfos(){
		return this.infos;
	}
	public void setPath(String p){
		this.path = p;
	}
	public String getPath(){
		return this.path;
	}
	public void addKeywords(List<String> kwds){
		for(String keyword : kwds){
			//keywords.add(keywords);
		}
	}
}
