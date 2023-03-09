package model;

public class Song implements IComponent{
	
	String songName;
	String artist;
	float speed;
	
	public Song(String songName) { // Song constructor
		this.songName = songName;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPlaybackSpeed(float speed) {
		this.speed = speed;
	}

	@Override
	public String getName() {
		return songName;
	}
	
	public String getArtist() {
		return artist;
	}

}
