package com.osoondosson.controller;

import com.osoondosson.service.GroupServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
public class GroupController {

    @Autowired
    private GroupServiceImpl groupService;
}
