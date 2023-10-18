package com.springrest.springrest.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class Load {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String loadingPoint;
    private String unloadingPoint;
    private String productType;
    private String truckType;
    private Integer noOfTrucks;
    private Double weight;
    private String comment;
    private String shipperId;
    private Date date;  // Assuming you have imported java.util.Date

    // Getters, Setters, Constructors, etc.
}

