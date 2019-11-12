package com.xlq;

import com.xlq.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProjectSpringBoot001ApplicationTests {

    @Autowired
    Person person;

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
