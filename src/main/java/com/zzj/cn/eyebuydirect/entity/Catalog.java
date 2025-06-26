package com.zzj.cn.eyebuydirect.entity;

import java.util.List;

public class Catalog {

    private String name;
    private List<Catalog> subCatalogs;

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
