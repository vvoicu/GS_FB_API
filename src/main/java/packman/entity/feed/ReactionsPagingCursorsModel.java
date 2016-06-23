package packman.entity.feed;

import packman.entity.tools.FieldGenerator;
import packman.entity.tools.FieldGenerator.Mode;

public class ReactionsPagingCursorsModel {
	
	public String before;
	public String after;
	
	public ReactionsPagingCursorsModel(){
		setBefore();
		setAfter();
	}

	private void setBefore() {
		this.before = FieldGenerator.generateRandomString(62, Mode.ALPHA);
	}
	private void setAfter() {
		this.after = FieldGenerator.generateRandomString(62, Mode.ALPHA);
	}

}
