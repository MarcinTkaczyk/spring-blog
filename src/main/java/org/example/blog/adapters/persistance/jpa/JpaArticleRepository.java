package org.example.blog.adapters.persistance.jpa;

import org.example.blog.domain.Article;
import org.example.blog.domain.ArticleMode;
import org.example.blog.domain.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface JpaArticleRepository extends JpaRepository<ArticleEntity, String> {

    Collection<ArticleEntity> getByCategoryOrderByPublicationDate(String category);

    Collection<ArticleEntity> getByTagListContainsOrderByPublicationDate(Tag tag);

    ArticleEntity getAllByUrl(String url);

    @Query("update ArticleEntity a set a.mode =:mode where a.id=:id")
    void switchMode(@Param("id") String id, @Param("mode") String mode);
}
