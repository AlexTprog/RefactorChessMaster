import javax.swing.*;

public class Utils {

    static ImageIcon getImageIconByType(int colorPiece, String whitePiece, String blackPiece, String defaultPiece) {
        switch (colorPiece) {
            case ChessGamePiece.WHITE:
                return new ImageIcon(Utils.class.getResource(whitePiece));
            case ChessGamePiece.BLACK:
                return new ImageIcon(Utils.class.getResource(blackPiece));
            default:
                return new ImageIcon(Utils.class.getResource(defaultPiece));
        }
    }
}
