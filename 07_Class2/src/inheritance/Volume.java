package inheritance;

public class Volume {

	int volume = 1;

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	// 볼륨을 올리는 메서드
	void volumeUp() {
		volume++;
		
		if(volume > 15) {
			volume = 15;
		}
	}
	
	// 볼륨을 올리는 메서드
	void volumeDown() {
		volume--;
		
		if(volume < 1) {
			volume = 1;
		}
	}
		
}
