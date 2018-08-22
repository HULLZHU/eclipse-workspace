
public class TestTV {

	public static void main(String[] args) {
		TV tv1 = new TV();
		tv1.turnOn();
		tv1.setChannel(119);
		tv1.channelDown();
		System.out.println("The channel of TV1 is : " + tv1.channel);
		
		TV tv2 = new TV(2);
		tv1.turnOn();
		System.out.println("The channel of TV2 is : " + tv2.channel);
		
	}
	/*
	public static class TV{
		int channel = 1;
		int volume = 1;
		boolean on = false;
		TV(){
		}
		TV( int newChannel){
			channel = newChannel;
		}
		void turnOn(){
			on = true;
		}
		
		void turnOff() {
			on = false;
		}
		
		void setChannel( int newChannel ) {
			if( newChannel<=120 && newChannel>= 1 && on)
				channel = newChannel;
		}
		
		void setVolume( int newVolume ) {
			if (on && newVolume<=7 && newVolume>=1 )
				volume = newVolume;
		}
		
		void channelUp() {
			if ( channel<120&&on)
				channel ++;
		}
		void channelDown() {
			if( channel>1&&on) {
				channel --;
			}
		}
		
		void volumeUp() {
			if ( volume<7&&on)
				volume++;
		}
		
		void volumeDown() {
			if ( volume > 1&&on)
				volume--;
		}
		
		
	}
	
*/
}
	

