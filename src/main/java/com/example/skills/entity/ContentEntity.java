package com.example.skills.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table( name = "skill_content" )
public class ContentEntity {

    @Id
    @Column
    private String id;

    @Column
    private String name;

    @Column
    private String data;

    @ManyToOne
    @JoinColumn( name = "fk_project", referencedColumnName = "id" )
    private ProjectEntity projectEntity;

}
