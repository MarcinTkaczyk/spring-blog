package org.example.blog.domain;

import lombok.RequiredArgsConstructor;
import org.example.blog.ports.ArticleRepository;
import org.example.blog.ports.ArticleSearchService;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class BlogSearchService implements ArticleSearchService {
    private final ArticleRepository articleRepository;


    @Override
    public Collection<Article> getByCategory(String category) {
        return articleRepository.getByCategory(category);
    }

    @Override
    public Collection<Article> getByTags(Tag tag) {
        return articleRepository.getByTags(tag);
    }

    @Override
    public Article getByUrl(String url) {
        return articleRepository.getByUrl(url);
    }

}
