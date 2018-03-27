package com.androstock.newsapp;

/**
 * Created by xxm on 14/03/18.
 */

    public class News {
        private String NEWSpic;
        private String author;
        private String title;
        private String publishedAt;
        private String discription;
        private String url;
        private String name;

        public News(String url,String NEWSpic, String discription,String author, String title, String publishedAt,String name) {
            this.NEWSpic = NEWSpic;
            this.author = author;
            this.title = title;
            this.publishedAt = publishedAt;
            this.discription = discription;
            this.url=url;
            this.name =name;
        }


        public String getNEWSpic() {
            return NEWSpic;
        }

        public void setNEWSpic(String NEWSpic) {
            this.NEWSpic = NEWSpic;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getDiscription() {
            return discription;
        }

        public void setDiscription(String discription) {
            this.discription = discription;
        }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }
}


