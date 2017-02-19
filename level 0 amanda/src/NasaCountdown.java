import javax.swing.JOptionPane;

public class NasaCountdown {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("When do you want to start countdown");
		int answer2 = Integer.parseInt(answer);
		for (int i = answer2; i > -1; i--) {
			System.out.println(i);
			speak(Integer.toString(i));
		}
		speak("Blastoff!");
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
