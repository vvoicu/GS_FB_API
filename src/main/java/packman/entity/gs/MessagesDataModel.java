package packman.entity.gs;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class MessagesDataModel {
	@Id
	private String _id;
	private String message;
	private ToFromDataListModel to;
	private ToFromDataModel from;
	private String created_time;
	@Field(value = "id")
	private String id;

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCreated_time() {
		return created_time;
	}
	public void setCreated_time(String created_time) {
		this.created_time = created_time;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ToFromDataListModel getTo() {
		return to;
	}
	public void setTo(ToFromDataListModel to) {
		this.to = to;
	}
	public ToFromDataModel getFrom() {
		return from;
	}
	public void setFrom(ToFromDataModel from) {
		this.from = from;
	}

}
