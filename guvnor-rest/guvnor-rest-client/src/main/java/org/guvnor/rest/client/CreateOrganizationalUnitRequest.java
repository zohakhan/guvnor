package org.guvnor.rest.client;

import java.util.List;

import org.jboss.errai.common.client.api.annotations.Portable;

@Portable
public class CreateOrganizationalUnitRequest extends JobRequest {

    private String organizationalUnitName;
    private String owner;
    private String defaultGroupId;
    private String description;
    private List<String> repositories;

    public String getOrganizationalUnitName() {
        return organizationalUnitName;
    }

    public void setOrganizationalUnitName( String organizationalUnitName ) {
        this.organizationalUnitName = organizationalUnitName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner( String owner ) {
        this.owner = owner;
    }

    public String getDefaultGroupId() {
        return defaultGroupId;
    }

    public void setDefaultGroupId( String defaultGroupId ) {
        this.defaultGroupId = defaultGroupId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription( String description ) {
        this.description = description;
    }

    public List<String> getRepositories() {
        return repositories;
    }

    public void setRepositories( List<String> repositories ) {
        this.repositories = repositories;
    }
}
