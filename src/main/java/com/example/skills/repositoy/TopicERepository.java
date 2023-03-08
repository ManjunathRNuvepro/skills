package com.example.skills.repositoy;

import com.example.skills.entity.TopicEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicERepository extends JpaRepository<TopicEntity, String> {

}