package org.example.blog.adapters.persistance.jpa;

import org.example.blog.domain.Article;
import org.example.blog.domain.Tag;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface JpaPersistenceArticleMapper {


    ArticleEntity toEntity(Article article);

    Article toDomain(ArticleEntity articleEntity);

    @IterableMapping(elementTargetType = Article.class)
    List<Article> toDomain(List<ArticleEntity> entities);

    @IterableMapping(elementTargetType = String.class)
    List<Tag> tagsToDomain(List<String> tagEntity);

    @IterableMapping(elementTargetType = Tag.class)
    List<String> tagsToEntity(List<Tag> tags);

}
