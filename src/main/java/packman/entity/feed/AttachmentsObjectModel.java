package packman.entity.feed;

import java.util.ArrayList;
import java.util.List;

public class AttachmentsObjectModel {

	public List<AttachmentsDataModel> data;

	public AttachmentsObjectModel(int foo) {
		setData(foo);
	}

	public void setData(int foo) {
		this.data = new ArrayList<AttachmentsDataModel>();
		for (int i = 1; i <= foo; i++) {
			data.add(new AttachmentsDataModel());
		}
	}

}
