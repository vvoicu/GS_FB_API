package packman.entity.MessageConversation;

public class ParticipantsPictureModel {
	
	public ParticipantsPictureDataModel data;
	
	public ParticipantsPictureModel(){
		setData();
	}

	public ParticipantsPictureDataModel getData() {
		return data;
	}
	public void setData(ParticipantsPictureDataModel data) {
		this.data = data;
	}
	
	public void setData() {
		this.data = new ParticipantsPictureDataModel();
	}
	

}
