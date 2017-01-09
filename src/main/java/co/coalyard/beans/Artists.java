package co.coalyard.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "artists")
public class Artists {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String firstName;
	
	private String lastName;
	
	private String artistName;
	
	private String website;
	
	private String facebook;
	
	private String twitter;
	
	private String instagram;
	
	private String bio;
	
	private String description;
	
	@OneToMany(mappedBy="artists", cascade = CascadeType.ALL)
	private List <ArtWork> artWork;
	
	@OneToMany(mappedBy="artists", cascade = CascadeType.ALL)
	private List <ArtistImage> artistImage;
	
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
		Artists other = (Artists) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Artists [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", artistName="
				+ artistName + ", website=" + website + ", facebook=" + facebook + ", twitter=" + twitter
				+ ", instagram=" + instagram + ", bio=" + bio + ", description=" + description + ", artWork=" + artWork
				+ ", artistImage=" + artistImage + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
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

	public List<ArtWork> getArtWork() {
		return artWork;
	}

	public void setArtWork(List<ArtWork> artWork) {
		this.artWork = artWork;
	}

	public List<ArtistImage> getArtistImage() {
		return artistImage;
	}

	public void setArtistImage(List<ArtistImage> artistImage) {
		this.artistImage = artistImage;
	}
	
	
	
}
