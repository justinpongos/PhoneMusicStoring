package Smartphone;

public class SmartPhone {
	private String brand;
	private int memorycapacity;
	private SongUpgrade[] songLibrary;

	public SmartPhone(String brand, int memory) {
		this.brand = "pear";
		this.memorycapacity = 128;
		this.songLibrary = new SongUpgrade[4];
		songLibrary[0] = new SongUpgrade("5:12", "Be Quiet and Drive", "Deftones", 312);
		songLibrary[1] = new SongUpgrade("4:10", "Hole in The Earth", "Deftones", 250);
		songLibrary[2] = new SongUpgrade("2:52", "Friendship", "Carwash", 172);
		songLibrary[3] = new SongUpgrade("2:16", "Christmas Kids", "Roar", 136);
	}//end constructor
	
	public int totalPlayTime() {
		int totalSeconds = 0;
		for (int index = 0; index < songLibrary.length; index++) {
			totalSeconds = songLibrary[3];
			index++;
		}//end for loop
		System.out.println(totalSeconds);
		return totalSeconds;
	}//end method totalPlayTime()
}//end class 
