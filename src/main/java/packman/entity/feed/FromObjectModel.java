package packman.entity.feed;

import packman.entity.tools.FieldGenerator;
import packman.entity.tools.FieldGenerator.Mode;

public class FromObjectModel {

	public String name;
	public String id;
	public String link;
	public FromPictureModel picture;

	public FromObjectModel() {
		setName();
		setId();
		setLink();
		setPicture();
	}
	
	public void setName(){
		this.name=FieldGenerator.generateRandomString(15, Mode.ALPHA);
	}
	public void setId(){
		this.id=FieldGenerator.generateRandomString(11, Mode.NUMERIC);
	}
	public void setLink(){
		this.link="https://scontent.xx.fbcdn.net/v/t1.0-0/s130x130/13407318_10153949652981284_6263462434508043163_n.jpg?oh=5d7015975535c49c81c2f099eafecf22&oe=57CF0E82";
	}
	
	public void setPicture(){
		this.picture=new FromPictureModel();
	}

}
