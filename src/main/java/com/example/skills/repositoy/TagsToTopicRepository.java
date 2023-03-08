package com.example.skills.repositoy;

import com.example.skills.entity.TagsToTopicEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagsToTopicRepository extends JpaRepository<TagsToTopicEntity, String> {

}