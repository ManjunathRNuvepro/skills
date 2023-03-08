package com.example.skills.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table( name = "skill_tags_map" )
public class TagsToTopicEntity {

    @Id
    @Column
    private String id;


    @ManyToOne
    @JoinColumn( name = "fk_tags", referencedColumnName = "id" )
    private TagsEntity tagsEntity;

    @ManyToOne
    @JoinColumn( name = "fk_topic", referencedColumnName = "id" )
    private TopicEntity topicEntity;

}
