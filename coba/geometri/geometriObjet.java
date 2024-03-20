package coba.geometri;

import java.util.Date;

class geometriObjet {
    private String color;
    private boolean isFilled;
    private Date dateCreated;

    public geometriObjet(){
        dateCreated = new Date();
    }

    public geometriObjet(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
        dateCreated = new Date();
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return isFilled;
    }
    public void setFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }
    public Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +" and filled: " + isFilled;
    }
}
