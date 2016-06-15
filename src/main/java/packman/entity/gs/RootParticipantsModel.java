package packman.entity.gs;

import java.util.List;

public class RootParticipantsModel {
	
	private List<ParticipantsDataModel> data;
	private ParticipantsPagingModel paging;
	public List<ParticipantsDataModel> getData() {
		return data;
	}
	public void setData(List<ParticipantsDataModel> data) {
		this.data = data;
	}
	public ParticipantsPagingModel getPaging() {
		return paging;
	}
	public void setPaging(ParticipantsPagingModel paging) {
		this.paging = paging;
	}
	
}
