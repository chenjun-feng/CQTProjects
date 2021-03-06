package com.cqt;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "queries")
public class Query {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(updatable = false, nullable = false)
    private Long q_id;
    private boolean q_status;
    private int q_feedback;
    @ManyToOne
    private Type q_type;
    @ManyToOne
    private Customer q_customer;
    @ManyToOne
    private Order q_order;
    @ManyToOne
    private Employee q_employee;

}
