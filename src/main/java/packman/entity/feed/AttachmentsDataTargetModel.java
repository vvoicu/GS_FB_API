package packman.entity.feed;

import packman.entity.tools.FieldGenerator;
import packman.entity.tools.FieldGenerator.Mode;

public class AttachmentsDataTargetModel {

	public String id;
	public String url;

	public AttachmentsDataTargetModel() {
		setId();
		setUrl();
	}

	public void setId() {
		this.id = FieldGenerator.generateRandomString(17, Mode.NUMERIC);
	}

	public void setUrl() {
		this.url = "https://www.facebook.com/superga.italy/photos/a.10150344960906284.350082.89403231283/10153949652981284/?type=3";
	}
}
