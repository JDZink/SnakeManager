package data;

import java.time.LocalDate;
import org.springframework.stereotype.Component;

@Component
public class BreederAction {
	private LocalDate date;
	private String snakeNAme, feed, shed, weight, symptoms, paired, locked, notes, ovulating, laidEggs;
	
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getSnakeNAme() {
		return snakeNAme;
	}
	public void setSnakeNAme(String snakeNAme) {
		this.snakeNAme = snakeNAme;
	}
	public String getFeed() {
		return feed;
	}
	public void setFeed(String feed) {
		this.feed = feed;
	}
	public String getShed() {
		return shed;
	}
	public void setShed(String shed) {
		this.shed = shed;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getPaired() {
		return paired;
	}
	public void setPaired(String paired) {
		this.paired = paired;
	}
	public String getLocked() {
		return locked;
	}
	public void setLocked(String locked) {
		this.locked = locked;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getOvulating() {
		return ovulating;
	}
	public void setOvulating(String ovulating) {
		this.ovulating = ovulating;
	}
	public String getLaidEggs() {
		return laidEggs;
	}
	public void setLaidEggs(String laidEggs) {
		this.laidEggs = laidEggs;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("//&//&").append(date).append("//&//&").append(snakeNAme).append("//&//&").append(feed).append("//&//&")
				.append(shed).append("//&//&").append(weight).append("//&//&").append(symptoms).append("//&//&").append(paired)
				.append("//&//&").append(locked).append("//&//&").append(notes).append("//&//&").append(ovulating).append("//&//&")
				.append(laidEggs);
		return builder.toString();
	}
	public BreederAction(LocalDate date, String snakeNAme, String feed, String shed, String weight, String symptoms,
			String paired, String locked, String notes, String ovulating, String laidEggs) {
		super();
		this.date = date;
		this.snakeNAme = snakeNAme;
		this.feed = feed;
		this.shed = shed;
		this.weight = weight;
		this.symptoms = symptoms;
		this.paired = paired;
		this.locked = locked;
		this.notes = notes;
		this.ovulating = ovulating;
		this.laidEggs = laidEggs;
	}
	
	public BreederAction(){
		this.date = LocalDate.now();
	}

}
