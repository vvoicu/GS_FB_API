package packman.entity.feed;

import packman.entity.tools.FieldGenerator;
import packman.entity.tools.FieldGenerator.Mode;

public class AdminCreatorObjectModel {
	
	public String name;
	public String id;
	
	public AdminCreatorObjectModel(){
		setName();
		setId();
	}

	private void setName() {
		this.name=FieldGenerator.generateRandomString(16, Mode.ALPHA);
	}
	private void setId() {
		this.id=FieldGenerator.generateRandomString(17, Mode.NUMERIC);
	}
	

}
