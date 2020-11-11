package DominoTile;

public class DominoTile {

	private int leftSide;
	private int rightSide;
	
	public DominoTile() {
		
		this.leftSide = 0;
		this.rightSide = 0;

	}
	
	public DominoTile(int leftSide, int rightSide) {
		
		if(leftSide>=0&&leftSide<=6) {
			this.leftSide = leftSide;
		}
		
		if (rightSide>=0&&rightSide<=6) {
			this.rightSide = rightSide;
		}
		
	}
	
	
	public int leftSideGet() {
		return this.leftSide;
	}
	public int rightSideGet() {
		return this.rightSide;
	}
	
	
	public void sideSwapper() {
		int tempSwapper = this.leftSide;
		this.leftSide = this.rightSide;
		this.rightSide = tempSwapper;
		
	}
	
	
	public boolean equals(DominoTile tile) {
		
		if (tile.leftSide == this.leftSide && tile.rightSide==this.rightSide) {		
			return true;	
		}
		if (tile.leftSide==this.rightSide&&tile.rightSide==this.leftSide) {
			return true;
		}
		
		
		return false;
	}
	
	public String toString() {
		String leftSide ="";
		String rightSide=""; 
		if (this.leftSide ==1) {
			leftSide = "\n"+"\n"+"*"+"\n"+"\n";
		}
		if (this.leftSide ==2) {
			leftSide = "*"+"\n"+"\n"+"\n"+"  *";
		}
		if (this.leftSide ==3) {
			leftSide = "*  " + "\n"+" * "+"\n"+"  *";
		}
		if (this.leftSide ==4) {
			leftSide = "* *"+"\n"+"\n"+"\n"+"* *";
		}
		if (this.leftSide ==5) {
			leftSide = "* *"+"\n"+" * "+"\n"+"* *";
		}
		if (this.leftSide ==6) {
			leftSide = "* *"+"\n"+"* *"+"\n"+"* *";
		}
		
		
		//otherSideVisualization
		
		if (this.rightSide ==1) {
			rightSide = "\n"+"\n"+"*"+"\n"+"\n";
		}
		if (this.rightSide ==2) {
			rightSide = "*"+"\n"+"\n"+"\n"+"  *";
		}
		if (this.rightSide ==3) {
			rightSide = "*  " + "\n"+" * "+"\n"+"  *";
		}
		if (this.rightSide ==4) {
			rightSide = "* *"+"\n"+"\n"+"\n"+"* *";
		}
		if (this.rightSide ==5) {
			rightSide = "* *"+"\n"+" * "+"\n"+"* *";
		}
		if (this.rightSide  ==6) {
			rightSide = "* *"+"\n"+"* *"+"\n"+"* *";
		}
		
		return leftSide + rightSide;
	}
	
	
	public static void main(String[] args) {
		
		//System.out.println("* *"+"\n"+" * "+"\n"+"* *");
		
		}
}
