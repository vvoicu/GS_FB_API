package packman.entity.feed;

public class ReactionsPagingModel {

	public ReactionsPagingCursorsModel cursors;
	public String next;

	public ReactionsPagingModel() {
		setCursors();
		setNext();
	}

	public void setCursors() {
		this.cursors = new ReactionsPagingCursorsModel();
	}

	public void setNext() {
		this.next = "https://graph.facebook.com/v2.6/89403231283_10153949652981284/reactions?access_token=CAALyDYhpkjYBAFp8MeVZA6eXDiSFTkImCAfCQbxJUG8X8LACMc7MRmHl1rbBlQLjqO5Khlrnv1sdVDBOaRh31qJMHYeHk7xhltUabZCCIf7ji5WxbMHwhLSMZAhihPIrB8GJPZBgxusX9ZBcT0Do1nyJJ5xO1qtNfAZBgfT2hLBpHNUmg2nTkjobDa4VhZCMvMqLkaZCWZB9NLAZDZD&pretty=1&fields=id\u00252Cname\u00252Ctype&summary=true&limit=25&after=TVRZAeU1UWXdORGt3TXpveE5EWTJORGswT0RjM09qSTFOREE1TmpFMk1UTT0ZD";
	}

}
