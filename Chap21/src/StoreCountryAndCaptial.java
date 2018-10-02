import java.util.TreeMap;

public class StoreCountryAndCaptial {

	public static void main(String[] args) {
		String[] states = {"ZheJiang","Jiang Su","Fu Jian"," Chong Qing","Si Chuan"};
		String[] cities = {"Hang Zhou","Nan Jing","Fu Zhou","Chong Qing","Cheng Du"};
		
		TreeMap<String,String> map = new TreeMap<>();
		for ( int i = 0 ; i < states.length ; i ++ ) {
			map.put(states[i], cities[i]);
		}
		
		System.out.println(map.get("ZheJiang"));
		
		
		
	}
}
