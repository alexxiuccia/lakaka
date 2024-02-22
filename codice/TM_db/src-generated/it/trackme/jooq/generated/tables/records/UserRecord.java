/*
 * This file is generated by jOOQ.
 */
package it.trackme.jooq.generated.tables.records;


import it.trackme.jooq.generated.tables.User;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserRecord extends UpdatableRecordImpl<UserRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>user.idUser</code>.
     */
    public void setIduser(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>user.idUser</code>.
     */
    public Integer getIduser() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>user.nome</code>.
     */
    public void setNome(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>user.nome</code>.
     */
    public String getNome() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return User.USER.IDUSER;
    }

    @Override
    public Field<String> field2() {
        return User.USER.NOME;
    }

    @Override
    public Integer component1() {
        return getIduser();
    }

    @Override
    public String component2() {
        return getNome();
    }

    @Override
    public Integer value1() {
        return getIduser();
    }

    @Override
    public String value2() {
        return getNome();
    }

    @Override
    public UserRecord value1(Integer value) {
        setIduser(value);
        return this;
    }

    @Override
    public UserRecord value2(String value) {
        setNome(value);
        return this;
    }

    @Override
    public UserRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserRecord
     */
    public UserRecord() {
        super(User.USER);
    }

    /**
     * Create a detached, initialised UserRecord
     */
    public UserRecord(Integer iduser, String nome) {
        super(User.USER);

        setIduser(iduser);
        setNome(nome);
        resetChangedOnNotNull();
    }
}
