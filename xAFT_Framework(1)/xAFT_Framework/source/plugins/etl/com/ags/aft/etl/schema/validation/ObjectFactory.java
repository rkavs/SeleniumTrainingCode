//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.10 at 06:57:40 PM IST 
//


package com.ags.aft.etl.schema.validation;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Database }
     * 
     */
    public Database createDatabase() {
        return new Database();
    }

    /**
     * Create an instance of {@link Database.Tables }
     * 
     */
    public Database.Tables createDatabaseTables() {
        return new Database.Tables();
    }

    /**
     * Create an instance of {@link Database.Tables.Table }
     * 
     */
    public Database.Tables.Table createDatabaseTablesTable() {
        return new Database.Tables.Table();
    }

    /**
     * Create an instance of {@link Database.Tables.Table.Field }
     * 
     */
    public Database.Tables.Table.Field createDatabaseTablesTableField() {
        return new Database.Tables.Table.Field();
    }

}
