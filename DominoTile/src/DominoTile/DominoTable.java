package DominoTile;

public class DominoTable {
		private TableEventListener listener;
		
		
		public void addTableEventListener(TableEventListener listener) {
			
			this.listener = listener;
		}
}
