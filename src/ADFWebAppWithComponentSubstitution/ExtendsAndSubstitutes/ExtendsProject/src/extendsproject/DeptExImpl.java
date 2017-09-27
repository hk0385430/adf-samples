/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package extendsproject;

import oracle.jbo.Key;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;

import test.model.DeptImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DeptExImpl extends DeptImpl {
    public static final int MAXATTRCONST = EntityDefImpl.getMaxAttrConst("test.model.Dept");
    private static EntityDefImpl mDefinitionObject;

    /**This is the default constructor (do not remove)
     */
    public DeptExImpl() {
    }


    /**Retrieves the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = (EntityDefImpl)EntityDefImpl.findDefObject("extendsproject.DeptEx");
        }
        return mDefinitionObject;
    }

    /**Gets the attribute value for Loc, using the alias name Loc
     */
    public String getLoc() {
        return super.getLoc();
    }

    /**Sets <code>value</code> as the attribute value for Loc
     */
    public void setLoc(String value) {
        super.setLoc(value);
    }

    /**getAttrInvokeAccessor: generated method. Do not modify.
     */
    protected Object getAttrInvokeAccessor(int index, 
                                           AttributeDefImpl attrDef) throws Exception {
        if (index == LOC) {
            return getLoc();
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**setAttrInvokeAccessor: generated method. Do not modify.
     */
    protected void setAttrInvokeAccessor(int index, Object value, 
                                         AttributeDefImpl attrDef) throws Exception {
        if (index == LOC) {
            setLoc((String)value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
        return;
    }

    /**Creates a Key object based on given key constituents
     */
    public static Key createPrimaryKey(Number deptno) {
        return new Key(new Object[]{deptno});
    }
}