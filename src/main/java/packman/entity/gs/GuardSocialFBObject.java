package packman.entity.gs;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "guardSocial")
public class GuardSocialFBObject implements Serializable {

	private static final long serialVersionUID = -9132877441714868745L;

	@Id
	private String _id;
	private String message_count;
	private String updateTime;
	@Field(value = "id")
	private String id;
	private RootMessageModel messages;
	private RootParticipantsModel participants;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMessage_count() {
		return message_count;
	}
	public void setMessage_count(String message_count) {
		this.message_count = message_count;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public RootMessageModel getMessages() {
		return messages;
	}
	public void setMessages(RootMessageModel messages) {
		this.messages = messages;
	}
//	public String get_id() {
//		return _id;
//	}
//	public void set_id(String _id) {
//		this._id = _id;
//	}
	public RootParticipantsModel getParticipants() {
		return participants;
	}
	public void setParticipants(RootParticipantsModel participants) {
		this.participants = participants;
	}
}
