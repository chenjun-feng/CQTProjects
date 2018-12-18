package com.cqt;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "types")
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false, nullable = false)
    private Long t_id;
    private String t_name;
    private String department;
    @OneToMany(mappedBy = "q_type")
    private List<Query> t_queries;

}
