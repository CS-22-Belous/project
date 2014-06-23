package calendar;

public class Info_everyday {

	private int sleep;
	private int net;
	private int education;
	private int sport;
	
	public Info_everyday(int sleep, int net, int education, int sport) {
		this.sleep = sleep;
		this.net = net;
		this.education = education;
		this.sport = sport;		
	}
	public int getSleep() {
		return sleep;
	}
	public void setSleep(int sleep) {
		this.sleep = sleep;
	}
	public int getNet() {
		return net;
	}
	public void setNet(int net) {
		this.net = net;
	}
	public int getEducation() {
		return education;
	}
	public void setEducation(int education) {
		this.education = education;
	}
	public int getSport() {
		return sport;
	}
	public void setSport(int sport) {
		this.sport = sport;
	}
	
	public void print_day() {
		System.out.println(sleep);
		System.out.println(sport);
		System.out.println(education);
		System.out.println(net);
	}
	
	public String toString() {
		return sleep+" "+sport+" "+education+" "+net;
	}
	
};
