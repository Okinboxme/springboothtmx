package com.ogbik.htmxapp.lpo_items.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.time.OffsetDateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name = "LpoItemses")
@EntityListeners(AuditingEntityListener.class)
public class LpoItems {

    @Id
    @Column(nullable = false, updatable = false)
    @SequenceGenerator(
            name = "primary_sequence",
            sequenceName = "primary_sequence",
            allocationSize = 1,
            initialValue = 10000
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "primary_sequence"
    )
    private Integer lpoItemId;

    @Column
    private String lpoId;

    @Column
    private String price;

    @Column
    private String qty;

    @Column
    private String grossprice;

    @Column
    private String coldeleted;

    @Column(length = 300)
    private String itemName;

    @CreatedDate
    @Column(nullable = false, updatable = false, columnDefinition = "datetime2")
    private OffsetDateTime dateCreated;

    @LastModifiedDate
    @Column(nullable = false, columnDefinition = "datetime2")
    private OffsetDateTime lastUpdated;

    public Integer getLpoItemId() {
        return lpoItemId;
    }

    public void setLpoItemId(final Integer lpoItemId) {
        this.lpoItemId = lpoItemId;
    }

    public String getLpoId() {
        return lpoId;
    }

    public void setLpoId(final String lpoId) {
        this.lpoId = lpoId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(final String price) {
        this.price = price;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(final String qty) {
        this.qty = qty;
    }

    public String getGrossprice() {
        return grossprice;
    }

    public void setGrossprice(final String grossprice) {
        this.grossprice = grossprice;
    }

    public String getColdeleted() {
        return coldeleted;
    }

    public void setColdeleted(final String coldeleted) {
        this.coldeleted = coldeleted;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(final String itemName) {
        this.itemName = itemName;
    }

    public OffsetDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(final OffsetDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public OffsetDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(final OffsetDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

}
