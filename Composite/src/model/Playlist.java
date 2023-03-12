package model;

import java.util.ArrayList;

public class Playlist implements IComponent{
	
	String playlistName;
	ArrayList<IComponent> playlist;
	
	public Playlist(String playlistName) { // Playlist constructor
		setName(playlistName);
		playlist = new ArrayList<>();
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
	}

	@Override
	public void setPlaybackSpeed(float speed) {
		// No implementation
	}

	@Override
	public String getName() {
		return playlistName;
	}
	
	public void add(IComponent component) {
		playlist.add(component);
	}
	
	public void remove(IComponent component) {
		if(componentExists(component)) {
			playlist.remove(component);
		} else {
			System.out.println("The song is not in the playlist");
		}
	}
	
	public boolean componentExists(IComponent component) {
		return playlist.contains(component);
	}
	
	public void setName(String playlistName) {
		this.playlistName = playlistName;
	}
	
	public void showComponents() {
		int i = 1;
		for (IComponent component: playlist) {
			System.out.println(i+ "------------");
			System.out.println("Name: "+component.getName());
			System.out.println("Artist: "+((Song)component).getArtist());
			i++;
		}
	}

}
