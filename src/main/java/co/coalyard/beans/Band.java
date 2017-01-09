package co.coalyard.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "band")
public class Band {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	
	private List <String> musicians;
	
	private String bio;
	
	private String description;

	private List <BandImages> bandImages;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Band other = (Band) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Band [id=" + id + ", name=" + name + ", musicians=" + musicians + ", bio=" + bio + ", description="
				+ description + ", bandImages=" + bandImages + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getMusicians() {
		return musicians;
	}

	public void setMusicians(List<String> musicians) {
		this.musicians = musicians;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<BandImages> getBandImages() {
		return bandImages;
	}

	public void setBandImages(List<BandImages> bandImages) {
		this.bandImages = bandImages;
	}
	
	
	
}
