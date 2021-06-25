package com.hackaton.usermanagment.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class Roles {

    @Id
    private int id;
    private String name;
    private String roleType;
}
