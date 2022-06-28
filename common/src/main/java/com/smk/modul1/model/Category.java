package com.smk.modul1.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "categories")
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "create_at")
    @CreationTimestamp
    private Date createAt;

    // Mapping to the other table
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private Set<Product> product = new HashSet<>();

    @Column(name = "update_at")
    @UpdateTimestamp
    private Date updateAt;
}
