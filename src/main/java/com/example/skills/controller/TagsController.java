package com.example.skills.controller;

import com.example.skills.entity.TagsEntity;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/skills/tags" )
public class TagsController {

    @ApiOperation( value = "API to get the tags", response = TagsEntity.class,responseContainer = "List",
                   notes = "This API is used to get the tags" )
    @GetMapping
    public TagsEntity getTags()
    {
        return null;
    }
}
