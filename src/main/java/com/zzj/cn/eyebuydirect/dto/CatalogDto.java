package com.zzj.cn.eyebuydirect.dto;

import com.zzj.cn.eyebuydirect.entity.Catalog;

import java.util.List;


public class CatalogDto {

    private String id;
    private String name;
    private List<Catalog> subCatalogs;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Catalog> getSubCatalogs() {
        return subCatalogs;
    }

    public void setSubCatalogs(List<Catalog> subCatalogs) {
        this.subCatalogs = subCatalogs;
    }

}
