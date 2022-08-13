package org.example.blog.ports;

import org.example.blog.domain.Article;
import org.example.blog.domain.ArticleMode;
import org.example.blog.domain.Tag;

import java.util.Collection;

public interface ArticleService {

    void addArticle(Article article);

    void publish(String id);
}
