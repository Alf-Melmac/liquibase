package liquibase.hub.model;

import liquibase.changelog.RanChangeSet;

import java.util.Date;

public class HubChange {
    private String changesetId;
    private String changesetAuthor;
    private String changesetFilename;
    private String description;
    private String comments;
    private String tag;
    private String liquibase;
    private String labels;
    private String contexts;
    private Integer orderExecuted;
    private String md5sum;
    private String execType;
    private String deploymentId;
    private Date dateExecuted;

    public HubChange() {
    }

    public HubChange(RanChangeSet ranChangeSet) {
        this.changesetId = ranChangeSet.getId();
        this.changesetAuthor = ranChangeSet.getAuthor();
        this.changesetFilename = ranChangeSet.getChangeLog();
        this.description = ranChangeSet.getDescription();
        this.comments = ranChangeSet.getComments();
        this.tag = ranChangeSet.getTag();
//        this.liquibase = ranChangeSet.get
        this.labels = ranChangeSet.getLabels().toString();
        this.contexts = ranChangeSet.getContextExpression().toString();
        this.orderExecuted = ranChangeSet.getOrderExecuted();
        this.md5sum = ranChangeSet.getLastCheckSum().toString();
        this.execType = ranChangeSet.getExecType().value;
        this.deploymentId = ranChangeSet.getDeploymentId();
        this.dateExecuted = ranChangeSet.getDateExecuted();
    }

    public String getChangesetId() {
        return changesetId;
    }

    public void setChangesetId(String changesetId) {
        this.changesetId = changesetId;
    }

    public String getChangesetAuthor() {
        return changesetAuthor;
    }

    public void setChangesetAuthor(String changesetAuthor) {
        this.changesetAuthor = changesetAuthor;
    }

    public String getChangesetFilename() {
        return changesetFilename;
    }

    public void setChangesetFilename(String changesetFilename) {
        this.changesetFilename = changesetFilename;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getLiquibase() {
        return liquibase;
    }

    public void setLiquibase(String liquibase) {
        this.liquibase = liquibase;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public String getContexts() {
        return contexts;
    }

    public void setContexts(String contexts) {
        this.contexts = contexts;
    }

    public Integer getOrderExecuted() {
        return orderExecuted;
    }

    public void setOrderExecuted(Integer orderExecuted) {
        this.orderExecuted = orderExecuted;
    }

    public String getMd5sum() {
        return md5sum;
    }

    public void setMd5sum(String md5sum) {
        this.md5sum = md5sum;
    }

    public String getExecType() {
        return execType;
    }

    public void setExecType(String execType) {
        this.execType = execType;
    }

    public String getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    public Date getDateExecuted() {
        return dateExecuted;
    }

    public void setDateExecuted(Date dateExecuted) {
        this.dateExecuted = dateExecuted;
    }
}
