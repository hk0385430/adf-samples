/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package demo.model;
import oracle.jbo.server.ViewObjectImpl;
//  ---------------------------------------------------------------------
//  ---    File generated by Oracle ADF Business Components Design Time.
//  ---    Custom code may be added to this class.
//  ---    Warning: Do not modify method signatures of generated methods.
//  ---------------------------------------------------------------------

public class DeptViewImpl extends ViewObjectImpl  {
  /**
   * 
   *  This is the default constructor (do not remove)
   */
  public DeptViewImpl() {
  }

  protected void executeQueryForCollection(Object qc, Object[] params, int noUserParams) {
    System.out.println("### executeQueryForCollection on DeptView Called ###");
    super.executeQueryForCollection(qc, params, noUserParams);
  }
}
