package com.trinity.commons.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sale_session")
@Data
public class SaleSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "uuid")
    private String uuid;
    @Temporal(TemporalType.DATE)
    @Column(name = "created_date")
    private Date createdDate;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "sale_session_status_id")
    private Short saleSessionStatusId;

}
