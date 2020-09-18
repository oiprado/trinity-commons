package com.trinity.commons.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Table(name = "category")
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "enable")
    private boolean enable;
    @JsonIgnore
    @OneToMany(mappedBy = "categoryId")
    private List<Product> product;
    @JsonIgnore
    @OneToMany(mappedBy = "parentId")
    private List<Category> categories;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JoinColumn(name = "parent_id", referencedColumnName = "id")
    @ManyToOne
    private Category parentId;
}
