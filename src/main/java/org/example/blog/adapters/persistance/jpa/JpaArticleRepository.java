package org.example.blog.adapters.persistance.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JpaArticleRepository extends JpaRepository<ArticleEntity, String> {

    List<ArticleEntity> getByCategoryOrderByPublicationDate(String category);

    List<ArticleEntity> getByTagListContainsOrderByPublicationDate(String tag);

    ArticleEntity getAllByUrl(String url);

    @Modifying
    @Query("update ArticleEntity a set a.mode = :mode where a.id = :id")
    void switchMode(@Param("id") String id, @Param("mode") String mode);

}
