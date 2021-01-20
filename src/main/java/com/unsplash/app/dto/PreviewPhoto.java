package com.unsplash.app.dto;

import java.util.Date;

public class PreviewPhoto {

	public String id;
	public Date created_at;
	public Date updated_at;
	public String blur_hash;
	public Urls urls;

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

	public String getBlur_hash() {
		return blur_hash;
	}

	public void setBlur_hash(String blur_hash) {
		this.blur_hash = blur_hash;
	}

	public Urls getUrls() {
		return urls;
	}

	public void setUrls(Urls urls) {
		this.urls = urls;
	}

}
