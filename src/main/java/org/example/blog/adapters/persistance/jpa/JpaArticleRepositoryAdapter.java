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
    public Article save(Article article) {
        var entity = articleMapper.toEntity(article);
        articleRepository.save(entity);
        return articleMapper.toDomain(entity);
    }

    @Override
    public Collection<Article> getByCategory(String category) {
        var articleList = articleRepository.getByCategoryOrderByPublicationDate(category);
        return articleMapper.toDomain(articleList);
    }

    @Override
    public Collection<Article> getByTags(Tag tag) {

        var articleList = articleRepository.getByTagListContainsOrderByPublicationDate(tag.name());
        return articleMapper.toDomain(articleList);
    }

    @Override
    public Article getByUrl(String url) {
        var articleList = articleRepository.getAllByUrl(url);
        return articleMapper.toDomain(articleList);
    }

    @Override
    public void switchMode(String id, ArticleMode mode) {
        articleRepository.switchMode(id, mode.name());
    }
}
