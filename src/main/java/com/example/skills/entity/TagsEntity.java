package com.example.skills.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table( name = "skill_tags" )
public class TagsEntity {

    @Id
    @Column
    private String id;

    @Column
    private String key;

    @Column
    private String value;

}
