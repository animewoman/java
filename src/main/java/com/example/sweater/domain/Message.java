package com.example.sweater.domain;

import javax.persistence.*;

@Entity
@Table(name = "message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String text;
    private String tag;

    @Column(name = "filename")
    private String filename;
    public Message() {


    }
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User author;

    private User getAuthor(){
        return author;
    }
    private void setAuthor(User author){
        this.author = author;
    }
    public Message(String text, String tag){
        this.text = text;
        this.tag = tag;
    }
    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
