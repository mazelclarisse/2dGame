package hw09;

public class Room {
	
	private kirbyImposter kirbyimposter; // creatures
	private Puddle puddle; // traps
	private Nos nos; // ammunition (energy source)
	
	public Room(kirbyImposter kirbyimposter, Puddle puddle, Nos nos) {
		this.setKirbyimposter(kirbyimposter);
		this.setPuddle(puddle);
		this.setNos(nos);
	}
	
	// Setters & Getters 
	
	public kirbyImposter getKirbyimposter() {
		return kirbyimposter;
	}

	public void setKirbyimposter(kirbyImposter kirbyimposter) {
		this.kirbyimposter = kirbyimposter;
	}

	public Puddle getPuddle() {
		return puddle;
	}

	public void setPuddle(Puddle puddle) {
		this.puddle = puddle;
	}

	public Nos getNos() {
		return nos;
	}

	public void setNos(Nos nos) {
		this.nos = nos;
	}



		
	}

