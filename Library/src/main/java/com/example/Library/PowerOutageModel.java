package com.example.Library;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "PowerOutageTable")      // assigning table
@Entity
public class PowerOutageModel {

    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // telling JPA to increment by one
    @Column(name = "id")        // assigning column
    private int id;
    
    @Column(name = "address")
    private String address;

    @Column(name = "status")
    private String status;

    @Column(name = "description")
    private String description;

    @CreationTimestamp      // JPA annotation to mark creation record
    @Column(name = "created_at", nullable = false,updatable = false)
    private Date createdAt;

    @UpdateTimestamp      // JPA annotation to mark update record
    @Column(name = "updated_at")
    private Date updateAt;



    public PowerOutageModel(){          // Default Construtor

    }



    public PowerOutageModel(int id, Date createdAt, Date updateAt, String address, String status, String description) {     // General Constructor
        this.id = id;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
        this.address = address;
        this.status = status;
        this.description = description;
    }

    // ACCESSOR AND MUTATORS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    @Override
    public String toString() {
        return "PowerOutageModel [id=" + id + ", address=" + address + ", status=" + status + ", description="
                + description + ", createdAt=" + createdAt + ", updateAt=" + updateAt + "]";
    }



    


}
