package packman.entity.feed;

public class FromPictureData {
	
	public Boolean is_silhouette; 
	public String url; 
	
	public FromPictureData(){
		setIs_silhouette();
		setUrl();
	}
	
	public void setIs_silhouette(){
		this.is_silhouette=false;
	}
	public void setUrl(){
		this.url="https://scontent.xx.fbcdn.net/v/t1.0-1/p50x50/10645104_10152627046091284_7865300406111988553_n.jpg?oh=639bd9f08baa48333efa2ae1c151ce18&oe=57D4E095";
	}

}
