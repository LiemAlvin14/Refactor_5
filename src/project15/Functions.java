package project15;

public class Functions {

	public String allUpperCase(String sentence) {
		return sentence.toUpperCase();
	}

	public String allLowerCase(String sentence) {
		return sentence.toLowerCase();
	}

	public String capitalize(String sentence) {
		String[] splitSentence = sentence.split(" ");
		String newSentence = "";
		for (String i : splitSentence) {
			if (i.equals(splitSentence[splitSentence.length - 1]))
				newSentence += i.substring(0, 1).toUpperCase() + i.substring(1);
			else
				newSentence += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
		}
		return newSentence;
	}

	public String sentenceCase(String sentence) {
		String[] splitSentence = sentence.split("\\.\\s+");
		String newSentence = "";
		newSentence += splitSentence[0].substring(0, 1).toUpperCase()
				+ splitSentence[0].substring(1, splitSentence[0].length()) + ". ";
		newSentence += splitSentence[1].substring(0, 1).toUpperCase()
				+ splitSentence[1].substring(1, splitSentence[1].length());
		return newSentence;
	}

	public String invert(String sentence) {
		String newSentence = "";
		for (int i = 0; i < sentence.length(); i++) {
			char j = sentence.charAt(i);
			if (j >= 'a' && j <= 'z') {
				newSentence += sentence.substring(i, i + 1).toUpperCase();
			} else if (j >= 'A' && j <= 'Z') {
				newSentence += sentence.substring(i, i + 1).toLowerCase();
			} else {
				newSentence += sentence.substring(i, i + 1);
			}
		}
		return newSentence;
	}
}
