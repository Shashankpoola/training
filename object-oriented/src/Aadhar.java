public class Aadhar {

	private final long uid;
	private final String retina;

	public long getUid() {
		return uid;
	}

	public String getRetina() {
		return retina;
	}

	public Aadhar(long uid, String retina) {
		this.uid = uid;
		this.retina = retina;
	}

	@Override
	public String toString() {
		return "Aadhar [uid=" + uid + ", retina=" + retina + "]";
	}

	public static void main(String[] args) {

		Aadhar a = new Aadhar(853604984168l, "yes");

		System.out.println(a);
		
		// Immutable is the state cannot be changed after the creation of object.

	}

}
