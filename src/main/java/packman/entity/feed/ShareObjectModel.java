package packman.entity.feed;

import packman.entity.tools.FieldGenerator;

public class ShareObjectModel {
	
	public int count;
	
	public ShareObjectModel(){
		setCount();
	}
	
	public void setCount(){
		this.count=FieldGenerator.genarateRandomInt(1, 100);
	}

}
