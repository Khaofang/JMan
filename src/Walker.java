import java.awt.Color;

/**
 * Class of Walker piece that random color of red, green and yellow at initial.
 * It can move if it doesn't collide to others.
 * @author Chayanin Punjakunaporn
 *
 */
public class Walker extends Piece {
	/**
	 * Constructor
	 * New walker at initial position (x,y) in map.
	 * It color is random of red, green and yellow.
	 */
	public Walker(int x, int y, int c, Map m){
        super(Piece.WALKER, m);
        setX(x);
        setY(y);
        if(c == 0) setColor(Color.RED);
        else if(c == 1) setColor(Color.GREEN);
        else if(c == 2) setColor(Color.YELLOW);
    }
	
	/**
	 * Constructor
	 * New walker at initial position (x,y) in map.
	 * It color is c.
	 */
	public Walker(int x, int y, Color c, Map m){
		super(Piece.WALKER, m);
        setX(x);
        setY(y);
        setColor(c);
	}
	
	/**
	 * Walker can move by checking it condition.
	 * They can't change color.
	 */
	public void act(){
		if(rand(1,3) == 1) {
			int moveRand = rand(0,3);
			int nextX = getX();
	        int nextY = getY();
	        
	        if(moveRand == 0) nextY--;
	        else if(moveRand == 1) nextY++;
	        else if(moveRand == 2) nextX--;
	        else if(moveRand == 3) nextX++;
	        
	        if(!getMap().isInGrid(nextX, nextY)) {
	        	nextX = getX();
	        	nextY = getY();
	        } else if(!this.getMap().isEmpty(nextX, nextY)) {
	        	Piece piece = getMap().pieceAt(nextX, nextY);
	        	if(piece.getType() == Piece.BLOCK || piece.getType() == Piece.JMAN || piece.getType() == Piece.PILLAR) {
	        		nextX = getX();
	        		nextY = getY();
	        	}
	        }
	        
	        if(nextX != getX() || nextY != getY())
	        	this.getMap().move(getX(), getY(), nextX, nextY);
		}
	}
}
