package com.firstspringboot.springbootfirst;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="Branch_Master")
public class Branch {
    public Branch() {}

    @Id
    @GeneratedValue(strategy
            = GenerationType.AUTO)
    @Column(name="branch_id")
    private Integer branch_id;
    @Column(name="business_id")
    private Integer business_id;
    @Column(name="branch_address")
    private String branch_address;
    @Column(name="branch_contact")
    private Number branch_contact;
    @Column(name="active_ind")
    private String active_ind;
    @CreatedDate
    private Date created_date;
    @UpdateTimestamp
    private Date updated_date;

    public Branch(
            Integer branch_id,Integer business_id, String branch_address,
            Number branch_contact, String active_ind, Date created_date, Date updated_date)
    {
        this.branch_id = branch_id;
        this.business_id = business_id;
        this.branch_address = branch_address;
        this.branch_contact = branch_contact;
        this.active_ind = active_ind;
        this.created_date = created_date;
        this.updated_date = updated_date;

    }


    public Integer getBranch_id() {
        return branch_id;
    }

    public void setBranch_id(Integer branch_id) {
        this.branch_id = branch_id;
    }

    public Integer getBusiness_id() {
        return business_id;
    }

    public void setBusiness_id(Integer business_id) {
        this.business_id = business_id;
    }

    public String getBranch_address() {
        return branch_address;
    }

    public void setBranch_address(String branch_address) {
        this.branch_address = branch_address;
    }

    public Number getBranch_contact() {
        return branch_contact;
    }

    public void setBranch_contact(Number branch_contact) {
        this.branch_contact = branch_contact;
    }

    public String getActive_ind() {
        return active_ind;
    }

    public void setActive_ind(String active_ind) {
        this.active_ind = active_ind;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public Date getUpdated_date() {
        return updated_date;
    }

    public void setUpdated_date(Date updated_date) {
        this.updated_date = updated_date;
    }


}
