package DominoTile;

public class DominoPlayer {
		private String nickname;
		private DominoTile[] tiles;
		private int tilesInHands;
		private DominoTable table;
		
		public void setNickname(String nickname) {
			if (nickname!=null && nickname!="") {
				
				this.nickname = nickname;
			}
		}
		
		
		public DominoPlayer(String nickname,  DominoTile[] tiles,int tilesInHands,DominoTable table) {
				this.setNickname(nickname);
				this.tiles = tiles;
				this.tilesInHands = tilesInHands;
				this.table = table;
		}
		
		public String getNickname() {
			return this.nickname;
		}
		
		public int getTilesInHand() {
			return this.tilesInHands;
		}
		
		public DominoTable getTable() {
			return this.table;
		}
		
		private int getTileIndex(DominoTile t) {
			for (int i = 0; i < tiles.length; i++) {
				if (t==tiles[i]) {
					return i;
				}
			}
			return -1;
			
		}
		public void addTileAtLeft(DominoTile t) {
			if (getTileIndex(t)!=-1) {
				
				
				this.tiles[getTileIndex(t)] = null;
				this.tilesInHands --;
				}
			}
			
		}

