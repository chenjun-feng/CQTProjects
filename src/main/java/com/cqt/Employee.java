package com.cqt;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false, nullable = false)
    private Long e_id;
    private String e_name;
    private String e_password;
    private String e_email;
    private String department;
    private String e_role;
    private int e_workload;
    @OneToMany(mappedBy = "q_employee")
    private List<Query> e_queries;

}
