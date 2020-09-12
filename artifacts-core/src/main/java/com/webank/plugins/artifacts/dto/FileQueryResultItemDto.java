package com.webank.plugins.artifacts.dto;

import java.util.ArrayList;
import java.util.List;

public class FileQueryResultItemDto {

    private String name;
    private String path;
    private String rootDirName;
    private String relativePath;
    private Boolean isDir;
    private String comparisonResult;
    private String md5;
    private Boolean exists = true;

    private List<FileQueryResultItemDto> children;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsDir() {
        return isDir;
    }

    public void setIsDir(Boolean isDir) {
        this.isDir = isDir;
    }

    public String getComparisonResult() {
        return comparisonResult;
    }

    public void setComparisonResult(String comparisonResult) {
        this.comparisonResult = comparisonResult;
    }

    public List<FileQueryResultItemDto> getChildren() {
        return children;
    }

    public void setChildren(List<FileQueryResultItemDto> children) {
        this.children = children;
    }

    public void addFileQueryResultItem(FileQueryResultItemDto item) {
        if (item == null) {
            return;
        }

        if (this.children == null) {
            this.children = new ArrayList<FileQueryResultItemDto>();
        }

        this.children.add(item);
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Boolean getExists() {
        return exists;
    }

    public void setExists(Boolean exists) {
        this.exists = exists;
    }

    public String getRelativePath() {
        return relativePath;
    }

    public void setRelativePath(String relativePath) {
        this.relativePath = relativePath;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("FileQueryResultItemDto [name=");
        builder.append(name);
        builder.append(", path=");
        builder.append(path);
        builder.append(", rootDirName=");
        builder.append(rootDirName);
        builder.append(", relativePath=");
        builder.append(relativePath);
        builder.append(", isDir=");
        builder.append(isDir);
        builder.append(", comparisonResult=");
        builder.append(comparisonResult);
        builder.append(", md5=");
        builder.append(md5);
        builder.append(", exists=");
        builder.append(exists);
        builder.append(", children=");
        builder.append(children);
        builder.append("]");
        return builder.toString();
    }

    public String getRootDirName() {
        return rootDirName;
    }

    public void setRootDirName(String rootDirName) {
        this.rootDirName = rootDirName;
    }

}
