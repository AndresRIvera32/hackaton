package com.hackaton.usermanagment.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class User {

    @Id
    private String email;
    private String username;
    private String name;
    @ManyToMany
    @JoinTable()
    private List<Roles> rolesList;
}
