package org.example.blog.adapters.persistance.jpa;

import org.example.blog.domain.ArticleMode;
import org.example.blog.domain.Tag;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.List;

@Entity
public class ArticleEntity {

    @Id
    @GeneratedValue
    String id;
    String category;
    LocalDate publicationDate;
    String title;
    String url;
    String mode;
    @ElementCollection
    List<String> tagList;
}
