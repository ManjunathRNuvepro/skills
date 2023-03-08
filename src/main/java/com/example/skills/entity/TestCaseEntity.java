package com.example.skills.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table( name = "skill_testcase" )
public class TestCaseEntity {

    @Id
    @Column
    private String id;

    @Column
    private String title;

    @Column
    private Integer marks;

    @Column(name = "expected_result")
    private Integer expectedResult;

    @ManyToOne
    @JoinColumn( name = "fk_project", referencedColumnName = "id" )
    private ProjectEntity projectEntity;

}
