package ru.netology.attachment;

public class Video {

    private int id;
    private int ownerId;
    private int duration;
    private int date;
    private int addingDate;
    private int views;
    private int comments;
    private int canEdit;
    private int canAdd;
    private int isPrivate;
    private int processing;
    private int live;
    private int upcoming;
    private String title;
    private String description;
    private String photoLq;
    private String photoHq;
    private String firstFrameLq;
    private String firstFrameHq;
    private String player;
    private String platform;
    private String accesKey;
    private boolean isFavorite;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getAddingDate() {
        return addingDate;
    }

    public void setAddingDate(int addingDate) {
        this.addingDate = addingDate;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getCanAdd() {
        return canAdd;
    }

    public void setCanAdd(int canAdd) {
        this.canAdd = canAdd;
    }

    public int getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(int isPrivate) {
        this.isPrivate = isPrivate;
    }

    public int getProcessing() {
        return processing;
    }

    public void setProcessing(int processing) {
        this.processing = processing;
    }

    public int getLive() {
        return live;
    }

    public void setLive(int live) {
        this.live = live;
    }

    public int getUpcoming() {
        return upcoming;
    }

    public void setUpcoming(int upcoming) {
        this.upcoming = upcoming;
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

    public String getPhotoLq() {
        return photoLq;
    }

    public void setPhotoLq(String photoLq) {
        this.photoLq = photoLq;
    }

    public String getPhotoHq() {
        return photoHq;
    }

    public void setPhotoHq(String photoHq) {
        this.photoHq = photoHq;
    }

    public String getFirstFrameLq() {
        return firstFrameLq;
    }

    public void setFirstFrameLq(String firstFrameLq) {
        this.firstFrameLq = firstFrameLq;
    }

    public String getFirstFrameHq() {
        return firstFrameHq;
    }

    public void setFirstFrameHq(String firstFrameHq) {
        this.firstFrameHq = firstFrameHq;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getAccesKey() {
        return accesKey;
    }

    public void setAccesKey(String accesKey) {
        this.accesKey = accesKey;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }
}
