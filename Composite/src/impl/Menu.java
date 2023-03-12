package impl;

import java.util.ArrayList;
import java.util.Scanner;

import model.Playlist;
import model.Song;

public class Menu {
	
	private Scan scan;
	private Scanner scan1;
	MenuType optm;
	MenuType2 optp;
	MenuType3 opts;
	MenuType4 opte;
	
	static ArrayList<Song> songs;
	static Playlist playlist;
	
	public enum MenuType {
		SONG, PLAYLIST, EXIT
	};

	public enum MenuType2 {
		CREATE, EDIT, SHOW, RETURN
	};

	public enum MenuType3 {
		CREATE, DELETE, SHOW, RETURN
	};
	
	public enum MenuType4 {
		ADD, REMOVE, CHANGE, RETURN
	};
	
	public boolean playlistExists() {
		return playlist != null;
	}
	
	public void newSong(Song song) {
		songs.add(song);
	}
	
	public void deleteSong(Song song) {
		songs.remove(song);
	}
	
	public int songExists(String name) {
		if(!songs.isEmpty()) {
			for(Song song: songs) {
				if(song.getName()==name) {
					return songs.indexOf(song);
				} else {
					return -1;
				}
			}
		}
		return -1;
	}
	
	public void showSongs() {
		if(!songs.isEmpty()) {
			int i = 1;
			for(Song song: songs) {
				System.out.println(i+ ". ------------");
				System.out.println("Name: "+song.getName());
				System.out.println("Artist: "+song.getArtist());
				System.out.println("---------------");
				i++;
			}
		}
	}
	
	public Menu() {
		scan = new Scan();	
		scan1 = new Scanner(System.in);
		songs = new ArrayList<>();
	}
	
	public void showMenu() {
		System.out.println("\n=================");
		System.out.println("=== Tu música ===");
		System.out.println("=================");
		
		while(true) {
			optm = mainMenu();
			switch(optm) {
			case SONG:
				songOption();
				break;
			case PLAYLIST:
				playlistOption();
				break;
			case EXIT:
				return;
			}			
		}
	}
	
	private void playlistOption() {
		while(true) {
			optp = playlistMenu();
			switch(optp) {
			case CREATE:
				if(!playlistExists()) {
					System.out.print("Indrocuce the name for the playlist: ");
					String name = scan1.nextLine();
					playlist = new Playlist(name);
				} else {
					System.out.println("You already have a playlist");
				}
				break;
			case EDIT:
				if(playlistExists()) {
					editOption();					
				} else {
					System.out.println("The playlist doesn't exists");
				}
				break;
			case SHOW:
				if(playlistExists()) {
					playlist.showComponents();
				} else {
					System.out.println("The playlist doesn't exists");
				}
				break;
			case RETURN:
				return;
			}
		}
	}

	private void editOption() {
		Song song;
		String name;
		// TODO Auto-generated method stub
		while(true) {
			opte = editMenu();
			switch(opte) {
			case ADD:
				showSongs();
				System.out.print("Choose a song to add to the playlist: ");
				int opt = scan1.nextInt();
				song = songs.get(opt-1);
				playlist.add(song);
				break;
			case REMOVE:
				showSongs();
				System.out.print("Choose a song to remove form the playlist: ");
				int opt2 = scan1.nextInt();
				song = songs.get(opt2-1);
				playlist.remove(song);
				break;
			case CHANGE:
				System.out.println("Enter the new name: ");
				name = scan1.nextLine();
				playlist.setName(name);
				break;
			case RETURN:
				return;
			}
		}
	}

	public void songOption() {
		while(true) {
			opts = songMenu();
			switch(opts) {
			case CREATE:
				System.out.print("Song name: ");
				String name = scan1.nextLine();
				System.out.print("Song artist: ");
				String artist = scan1.nextLine();
				newSong(new Song(name, artist));
				break;
			case DELETE:
				showSongs();
				System.out.print("Choose a song to delete");
				int opt2 = scan1.nextInt();
				deleteSong(songs.get(opt2-1));
				break;
			case SHOW:
				showSongs();
				break;
			case RETURN:
				return;
			}
		}
	}
	
	public MenuType mainMenu() {
		int opt;
		
		System.out.println("\n--- Main Menu ---");
		System.out.println("1. Song menu");
		System.out.println("2. Playlist menu");
		System.out.println("3. Exit");
		
		opt = scan.getOptionInRange(1, 3);
		
		MenuType[] menu = MenuType.values();
		return menu[opt - 1];
	}
	
	public MenuType2 playlistMenu() {
		int opt;
		
		System.out.println("\n*** Playlist ***");
		System.out.println("1. Create Playlist");
		System.out.println("2. Edit Playlist");
		System.out.println("3. Show Playlist");
		System.out.println("4. Return");
		
		opt = scan.getOptionInRange(1, 4);
		
		MenuType2[] menu = MenuType2.values();
		return menu[opt - 1];
	}
	
	public MenuType3 songMenu() {
		int opt;

		System.out.println("\n*** Song ***");
		System.out.println("1. Create Song");
		System.out.println("2. Delete Song");
		System.out.println("3. Show Songs list");
		System.out.println("4. Return");
		
		opt = scan.getOptionInRange(1, 4);
		
		MenuType3[] menu = MenuType3.values();
		return menu[opt - 1];
	}
	
	public MenuType4 editMenu() {
		int opt;

		System.out.println("\n*** Edit Playlis ***");
		System.out.println("1. Add song");
		System.out.println("2. Remove song");
		System.out.println("3. Change name");
		System.out.println("4. Return");
		
		opt = scan.getOptionInRange(1, 4);
		
		MenuType4[] menu = MenuType4.values();
		return menu[opt - 1];
	}

}
