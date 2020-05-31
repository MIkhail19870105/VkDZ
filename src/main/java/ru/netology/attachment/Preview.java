package ru.netology.attachment;

public class Preview {

    private Photo photo;
    private Graffity graffity;
    private AudioMessage audioMessage;

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public Graffity getGraffity() {
        return graffity;
    }

    public void setGraffity(Graffity graffity) {
        this.graffity = graffity;
    }

    public AudioMessage getAudioMessage() {
        return audioMessage;
    }

    public void setAudioMessage(AudioMessage audioMessage) {
        this.audioMessage = audioMessage;
    }
}
