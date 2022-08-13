package org.example.blog.adapters.persistance.jpa;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class ArticleModeEntity {

    @Id
    @Enumerated(EnumType.STRING)
    String mode;
}
