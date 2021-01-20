package com.unsplash.app.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Root {

	public String id;
	public String title;
	public String description;
	public Date published_at;
	public Date last_collected_at;
	public Date updated_at;
	public boolean curated;
	public boolean featured;
	public int total_photos;

	@JsonProperty("private")
	public boolean private_;

	public String share_key;
	public List<Tag> tags;
	public Links links;
	public User user;
	public CoverPhoto cover_photo;
	public List<PreviewPhoto> preview_photos;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getPublished_at() {
		return published_at;
	}

	public void setPublished_at(Date published_at) {
		this.published_at = published_at;
	}

	public Date getLast_collected_at() {
		return last_collected_at;
	}

	public void setLast_collected_at(Date last_collected_at) {
		this.last_collected_at = last_collected_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public boolean isCurated() {
		return curated;
	}

	public void setCurated(boolean curated) {
		this.curated = curated;
	}

	public boolean isFeatured() {
		return featured;
	}

	public void setFeatured(boolean featured) {
		this.featured = featured;
	}

	public int getTotal_photos() {
		return total_photos;
	}

	public void setTotal_photos(int total_photos) {
		this.total_photos = total_photos;
	}

	public boolean isPrivate_() {
		return private_;
	}

	public void setPrivate_(boolean private_) {
		this.private_ = private_;
	}

	public String getShare_key() {
		return share_key;
	}

	public void setShare_key(String share_key) {
		this.share_key = share_key;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public Links getLinks() {
		return links;
	}

	public void setLinks(Links links) {
		this.links = links;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public CoverPhoto getCover_photo() {
		return cover_photo;
	}

	public void setCover_photo(CoverPhoto cover_photo) {
		this.cover_photo = cover_photo;
	}

	public List<PreviewPhoto> getPreview_photos() {
		return preview_photos;
	}

	public void setPreview_photos(List<PreviewPhoto> preview_photos) {
		this.preview_photos = preview_photos;
	}

}
