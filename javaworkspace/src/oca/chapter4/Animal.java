package oca.chapter4;

public class Animal{
	private String species;
	private boolean canHop;
	private boolean canSwim;

	public Animal(String speices, boolean canHop, boolean canSwim){
		this.species = speices;
		this.canHop = canHop;
		this.canSwim = canSwim;
	}

		public boolean canHop(){ return canHop; }
		public boolean canSwim() { return canSwim; }
		public String toString() { return species; }
}


