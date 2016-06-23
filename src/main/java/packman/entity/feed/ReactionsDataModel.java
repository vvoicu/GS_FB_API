package packman.entity.feed;

import packman.entity.tools.FieldGenerator;
import packman.entity.tools.FieldGenerator.Mode;

public class ReactionsDataModel {

	public String id;
	public String name;
	public String type;

	public ReactionsDataModel() {
		setId();
		setName();
		setType();
	}

	public void setId() {
		this.id = FieldGenerator.generateRandomString(17, Mode.NUMERIC);
	}

	public void setName() {
		this.name = FieldGenerator.generateRandomString(15, Mode.ALPHA);
	}

	public void setType() {
		this.type = "Like";
	}

}
