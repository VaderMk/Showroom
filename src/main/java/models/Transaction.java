package models;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "tansaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "transaction data")
    private Date transactionDate;

    @Column(name = "transaction type")
    private String transactionType;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "customers",
            joinColumns = {@JoinColumn( name = "customers_id")},
            inverseJoinColumns = {@JoinColumn(name = "cars_id")}
    )
    private Set<Transaction> transactions;
}
