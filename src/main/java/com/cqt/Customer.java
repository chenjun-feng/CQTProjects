package com.cqt;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false, nullable = false)
    private Long c_id;
    private String c_name;
    private String c_password;
    private String c_email;
    private boolean c_status;
    @OneToMany(mappedBy = "o_customer")
    private List<Order> c_orders = new ArrayList<>();
    @OneToMany(mappedBy = "q_customer")
    private List<Query> c_queries = new ArrayList<>();

}
