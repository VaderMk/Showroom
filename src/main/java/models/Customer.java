package models;

import com.sun.istack.*;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "email")
    @NotNull
    private String email;

    @Column(name = "phone number")
    @NotNull
    private String phoneNumber;

    @OneToMany(mappedBy = "car")
    private List<Car> cars;
}
