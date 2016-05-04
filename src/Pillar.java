import java.awt.Color;

/**
 * Class of Pillar piece that random color of red, green, and yellow almost of time.
 * @author Chayanin Punjakunaporn
 *
 */
public class Pillar extends Piece {
	/**
	 * Constructor
	 * New pillar at position (x,y) in map m.
	 * It color is random of red, green, and yellow.
	 */
	public Pillar(int x, int y, int c, Map m){
        super(Piece.PILLAR, m);
        this.setX(x);
        this.setY(y);
        if(c == 0) this.setColor(Color.RED);
        else if(c == 1) this.setColor(Color.GREEN);
        else if(c == 2) this.setColor(Color.YELLOW);
    }
	
	/**
	 * Constructor
	 * New pillar at position (x,y) in map m.
	 * It color c.
	 */
	public Pillar(int x, int y, Color c, Map m){
		super(Piece.PILLAR, m);
        this.setX(x);
        this.setY(y);
        this.setColor(c);
	}
	
	/**
	 * Pillar can random it color.
	 */
	public void act(){
		if(rand(1,3) == 1) {
			int colorRand = rand(0,2);
			if(colorRand == 0) setColor(Color.RED);
			else if(colorRand == 1) setColor(Color.GREEN);
			else if(colorRand == 2) setColor(Color.YELLOW);
		}
	}
}
