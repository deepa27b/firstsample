package com.firstspringboot.springbootfirst;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="Business_Master")
public class Business {


    @Id
    @GeneratedValue(strategy
            = GenerationType.AUTO)

@Column(name="business_id")
    private Integer business_id;
    @Column(name="business_name")
    private String business_name;
    @Column(name="contact_no")
    private Number contact_no;
    @Column(name="pan")
    private String pan;
    @CreatedDate
    private Date created_date;
    @UpdateTimestamp
    private Date updated_date;

    public Business() {}
    public Business(
            Integer business_id, String business_name,
            Number contact_no, String pan, Date created_date,Date updated_date)
    {
        super();
        this.business_id = business_id;
        this.business_name = business_name;
        this.contact_no = contact_no;
        this.pan = pan;
        this.created_date = created_date;
        this.updated_date = updated_date;

    }
    public Integer getBusiness_id() {
        return business_id;
    }

    public void setBusiness_id(Integer business_id) {
        this.business_id = business_id;
    }

    public String getBusiness_name() {
        return business_name;
    }

    public void setBusiness_name(String business_name) {
        this.business_name = business_name;
    }

    public Number getContact_no() {
        return contact_no;
    }

    public void setContact_no(Number contact_no) {
        this.contact_no = contact_no;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
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
