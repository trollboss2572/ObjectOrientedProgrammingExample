public abstract class Physical_Thing extends Stuff
{
	  double length;
	  double height;
	  double width;
	  public static double getLength();
	  	return length;
	  public static double getHeight();
	  	return height;
	  public static double getWidth();
	  	 return width;
	  public Physical_Thing(String id, String title, double length, double width, double height)
	  {
		  super(id, title);
		  this.length = length;
		  this.width = width;
		  this.height = height;
	  }
}
/**Physical_Thing has an ID and name, as with
Stuff, however Physical_Thing also has dimensions.
Any subclass of Physical_Thing should have these 
dimensions, or elements can be put into the generic
parent class Stuff should they not have these
attributes. *\