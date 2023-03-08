package com.example.skills.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "skill_project")
public class ProjectEntity {


    @Id
    @Column
    private String id;

    @Column
    private String schemaVersion;

    @Column
    private String name;

    @Column
    private String displayName;

    @Column( columnDefinition = "TEXT" )
    private String description;

    @Column
    private String type;

    @Column( columnDefinition = "TEXT" )
    private String evaluation;

    @Column( columnDefinition = "TEXT" )
    private String configuration;

    @ManyToOne
    @JoinColumn( name = "fk_topic", referencedColumnName = "id" )
    private TopicEntity topicEntity;

}
