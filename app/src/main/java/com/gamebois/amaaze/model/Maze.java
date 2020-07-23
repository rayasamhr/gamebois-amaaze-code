package com.gamebois.amaaze.model;

import com.gamebois.amaaze.graphics.PointMarker;
import com.google.firebase.firestore.DocumentId;
import com.google.firebase.firestore.ServerTimestamp;

import java.util.Date;
import java.util.UUID;

public class Maze {
    @DocumentId
    private String uniqueID;
    @ServerTimestamp
    private Date timeCreated;
    private String title;
    private String imageURL;
    private String userID;
    private boolean isPublic;
    private long numLikes;
    private float height;
    private float width;
    private PointMarker startPoint;
    private PointMarker endPoint;

    public Maze() {
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID() {
        this.uniqueID = UUID.randomUUID().toString();
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public boolean getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(boolean isPublic) {
        this.isPublic = isPublic;
    }

    public long getNumLikes() {
        return numLikes;
    }

    public void setNumLikes(int numLikes) {
        this.numLikes = numLikes;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public PointMarker getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(PointMarker startPoint) {
        this.startPoint = startPoint;
    }

    public PointMarker getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(PointMarker endPoint) {
        this.endPoint = endPoint;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
