package com.ogbik.htmxapp.projects_reports.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.OffsetDateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Entity
@Table(name = "ProjectsReportses")
@EntityListeners(AuditingEntityListener.class)
public class ProjectsReports {

    @Id
    @Column(nullable = false, updatable = false)
    private String modulesAcquired;

    @Column
    private String expectedOperations;

    @Column
    private String installationCustomizationTraining;

    @Column
    private String statusRemark;

    @Column
    private String userTraining;

    @Column
    private String userAcceptanceRemark;

    @Column
    private String institution;

    @Column(length = 200)
    private String expectedOperationUser;

    @CreatedDate
    @Column(nullable = false, updatable = false, columnDefinition = "datetime2")
    private OffsetDateTime dateCreated;

    @LastModifiedDate
    @Column(nullable = false, columnDefinition = "datetime2")
    private OffsetDateTime lastUpdated;

    public String getModulesAcquired() {
        return modulesAcquired;
    }

    public void setModulesAcquired(final String modulesAcquired) {
        this.modulesAcquired = modulesAcquired;
    }

    public String getExpectedOperations() {
        return expectedOperations;
    }

    public void setExpectedOperations(final String expectedOperations) {
        this.expectedOperations = expectedOperations;
    }

    public String getInstallationCustomizationTraining() {
        return installationCustomizationTraining;
    }

    public void setInstallationCustomizationTraining(
            final String installationCustomizationTraining) {
        this.installationCustomizationTraining = installationCustomizationTraining;
    }

    public String getStatusRemark() {
        return statusRemark;
    }

    public void setStatusRemark(final String statusRemark) {
        this.statusRemark = statusRemark;
    }

    public String getUserTraining() {
        return userTraining;
    }

    public void setUserTraining(final String userTraining) {
        this.userTraining = userTraining;
    }

    public String getUserAcceptanceRemark() {
        return userAcceptanceRemark;
    }

    public void setUserAcceptanceRemark(final String userAcceptanceRemark) {
        this.userAcceptanceRemark = userAcceptanceRemark;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(final String institution) {
        this.institution = institution;
    }

    public String getExpectedOperationUser() {
        return expectedOperationUser;
    }

    public void setExpectedOperationUser(final String expectedOperationUser) {
        this.expectedOperationUser = expectedOperationUser;
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
