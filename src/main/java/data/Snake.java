package data;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Snake {
	private String name, gender, imagePath, tempRack, tempBin, homeRack, homeBin, location, visibleGenetics,
			hetGenetics, fParentGenetics, mParentGenetics;
	private List<BreederAction> actions;

	public Snake() {
		this.name = "Snake" + (int) (Math.random() * 10000.0);

	}

	public Snake(String name, String gender, String homeRack, String homeBin, String visibleGenetics,
			String hetGenetics) {
		this.name = name;
		this.gender = gender;
		this.homeRack = homeRack;
		this.homeBin = homeBin;
		this.location = homeRack+ ":" + homeBin ;
		this.visibleGenetics = visibleGenetics;
		this.hetGenetics = hetGenetics;
	}

	public Snake(String name, String gender, String visibleGenetics, String hetGenetics) {
		this.name = name;
		this.gender = gender;
		this.visibleGenetics = visibleGenetics;
		this.hetGenetics = hetGenetics;
		this.homeRack = "0";
		this.homeBin = "0";
		this.location = homeRack+ ":" + homeBin ;
	}

	public Snake(String name) {
		this.name = name;
	}

	public Snake(String name, String gender, String imagePath, String tempRack, String tempBin, String homeRack,
			String homeBin, String visibleGenetics, String hetGenetics, String fParentGenetics,
			String mParentGenetics, List<BreederAction> actions) {
		super();
		this.name = name;
		this.gender = gender;
		this.imagePath = imagePath;
		this.tempRack = tempRack;
		this.tempBin = tempBin;
		this.homeRack = homeRack;
		this.homeBin = homeBin;
		this.location = homeRack+ ":" + homeBin ;
		this.visibleGenetics = visibleGenetics;
		this.hetGenetics = hetGenetics;
		this.fParentGenetics = fParentGenetics;
		this.mParentGenetics = mParentGenetics;
		this.actions = actions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getTempRack() {
		return tempRack;
	}

	public String getTempBin() {
		return tempBin;
	}

	
	public String getHomeRack() {
		return homeRack;
	}

	public void setHomeRack(String homeRack) {
		this.homeRack = homeRack;
	}

	public String getHomeBin() {
		return homeBin;
	}

	public void setHomeBin(String homeBin) {
		this.homeBin = homeBin;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getVisibleGenetics() {
		return visibleGenetics;
	}

	public void setVisibleGenetics(String visibleGenetics) {
		this.visibleGenetics = visibleGenetics;
	}

	public String getHetGenetics() {
		return hetGenetics;
	}

	public void setHetGenetics(String hetGenetics) {
		this.hetGenetics = hetGenetics;
	}

	public String getfParentGenetics() {
		return fParentGenetics;
	}

	public void setfParentGenetics(String fParentGenetics) {
		this.fParentGenetics = fParentGenetics;
	}

	public String getmParentGenetics() {
		return mParentGenetics;
	}

	public void setmParentGenetics(String mParentGenetics) {
		this.mParentGenetics = mParentGenetics;
	}

	public List<BreederAction> getActions() {
		return actions;
	}

	public void setActions(List<BreederAction> actions) {
		this.actions = actions;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Snake,").append(name).append(",").append("gender,").append(imagePath).append(",")
				.append(tempRack).append(",").append(tempBin).append(",").append(homeRack).append(",").append(homeBin)
				.append(",").append(location).append(",").append(visibleGenetics).append(",").append(hetGenetics)
				.append(",").append(fParentGenetics).append(",").append(mParentGenetics).append(",").append(actions);
		return builder.toString();

	}

	public void setTempRack(String tempRack) {
		this.tempRack = tempRack;
	}

	public void setTempBin(String tempBin) {
		this.tempBin = tempBin;
	}

}