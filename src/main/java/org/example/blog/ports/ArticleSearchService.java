package org.example.blog.ports;

import org.example.blog.domain.Article;
import org.example.blog.domain.Tag;

import java.util.Collection;

public interface ArticleSearchService {

    Collection<Article> getByCategory(String category);

    Collection<Article> getByTags(Tag tag);

    Article getByUrl(String url);
}
