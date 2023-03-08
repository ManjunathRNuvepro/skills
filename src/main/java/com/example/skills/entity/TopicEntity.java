package com.example.skills.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "skill_topic")
public class TopicEntity {


    @Id
    @Column
    private String id;

    @Column
    private String schemaVersion;

    @Column
    private String versionString;

    @Column
    private String name;

    @Column
    private String displayName;

    @Column( columnDefinition = "TEXT" )
    private String description;

    @Column
    private String state;

    @Column
    private String owner;

    @Column
    private String provider;

    @Column
    private String visibility;

    @Column( columnDefinition = "TEXT" )
    private String configuration;

}
