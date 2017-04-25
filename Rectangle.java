//import myClass.Point;
public class Rectangle{
	public int x;
	public int y;
	public int width;
	public int height;
	public Rectangle(int x, int y, int width, int height) throws IllegalArgumentException{ 
		this.x= x;
		this.y=y;
		this.width= width;
		this.height= height;
	}
	public Rectangle( Point p, int width, int height)  throws IllegalArgumentException{ 
		this.x= p.getX();
		this.y= p.getY();
		this.width= width;
		this.height= height;
	}	
	public int getHeight(){
		return this.height; 
	}
	public int getWidth(){
		return this.width;
	}
	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	public boolean contains(int x, int y){
		int x_true=0;
		int y_true=0;
		if (x<(getX()+getWidth()) && x> getX()){
			x_true++;
		}
		if (y<(getY()+getHeight()) && y> getY()){
			y_true++;
		}
		if ((x_true+y_true)==2){
			return true;
		}
		return false;
	}
	public boolean contains(Point p){
		int x_true=0;
		int y_true=0;
		if (p.getX()<(getX()+getWidth()) && p.getX()> getX()){
			x_true++;
		}
		if (p.getY()<(getY()+getHeight()) && p.getY()> getY()){
			y_true++;
		}
		if ((x_true+y_true)==2){
			return true;
		}
		return false;
	}
	public Rectangle union(Rectangle rect){
		int minX= Math.min(getX(),rect.getX());
		int maxX= Math.max(getX(),rect.getX());
		int minY= Math.min(getY(),rect.getY());
		int maxY= Math.max(getY(),rect.getY());
		return new Rectangle(minX, minY, maxX- minX + rect.getWidth(), maxY- minY+ rect.getHeight());
	}
	public Rectangle intersection(Rectangle rect){
		int maxX= Math.max(getX(),rect.getX());
		int maxY= Math.max(getY(),rect.getY());
		int minWidth = Math.min(getX() + getWidth(), rect.getX() + rect.getWidth());
        int minHeight = Math.min(getY() + getHeight(), rect.getY() + rect.getHeight());
		int width;
		int height;
		//int width = Math.max(0, minWidth - maxX);
        //int height = Math.max(0, minHeight - maxY);
        if ((minWidth-maxX)>=0 &&(minHeight-maxY)>=0 ){
			width= minWidth-maxX;
			height= minHeight-maxY;
		}
		else{
			width= 0;
			height= 0;
		} 
		return new Rectangle(maxX, maxY, width, height);
	}
	public String toString(){
		String convert= "Rectangle[x="+getX()+",y="+getY()+",width="+getWidth()+",height="+getHeight()+"]";
		return convert;
	}

}