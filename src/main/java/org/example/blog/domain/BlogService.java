package org.example.blog.domain;

import lombok.RequiredArgsConstructor;
import org.example.blog.ports.ArticleRepository;
import org.example.blog.ports.ArticleService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BlogService implements ArticleService {
    private final ArticleRepository articleRepository;

    @Override
    public void addArticle(Article article) {
        articleRepository.save(article);
    }

    @Override
    public void publish(String id) {
        articleRepository.switchMode(id, ArticleMode.PUBLIC);
    }

}
