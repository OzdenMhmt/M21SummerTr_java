package day43_Qerrors_garbagecollector;

public class GabCo01 {

	public static void main(String[] args) {
		String str = "";
		for (byte i = 0; i < 3; i--) {
			str += i;
		}
		System.out.println(str);

		// Garbage collector finalize() methodunu calistirir
		// finalize method'u silinecek objeleri isaretler ve
		// sonra Garbage collector finalized olan objeleri siler.
	}

}
