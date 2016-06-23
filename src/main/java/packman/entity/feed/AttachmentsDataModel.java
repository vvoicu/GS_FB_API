package packman.entity.feed;

import packman.entity.tools.FieldGenerator;
import packman.entity.tools.FieldGenerator.Mode;

public class AttachmentsDataModel {
	
	public String description;
	public AttachmentsDataMediaModel media;
	public AttachmentsDataTargetModel target;
	public String title;
	public String type;
	public String url;
	
	
	public AttachmentsDataModel(){
		setDescription();
		setMedia();
		setTarget();
		setTitle();
		setType();
		serUrl();
	}


	private void setDescription() {
		this.description=FieldGenerator.generateRandomString(100, Mode.ALPHA);
	}
	private void setMedia() {
		this.media=new AttachmentsDataMediaModel() ;
	}
	private void setTarget() {
		this.target=new AttachmentsDataTargetModel() ;
	}
	private void setTitle() {
		this.title=FieldGenerator.generateRandomString(16, Mode.ALPHA);
	}
	private void setType() {
		this.type=FieldGenerator.generateRandomString(8, Mode.ALPHA);
	}
	private void serUrl() {
		this.url="https://www.facebook.com/superga.italy/photos/a.10150344960906284.350082.89403231283/10153949652981284/?type=3";
	}

}
