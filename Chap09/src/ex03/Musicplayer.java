package ex03;

public class Musicplayer {
	public static void main(String[] args) {
		MediaPlayer player = new MP3player();
		player.play();
		
		player = new WAVplayer();
		player.play();

		player = new FLACplayer();
		player.play();
	}
}
