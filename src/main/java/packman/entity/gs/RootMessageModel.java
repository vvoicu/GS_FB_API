package packman.entity.gs;

import java.util.List;

public class RootMessageModel {
	
	private List<MessagesDataModel> data;
	private PagingModel paging;

	public List<MessagesDataModel> getData() {
		return data;
	}

	public void setData(List<MessagesDataModel> data) {
		this.data = data;
	}

	public PagingModel getPaging() {
		return paging;
	}

	public void setPaging(PagingModel paging) {
		this.paging = paging;
	}

}
