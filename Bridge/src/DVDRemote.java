
public class DVDRemote extends RemoteButton {

	private boolean play = true;
	public DVDRemote(EntertainmentDevice newDevice) {
		super(newDevice);
		
	}

	@Override
	public void buttonNinePressed() {
		 play = !play;
		 
		 System.out.println("DVD is Playing: " + play);
		
	}

}
