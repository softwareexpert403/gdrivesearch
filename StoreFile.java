package com.searchengine.model;

public class StoreFile {
    private static int idIncrementer = 0;
    private int fileId;
    private String googleDriveLocation;
    private String localStoreLink;

    public StoreFile(String googleDriveLocation, String localStoreLink) {
        this.fileId = idIncrementer;
        idIncrementer++;
        this.googleDriveLocation = googleDriveLocation;
        this.localStoreLink = localStoreLink;
    }

    public int getFileId() {
        return fileId;
    }

    public void setFileId(int fileId) {
        this.fileId = fileId;
    }

    public String getGoogleDriveLocation() {
        return googleDriveLocation;
    }

    public void setGoogleDriveLocation(String googleDriveLocation) {
        this.googleDriveLocation = googleDriveLocation;
    }

    public String getLocalStoreLink() {
        return localStoreLink;
    }

    public void setLocalStoreLink(String localStoreLink) {
        this.localStoreLink = localStoreLink;
    }
}
