package packman.entity.feed;

public class AttachmentsDataMediaModel {
	
	public AttachmentsDataMediaImageModel image;
	
	public AttachmentsDataMediaModel(){
		setImage();
	}
	
	public void setImage(){
		this.image=new AttachmentsDataMediaImageModel();
	}

}
