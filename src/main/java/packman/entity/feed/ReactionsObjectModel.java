package packman.entity.feed;

import java.util.ArrayList;
import java.util.List;

public class ReactionsObjectModel {

	public List<ReactionsDataModel> data;
	public ReactionsPagingModel paging;
	public ReactionsSummary summary;

	public ReactionsObjectModel(int foo) {
		setData(foo);
		setPaging();
		setSummary();
	}

	public void setData(int foo) {
		this.data = new ArrayList<ReactionsDataModel>();
		for (int i = 1; i <= foo; i++) {
			data.add(new ReactionsDataModel());
		}
	}

	public void setPaging() {
		this.paging = new ReactionsPagingModel();
	}

	public void setSummary() {
		this.summary = new ReactionsSummary();
	}
}
