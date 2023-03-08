package com.example.skills.repositoy;

import com.example.skills.entity.TagsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagsRepository extends JpaRepository<TagsEntity, String> {

}