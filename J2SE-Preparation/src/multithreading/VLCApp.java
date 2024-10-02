package multithreading;

class Video implements Runnable{
	
	@Override
	public void run() {
		
		for(int i=0;i<50;i++) {
			System.out.println("Video is playing");
		}
		
	}
}
class Sound implements Runnable{
	
	@Override
	public void run() {
		
		for(int i=0;i<50;i++) {
		System.out.println("Sound is playing");
	}
}
}
public class VLCApp {

	public static void main(String[] args) {
		
		Video video = new Video();
		video.run();
		
		Sound sound = new Sound();
		sound.run();
	}
}

