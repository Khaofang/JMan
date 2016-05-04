import java.awt.Color;

/** 
 * Class of Block piece that has white color.
 * This must stay at same position. JMan can't move to this for changing color.
 * @author Chayanin Punjakunaporn
 *
 */
public class Block extends Piece {
	/** 
	 * Constructor
	 * New block at position (x,y) in map m.
	 * It color is white.
	 */
	public Block(int x, int y, Map m){
		super(Piece.BLOCK, m);
		setX(x);
		setY(y);
		setColor(Color.WHITE);
	}
	
	/**
	 * Block can't move to other positions, so this method is not used.
	 */
	public void act(){
        return;
    }
}
