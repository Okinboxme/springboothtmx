package com.ogbik.htmxapp.lpos.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name = "Lposes")
@EntityListeners(AuditingEntityListener.class)
public class Lpos {

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
    private Integer lpoId;

    @Column
    private String lpoNumber;

    @Column
    private Integer clientId;

    @Column(precision = 10, scale = 2)
    private BigDecimal grossAmount;

    @Column(precision = 10, scale = 2)
    private BigDecimal vat;

    @Column
    private LocalDate dateOrdered;

    @Column
    private LocalDate dateExpected;

    @Column
    private Boolean coldeleted;

    @CreatedDate
    @Column(nullable = false, updatable = false, columnDefinition = "datetime2")
    private OffsetDateTime dateCreated;

    @LastModifiedDate
    @Column(nullable = false, columnDefinition = "datetime2")
    private OffsetDateTime lastUpdated;

    public Integer getLpoId() {
        return lpoId;
    }

    public void setLpoId(final Integer lpoId) {
        this.lpoId = lpoId;
    }

    public String getLpoNumber() {
        return lpoNumber;
    }

    public void setLpoNumber(final String lpoNumber) {
        this.lpoNumber = lpoNumber;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(final Integer clientId) {
        this.clientId = clientId;
    }

    public BigDecimal getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(final BigDecimal grossAmount) {
        this.grossAmount = grossAmount;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(final BigDecimal vat) {
        this.vat = vat;
    }

    public LocalDate getDateOrdered() {
        return dateOrdered;
    }

    public void setDateOrdered(final LocalDate dateOrdered) {
        this.dateOrdered = dateOrdered;
    }

    public LocalDate getDateExpected() {
        return dateExpected;
    }

    public void setDateExpected(final LocalDate dateExpected) {
        this.dateExpected = dateExpected;
    }

    public Boolean getColdeleted() {
        return coldeleted;
    }

    public void setColdeleted(final Boolean coldeleted) {
        this.coldeleted = coldeleted;
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
