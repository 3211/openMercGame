package openEngine;
import java.util.Random;
public class OpCrypter {
	private static final int lock = 32;
	public static String decryptString(String cryptoString){
		cryptoString = cryptoString.replaceAll("[a-zA-z]", "&");
		String[] crdata = cryptoString.split("&");
		String decryptedString = "";
		int key=0;
		for(String line : crdata){
			if(line.startsWith("@")){
				key = Integer.parseInt(line.substring(1))/lock;
			} else {
				decryptedString+=getCharTable()[(Integer.parseInt(line)/key)];
			}
		}
			return decryptedString.trim();
	}
	public static String cryptString(String dataToString){
		Random r = new Random();
		int key = r.nextInt(9999)+99;
		String[] crdata = dataToString.split("");
		String cryptData = "@"+(key*lock);
		for(String c : crdata){
			boolean searching = true;
			int i = 0;
			while(searching){
				if(i<getCharTable().length){
					if(i<getCharTable().length){
						if(c.equals(getCharTable()[i])){
							int ra = r.nextInt(6);
							if(ra>=2){
								cryptData+=getAlphaUpperCase()[r.nextInt(getAlphaUpperCase().length)]+(i*key);
							} else {
								cryptData+=getAlphaLowerCase()[r.nextInt(getAlphaLowerCase().length)]+(i*key);
							}
							searching = false;
					} else {
						i++;
					}
				} else {
					searching = false;
				}
			}
			}
		}
		return cryptData.trim();
	}
	public static String[] getAlpha(){
		String[] alpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
		return alpha;
	}
	public static String[] getAlphaLowerCase(){
		String[] alpha = "abcdefghijklmnopqrstuvwxyz".split("");
		return alpha;
	}
	public static String[] getAlphaUpperCase(){
		String[] alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
		return alpha;
	}
	public static String[] getCharTable(){
		String[] charTable = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWKYZ0123456789.,?!:;`'\"~@#$%^&*+-=_|\\/[]<>{}()\n ".split("");
		return charTable;
	}
}