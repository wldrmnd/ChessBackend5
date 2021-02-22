package chess;

public class KnightEngine {

    public boolean isPathCorrect(Position startPos, Position endPos) {
        int letterDelta = Math.abs(endPos.getLetterPos() - startPos.getLetterPos());
        if (letterDelta == 1) {
            int digitDeltas = Math.abs(endPos.getDigitPos() - startPos.getDigitPos());
            if (digitDeltas == 2) {
                return true;
            }
        }
        if (letterDelta == 2) {
            int digitDeltas = Math.abs(endPos.getDigitPos() - startPos.getDigitPos());
            if (digitDeltas == 1) {
                return true;
            }
        }

        return false;
    }
}
