package model;

import java.util.ArrayList;

public class Playlist implements IComponent{
	
	String playlistName;
	ArrayList<IComponent> playlist;
	
	public Playlist(String playlistName) { // Playlist constructor
		this.playlistName = playlistName;
		playlist = new ArrayList<>();
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPlaybackSpeed(float speed) {
		// No function
	}

	@Override
	public String getName() {
		return playlistName;
	}
	
	public void add(IComponent component) {
		playlist.add(component);
	}
	
	public void remove(IComponent component) {
		playlist.remove(component);
	}

}
