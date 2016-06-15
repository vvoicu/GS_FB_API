package packman.entity.gs;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class ParticipantsDataModel {

	@Id
	private String _id;
	private String name;
	@Field(value = "id")
	private String id;
	private ParticipantsPictureModel picture;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ParticipantsPictureModel getPicture() {
		return picture;
	}
	public void setPicture(ParticipantsPictureModel picture) {
		this.picture = picture;
	}
}
