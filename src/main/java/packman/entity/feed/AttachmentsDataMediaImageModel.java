package packman.entity.feed;

import packman.entity.tools.FieldGenerator;

public class AttachmentsDataMediaImageModel {
	
	public int height;
	public String src;
	public int width;
	
	public AttachmentsDataMediaImageModel(){
		setHeight();
		setSrc();
		setWidth();
	}
	
	public void setSrc(){
		this.height=FieldGenerator.genarateRandomInt(100, 999);
	}
	public void setHeight(){
		this.src="https://scontent.xx.fbcdn.net/v/t1.0-9/s720x720/13407318_10153949652981284_6263462434508043163_n.jpg?oh=402e480727a6e500e7b72fd37731e07f&oe=57DE328F";
	}
	public void setWidth(){
		this.width=FieldGenerator.genarateRandomInt(100, 999);
	}

}
