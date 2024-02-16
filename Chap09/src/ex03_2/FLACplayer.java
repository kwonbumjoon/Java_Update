package ex03_2;

public class FLACplayer implements MediaPlayer {
	private String fileName;
	private double runTime;
	private double fileSize;
	private int state;	//-1:정지, 0:일시정지, 1:실행
	@Override
	public void play() {
		System.out.println("FLAC 파일 재생 중...");
	}
	@Override
	public void pause() {
		state = 0;
		System.out.println("일시 정지 중...");
	}

	@Override
	public void stop() {
		state = -1;
	}


	@Override
	public void loadFile(String file) {
		System.out.println(file + "이 저장됨");
		System.out.println("loading");
	}
}
