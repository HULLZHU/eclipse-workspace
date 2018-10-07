class PrintNum implements Runnable{
		private int lastNum = 0;
		
		public PrintNum(int lastNum) {
			this.lastNum = lastNum;
		}
		@Override
		public void run() {	
			for ( int i = 0; i < lastNum ; i ++ ) {
				System.out.print(" "+ i );
				
			}
			  
		}
	} 