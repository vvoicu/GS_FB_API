package packman.entity.feed;

import packman.entity.tools.FieldGenerator;

public class ReactionsSummary {

	public int total_count;
	public String viewer_reaction;

	public ReactionsSummary() {
		setTotal_count();
		setViewer_reaction();
	}

	public void setTotal_count() {
		this.total_count = FieldGenerator.genarateRandomInt(1, 999);
	}

	public void setViewer_reaction() {
		this.viewer_reaction = "NONE";
	}
}
