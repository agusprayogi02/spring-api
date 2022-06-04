package com.smk.modul1.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "categories")
public class Category{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "create_at")
    @CreationTimestamp
    private Date createAt;

    // Mapping to the other table
    @OneToMany(mappedBy = "category")
    private List<Product> product;

    @Column(name = "update_at")
    @UpdateTimestamp
    private Date updateAt;
}
