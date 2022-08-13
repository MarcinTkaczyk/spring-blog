package org.example.blog.adapters.persistance.jpa;

import lombok.Getter;
import lombok.Setter;
import lombok.Value;
import org.example.blog.domain.ArticleMode;
import org.example.blog.domain.Tag;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class ArticleEntity {

    @Id
    String id;

    String category;
    LocalDate publicationDate;
    String title;
    String url;
    String mode;
    @ElementCollection
    List<String> tagList;
}
