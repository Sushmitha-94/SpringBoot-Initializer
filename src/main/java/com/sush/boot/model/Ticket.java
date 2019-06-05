package com.sush.boot.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="ticket")
public class Ticket {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="SOURCE")
    private String source;

    @Column(name="DESTINATION")
    private String destination;

    @Column(name="NAME")
    private String name;

    @Column(name="DATEOFJOURNEY")
    private Date dateOfJourney;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfJourney() {
        return dateOfJourney;
    }

    public void setDateOfJourney(Date dateOfJourney) {
        this.dateOfJourney = dateOfJourney;
    }
}
