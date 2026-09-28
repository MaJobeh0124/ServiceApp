package com.serviceapp.models;

public class Service {
    private String id;
    private String name;
    private String description;
    private int iconResId;
    private int colorResId;
    private int backgroundColorResId;
    private boolean isPopular;

    public Service() {}

    public Service(String id, String name, String description,
                   int iconResId, int colorResId, int backgroundColorResId, boolean isPopular) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.iconResId = iconResId;
        this.colorResId = colorResId;
        this.backgroundColorResId = backgroundColorResId;
        this.isPopular = isPopular;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public int getIconResId() { return iconResId; }
    public int getColorResId() { return colorResId; }
    public int getBackgroundColorResId() { return backgroundColorResId; }
    public boolean isPopular() { return isPopular; }

    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setIconResId(int iconResId) { this.iconResId = iconResId; }
    public void setColorResId(int colorResId) { this.colorResId = colorResId; }
    public void setBackgroundColorResId(int backgroundColorResId) { this.backgroundColorResId = backgroundColorResId; }
    public void setPopular(boolean popular) { isPopular = popular; }
}
