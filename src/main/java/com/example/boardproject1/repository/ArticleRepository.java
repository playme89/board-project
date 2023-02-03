package com.example.boardproject1.repository;

import com.example.boardproject1.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}