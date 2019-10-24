package com.example.assignment2;

public class Item {

    private int itemID;
    private String name;
    private String cost;
    private String desc;

    // Resource ID of associated image (e.g. R.drawable.my_image)
    private int imageDrawableId;


    public Item(int itemID, String name, String cost, String desc, int imageDrawableId) {
        this.itemID = itemID;
        this.name = name;
        this.cost = cost;
        this.desc = desc;

        this.imageDrawableId = imageDrawableId;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {this.desc = desc;}

    public int getImageDrawableId() {
        return imageDrawableId;
    }

    public void setImageDrawableId(int imageDrawableId) {
        this.imageDrawableId = imageDrawableId;
    }


}
