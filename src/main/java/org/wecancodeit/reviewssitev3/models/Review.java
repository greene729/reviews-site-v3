package org.wecancodeit.reviewssitev3.models;

import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Review {
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String imageUrl;
	@Lob
	private String content;
	private String abv;
	private String brewery;
	@ManyToOne
	private Category category;
	@OneToMany(mappedBy = "review")
	private Collection<Comment> comments;

	@ManyToMany
	private Collection<Tag> tags;

	public Review() {

	}

	public Review(String title, String imageUrl, String content, String abv, String brewery, Category category,
			List<Tag> tags) {
		this.title = title;
		this.imageUrl = imageUrl;
		this.content = content;
		this.abv = abv;
		this.brewery = brewery;
		this.category = category;
		this.tags = tags;
	}

	public Review(String title, String imageUrl, String content, String abv, String brewery, Category category) {
		this.title = title;
		this.imageUrl = imageUrl;
		this.content = content;
		this.abv = abv;
		this.brewery = brewery;
		this.category = category;

	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getContent() {
		return content;
	}

	public Collection<Comment> getComments() {
		return comments;
	}

	public String getAbv() {
		return abv;
	}

	public String getBrewery() {
		return brewery;
	}

	public Category getCategory() {
		return category;
	}

	public Collection<Tag> getTags() {
		return tags;
	}
	public void addTag(Tag tag) {
		tags.add(tag);
	}
	public void removeTag(Tag tag) {
		tags.remove(tag);
	}
	

}
