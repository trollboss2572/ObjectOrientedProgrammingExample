public abstract class Stuff
{
	String id;
	String name;
	public Stuff(String id, String name)
	{
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof this.getClass()))
			return false;
		Stuff other = (Stuff) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return name;
}
}
/**
All children of things must have an ID within the system and the title to present to the client,
thus we can override the function of object in the parent class of all the subclasses.
This allows us to avoid repition while implementing the toString and hashCode... functions
that we desire for all the things.
*\
