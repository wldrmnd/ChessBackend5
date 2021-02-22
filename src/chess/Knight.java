package chess;

public class Knight {

    private Position startPos;
    private KnightEngine engine;

    public Knight(Position startPos) {
        this.startPos = startPos;
        this.engine = new KnightEngine();
    }

    public boolean makeTurn(Position endPos) {
        if (engine.isPathCorrect(startPos, endPos)) {
            startPos = endPos;
            return true;
        } else {
            System.out.println("сори, ходить не могу, неправильный путь, остался на месте");
        }
        return false;
    }
}
