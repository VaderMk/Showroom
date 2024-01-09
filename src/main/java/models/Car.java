package models;

import com.sun.istack.*;
import jdk.jfr.*;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private int id;
    @Column(name = "brand")
    @NotNull
    private String brand;

    @Column(name = "model")
    @NotNull
    private String model;

    @Column(name = "price")
    @NotNull
    private int price;

    @Column(name = "color")
    @NotNull
    private String color;

    @Column(name = "production year")
    @NotNull
    private int productionYear;

    @Column(name = "transmision")
    @NotNull
    private String transmision;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
}
