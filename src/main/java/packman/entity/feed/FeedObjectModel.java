package packman.entity.feed;

import java.util.ArrayList;
import java.util.List;

import packman.entity.tools.FieldGenerator;
import packman.entity.tools.FieldGenerator.Mode;

public class FeedObjectModel {

	public String message;
	public String id;
	public FromObjectModel from;
	public String picture;
	public ShareObjectModel shares;
	public ReactionsObjectModel reactions;
	public AttachmentsObjectModel attachments;
	public String promotion_status;
	public AdminCreatorObjectModel admin_creator;
	public String created_time;
	public String updated_time;
	public Boolean is_hidden;
	public String link;
	public List<ActionsObjectModel> actions;

	public FeedObjectModel(int foo) {
		setMessage();
		setId();
		setFrom();
		setPicture();
		setShares();
		setReactions(foo);
		setAttachments(foo);
		setPromotion_status();
		setAdmin_creator();
		setCreated_time();
		setUpdated_time();
		setIs_hidden();
		setLink();
		setActions(foo);

	}

	public void setMessage() {
		this.message = FieldGenerator.generateRandomString(30, Mode.ALPHA);
	}

	public void setId() {
		this.id = FieldGenerator.generateRandomString(16, Mode.NUMERIC);
	}

	public void setFrom() {
		this.from = new FromObjectModel();
	}

	public void setPicture() {
		this.picture = "https://scontent.xx.fbcdn.net/v/t1.0-0/s130x130/13407318_10153949652981284_6263462434508043163_n.jpg?oh=5d7015975535c49c81c2f099eafecf22&oe=57CF0E82";
	}

	public void setShares() {
		this.shares = new ShareObjectModel();
	}

	public void setReactions(int foo) {
		this.reactions = new ReactionsObjectModel(foo);
	}

	public void setAttachments(int foo) {
		this.attachments = new AttachmentsObjectModel(foo);
	}

	public void setPromotion_status() {
		this.promotion_status = "inactive";
	}

	public void setAdmin_creator() {
		this.admin_creator = new AdminCreatorObjectModel();
	}

	public void setCreated_time() {
		this.created_time = String.valueOf(System.nanoTime());
	}

	public void setUpdated_time() {
		this.updated_time = String.valueOf(System.nanoTime());
	}

	public void setIs_hidden() {
		this.is_hidden = false;
	}

	public void setLink() {
		this.link = "https://www.facebook.com/superga.italy/photos/a.10150344960906284.350082.89403231283/10153949652981284/?type=3";
	}

	public void setActions(int foo) {
		this.actions = new ArrayList<ActionsObjectModel>();
		for (int i = 1; i <= foo; i++) {
			actions.add(new ActionsObjectModel());
		}

	}

}
