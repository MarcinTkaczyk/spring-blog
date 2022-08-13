package org.example.blog.ports;

import org.example.blog.domain.Article;
import org.example.blog.domain.ArticleMode;
import org.example.blog.domain.Tag;

import java.util.Collection;


public interface ArticleRepository {

    Article save(Article article);

    Collection<Article> getByCategory(String category);

    Collection<Article> getByTags(Tag tag);

    Article getByUrl(String url);

    void switchMode(String id, ArticleMode mode);




}
