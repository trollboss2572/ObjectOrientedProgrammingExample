import java.util.HashSet;
public abstract class Collection
{
  HashSet<Stuff> Collection;
  public void addElement(Stuff s)
  {
	  if (s instanceof this.get(0).getClass())
		  Collection.add(s);
	  else
		  System.out.println("Item not added, please only add elements that are of the type of the collection");
  }
  public void removeElement(Stuff s)
  {
  	Collection.remove(s);
  }
  public boolean elementExists(Stuff s)
  {
	  if (!(s instanceof this.get(0).getClass()))
		  return false;	  
  	return Collection.contains(s);
  }
}
/** Within all subclasses, it will be useful
 * to have methods that add elements to the list,
 * remove elements from the list, and check whether
 * an element is in the list. Since those methods are
 * impemented in this super class, they will never
 * need to be implemented by the client should they 
 * choose to extend this collection class.
 * Although subclasses Library and GroceryStore have
 * methods deliver and determineBoxSize, the
 * implementations of these functions are slightly
 * different depending on the class, so we can't assume
 * similar functionality. To make this code flexible,
 * I've chosen not to include deliver and determineBoxSize
 * so that the client may extend this class for more
 * functionality, such as if they want a collection of
 * elements without dimensions or they want a database
 * that doesn't deliver those elements.
