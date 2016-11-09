package tr.edu.anadolu.admin.models;

import java.util.Date;

public class News {
    private int id;
    private String title;
 //   private String date;
    private String description;
    private String detail;
    private String category;
    private String image;


    public News() {

    }

    public News(String title, String description, String detail, String category, String image) {
        this.title = title;
        //this.date = date;
        this.description = description;
        this.detail = detail;
        this.category = category;
        this.image = image;
    }

    public News(int id, String title, String description, String detail, String category, String image) {
        this.id = id;
        this.title = title;
        //this.date = date;
        this.description = description;
        this.detail = detail;
        this.category = category;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    /*public String getDate() {
        return date;
    }*/

   /* public void setDate(String date) {
        this.date = date;
    }*/

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
