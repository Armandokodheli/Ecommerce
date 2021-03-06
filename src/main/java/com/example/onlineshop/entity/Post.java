package com.example.onlineshop.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "post")
public class Post extends BaseEntity {
    private String title;
    private String author;
    private String content;
    private String photo;
}
