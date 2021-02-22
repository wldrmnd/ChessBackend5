package chess;

public class Position {

    private Character letterPos;
    private Character digitPos;

    public Position(String potentialPosition) {
        if (isCorrect(potentialPosition)) {
            letterPos = potentialPosition.charAt(0);
            digitPos = potentialPosition.charAt(1);
        } else {
            System.out.println("чел ты ввел хуйню");
        }
    }

    private boolean isCorrect(String potentialPosition) {
        if (potentialPosition.length() != 2) {
            return false;
        }
        return potentialPosition.charAt(0) >= 'A' &&
                potentialPosition.charAt(0) <= 'H' &&
                potentialPosition.charAt(1) >= '1' &&
                potentialPosition.charAt(1) <= '8';
    }

    public Character getDigitPos() {
        return digitPos;
    }

    public Character getLetterPos() {
        return letterPos;
    }
}
