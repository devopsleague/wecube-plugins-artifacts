package com.webank.plugins.artifacts.dto;

public class ConfigKeyInfoDto {
    
    public static final String BOUND_YES = "Y";
    public static final String BOUND_NO = "N";

    private String line;
    private String key;
    private String type;
    
    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ConfigKeyInfoDto [line=");
        builder.append(line);
        builder.append(", key=");
        builder.append(key);
        builder.append(", type=");
        builder.append(type);
        builder.append("]");
        return builder.toString();
    }
    
    
}
