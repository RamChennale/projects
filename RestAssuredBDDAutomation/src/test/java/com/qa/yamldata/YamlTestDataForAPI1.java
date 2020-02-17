package com.qa.yamldata;

public class YamlTestDataForAPI1 extends TestType{

	String photoId;

	public String getPhotoId() {
		return photoId;
	}

	public void setPhotoId(String photoId) {
		this.photoId = photoId;
	}

	@Override
	public String toString() {
		return "YamlTestDataForAPI1 [photoId=" + photoId + "]";
	}
}
