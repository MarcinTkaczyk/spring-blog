package org.example.blog.domain;

import lombok.Builder;
import lombok.Value;

import java.time.LocalDate;
import java.util.List;

@Builder
@Value
public class Article {

    String id;
    String category;
    LocalDate publicationDate;
    String title;
    String url;
    ArticleMode mode;
    List<Tag> tagList;
}
