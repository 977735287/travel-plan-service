package per.san.common;

public enum SqlToJavaTypeEnum {
    VARCHAR("String"),
    CHAR("String"),
    BLOB("byte[]"),
    TEXT("String"),
    INTEGER("Integer"),
    TINYINT("Integer"),
    SMALLINT("Integer"),
    MEDIUMINT("Integer"),
    BIT("Boolean"),
    BIGINT("Long"),
    DECIMAL("java.math.BigDecimal"),
    FLOAT("Float"),
    DOUBLE("Double"),
    DATE("Date"),
    DATETIME("Date"),
    TIME("Date"),
    TIMESTAMP("Date"),
    LONGTEXT("String"),
    TINYTEXT("String");

    private final String javaType;

    SqlToJavaTypeEnum(String javaType) {
        this.javaType = javaType;
    }

    public String getJavaType(){
        return javaType;
    }
}
