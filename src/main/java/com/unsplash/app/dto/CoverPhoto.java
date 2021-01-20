package com.unsplash.app.dto;

import java.util.Date;
import java.util.List;

public class CoverPhoto {

	public String id;
	public Date created_at;
	public Date updated_at;
	public Date promoted_at;
	public int width;
	public int height;
	public String color;
	public String blur_hash;
	public String description;
	public String alt_description;
	public Urls urls;
	public Links links;
	public List<Object> categories;
	public int likes;
	public boolean liked_by_user;
	public List<Object> current_user_collections;
	public Object sponsorship;
	public User user;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public Date getPromoted_at() {
		return promoted_at;
	}

	public void setPromoted_at(Date promoted_at) {
		this.promoted_at = promoted_at;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBlur_hash() {
		return blur_hash;
	}

	public void setBlur_hash(String blur_hash) {
		this.blur_hash = blur_hash;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAlt_description() {
		return alt_description;
	}

	public void setAlt_description(String alt_description) {
		this.alt_description = alt_description;
	}

	public Urls getUrls() {
		return urls;
	}

	public void setUrls(Urls urls) {
		this.urls = urls;
	}

	public Links getLinks() {
		return links;
	}

	public void setLinks(Links links) {
		this.links = links;
	}

	public List<Object> getCategories() {
		return categories;
	}

	public void setCategories(List<Object> categories) {
		this.categories = categories;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public boolean isLiked_by_user() {
		return liked_by_user;
	}

	public void setLiked_by_user(boolean liked_by_user) {
		this.liked_by_user = liked_by_user;
	}

	public List<Object> getCurrent_user_collections() {
		return current_user_collections;
	}

	public void setCurrent_user_collections(List<Object> current_user_collections) {
		this.current_user_collections = current_user_collections;
	}

	public Object getSponsorship() {
		return sponsorship;
	}

	public void setSponsorship(Object sponsorship) {
		this.sponsorship = sponsorship;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
