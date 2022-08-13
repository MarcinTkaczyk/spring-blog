package org.example.blog.adapters.persistance.jpa;

import lombok.RequiredArgsConstructor;
import org.example.blog.domain.Article;
import org.example.blog.domain.ArticleMode;
import org.example.blog.domain.Tag;
import org.example.blog.ports.ArticleRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Transactional
@Component
@RequiredArgsConstructor
public class JpaArticleRepositoryAdapter implements ArticleRepository {

    private final JpaArticleRepository articleRepository;
    private final JpaPersistenceArticleMapper articleMapper;

    @Override
    public void save(Article article) {

    }

    @Override
    public Collection<Article> getByCategory(String category) {
        return null;
    }

    @Override
    public Collection<Article> getByTags(Tag tag) {
        return null;
    }

    @Override
    public Article getByUrl(String url) {
        return null;
    }

    @Override
    public void switchMode(String id, ArticleMode mode) {

    }
}
