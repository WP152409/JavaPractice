package org.dimigo.interfaces;

/**
 * @author ChalkPE <chalk@chalk.pe>
 * @since 2017-05-25
 */
public interface IDBManager {
    String ORACLE_DATABASE = "ORACLE";
    String SYBASE_DATABASE = "SYBASE";

    void insert();
    void search();
    void update();
    void delete();

    static IDBManager getDBObject(String database) {
        switch (database) {
            case ORACLE_DATABASE: return new OracleDB();
            case SYBASE_DATABASE: return new SybaseDB();
            default: return null;
        }
    }
}
