package com.app.geometry;

public class Point2D {
      private String xcord;
      private String ycord;
      public Point2D() {}
      
      
	public Point2D(String xcord, String ycord) {
		super();
		this.xcord = xcord;
		this.ycord = ycord;
	}
	public String getDetails() {
		 return "Point2D(" + xcord + ", " + ycord + ")";
    }
	public String getXcord() {
		return xcord;
	}
	public void setXcord(String xcord) {
		this.xcord = xcord;
	}
	public String getYcord() {
		return ycord;
	}
	public void setYcord(String ycord) {
		this.ycord = ycord;
	}


	public void isEqual() {
		
	}
	
	


	public static void main(String[] args) {
    
	}

}
