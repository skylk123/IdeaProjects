package com.sino.file.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PolicyAccExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PolicyAccExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andAccnoIsNull() {
            addCriterion("AccNo is null");
            return (Criteria) this;
        }

        public Criteria andAccnoIsNotNull() {
            addCriterion("AccNo is not null");
            return (Criteria) this;
        }

        public Criteria andAccnoEqualTo(String value) {
            addCriterion("AccNo =", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoNotEqualTo(String value) {
            addCriterion("AccNo <>", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoGreaterThan(String value) {
            addCriterion("AccNo >", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoGreaterThanOrEqualTo(String value) {
            addCriterion("AccNo >=", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoLessThan(String value) {
            addCriterion("AccNo <", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoLessThanOrEqualTo(String value) {
            addCriterion("AccNo <=", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoLike(String value) {
            addCriterion("AccNo like", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoNotLike(String value) {
            addCriterion("AccNo not like", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoIn(List<String> values) {
            addCriterion("AccNo in", values, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoNotIn(List<String> values) {
            addCriterion("AccNo not in", values, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoBetween(String value1, String value2) {
            addCriterion("AccNo between", value1, value2, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoNotBetween(String value1, String value2) {
            addCriterion("AccNo not between", value1, value2, "accno");
            return (Criteria) this;
        }

        public Criteria andPolicynoIsNull() {
            addCriterion("PolicyNo is null");
            return (Criteria) this;
        }

        public Criteria andPolicynoIsNotNull() {
            addCriterion("PolicyNo is not null");
            return (Criteria) this;
        }

        public Criteria andPolicynoEqualTo(String value) {
            addCriterion("PolicyNo =", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoNotEqualTo(String value) {
            addCriterion("PolicyNo <>", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoGreaterThan(String value) {
            addCriterion("PolicyNo >", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoGreaterThanOrEqualTo(String value) {
            addCriterion("PolicyNo >=", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoLessThan(String value) {
            addCriterion("PolicyNo <", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoLessThanOrEqualTo(String value) {
            addCriterion("PolicyNo <=", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoLike(String value) {
            addCriterion("PolicyNo like", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoNotLike(String value) {
            addCriterion("PolicyNo not like", value, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoIn(List<String> values) {
            addCriterion("PolicyNo in", values, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoNotIn(List<String> values) {
            addCriterion("PolicyNo not in", values, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoBetween(String value1, String value2) {
            addCriterion("PolicyNo between", value1, value2, "policyno");
            return (Criteria) this;
        }

        public Criteria andPolicynoNotBetween(String value1, String value2) {
            addCriterion("PolicyNo not between", value1, value2, "policyno");
            return (Criteria) this;
        }

        public Criteria andProductnoIsNull() {
            addCriterion("ProductNo is null");
            return (Criteria) this;
        }

        public Criteria andProductnoIsNotNull() {
            addCriterion("ProductNo is not null");
            return (Criteria) this;
        }

        public Criteria andProductnoEqualTo(String value) {
            addCriterion("ProductNo =", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotEqualTo(String value) {
            addCriterion("ProductNo <>", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoGreaterThan(String value) {
            addCriterion("ProductNo >", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoGreaterThanOrEqualTo(String value) {
            addCriterion("ProductNo >=", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLessThan(String value) {
            addCriterion("ProductNo <", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLessThanOrEqualTo(String value) {
            addCriterion("ProductNo <=", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoLike(String value) {
            addCriterion("ProductNo like", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotLike(String value) {
            addCriterion("ProductNo not like", value, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoIn(List<String> values) {
            addCriterion("ProductNo in", values, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotIn(List<String> values) {
            addCriterion("ProductNo not in", values, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoBetween(String value1, String value2) {
            addCriterion("ProductNo between", value1, value2, "productno");
            return (Criteria) this;
        }

        public Criteria andProductnoNotBetween(String value1, String value2) {
            addCriterion("ProductNo not between", value1, value2, "productno");
            return (Criteria) this;
        }

        public Criteria andCostnoIsNull() {
            addCriterion("CostNo is null");
            return (Criteria) this;
        }

        public Criteria andCostnoIsNotNull() {
            addCriterion("CostNo is not null");
            return (Criteria) this;
        }

        public Criteria andCostnoEqualTo(String value) {
            addCriterion("CostNo =", value, "costno");
            return (Criteria) this;
        }

        public Criteria andCostnoNotEqualTo(String value) {
            addCriterion("CostNo <>", value, "costno");
            return (Criteria) this;
        }

        public Criteria andCostnoGreaterThan(String value) {
            addCriterion("CostNo >", value, "costno");
            return (Criteria) this;
        }

        public Criteria andCostnoGreaterThanOrEqualTo(String value) {
            addCriterion("CostNo >=", value, "costno");
            return (Criteria) this;
        }

        public Criteria andCostnoLessThan(String value) {
            addCriterion("CostNo <", value, "costno");
            return (Criteria) this;
        }

        public Criteria andCostnoLessThanOrEqualTo(String value) {
            addCriterion("CostNo <=", value, "costno");
            return (Criteria) this;
        }

        public Criteria andCostnoLike(String value) {
            addCriterion("CostNo like", value, "costno");
            return (Criteria) this;
        }

        public Criteria andCostnoNotLike(String value) {
            addCriterion("CostNo not like", value, "costno");
            return (Criteria) this;
        }

        public Criteria andCostnoIn(List<String> values) {
            addCriterion("CostNo in", values, "costno");
            return (Criteria) this;
        }

        public Criteria andCostnoNotIn(List<String> values) {
            addCriterion("CostNo not in", values, "costno");
            return (Criteria) this;
        }

        public Criteria andCostnoBetween(String value1, String value2) {
            addCriterion("CostNo between", value1, value2, "costno");
            return (Criteria) this;
        }

        public Criteria andCostnoNotBetween(String value1, String value2) {
            addCriterion("CostNo not between", value1, value2, "costno");
            return (Criteria) this;
        }

        public Criteria andAcctypeIsNull() {
            addCriterion("AccType is null");
            return (Criteria) this;
        }

        public Criteria andAcctypeIsNotNull() {
            addCriterion("AccType is not null");
            return (Criteria) this;
        }

        public Criteria andAcctypeEqualTo(String value) {
            addCriterion("AccType =", value, "acctype");
            return (Criteria) this;
        }

        public Criteria andAcctypeNotEqualTo(String value) {
            addCriterion("AccType <>", value, "acctype");
            return (Criteria) this;
        }

        public Criteria andAcctypeGreaterThan(String value) {
            addCriterion("AccType >", value, "acctype");
            return (Criteria) this;
        }

        public Criteria andAcctypeGreaterThanOrEqualTo(String value) {
            addCriterion("AccType >=", value, "acctype");
            return (Criteria) this;
        }

        public Criteria andAcctypeLessThan(String value) {
            addCriterion("AccType <", value, "acctype");
            return (Criteria) this;
        }

        public Criteria andAcctypeLessThanOrEqualTo(String value) {
            addCriterion("AccType <=", value, "acctype");
            return (Criteria) this;
        }

        public Criteria andAcctypeLike(String value) {
            addCriterion("AccType like", value, "acctype");
            return (Criteria) this;
        }

        public Criteria andAcctypeNotLike(String value) {
            addCriterion("AccType not like", value, "acctype");
            return (Criteria) this;
        }

        public Criteria andAcctypeIn(List<String> values) {
            addCriterion("AccType in", values, "acctype");
            return (Criteria) this;
        }

        public Criteria andAcctypeNotIn(List<String> values) {
            addCriterion("AccType not in", values, "acctype");
            return (Criteria) this;
        }

        public Criteria andAcctypeBetween(String value1, String value2) {
            addCriterion("AccType between", value1, value2, "acctype");
            return (Criteria) this;
        }

        public Criteria andAcctypeNotBetween(String value1, String value2) {
            addCriterion("AccType not between", value1, value2, "acctype");
            return (Criteria) this;
        }

        public Criteria andAccstateIsNull() {
            addCriterion("AccState is null");
            return (Criteria) this;
        }

        public Criteria andAccstateIsNotNull() {
            addCriterion("AccState is not null");
            return (Criteria) this;
        }

        public Criteria andAccstateEqualTo(String value) {
            addCriterion("AccState =", value, "accstate");
            return (Criteria) this;
        }

        public Criteria andAccstateNotEqualTo(String value) {
            addCriterion("AccState <>", value, "accstate");
            return (Criteria) this;
        }

        public Criteria andAccstateGreaterThan(String value) {
            addCriterion("AccState >", value, "accstate");
            return (Criteria) this;
        }

        public Criteria andAccstateGreaterThanOrEqualTo(String value) {
            addCriterion("AccState >=", value, "accstate");
            return (Criteria) this;
        }

        public Criteria andAccstateLessThan(String value) {
            addCriterion("AccState <", value, "accstate");
            return (Criteria) this;
        }

        public Criteria andAccstateLessThanOrEqualTo(String value) {
            addCriterion("AccState <=", value, "accstate");
            return (Criteria) this;
        }

        public Criteria andAccstateLike(String value) {
            addCriterion("AccState like", value, "accstate");
            return (Criteria) this;
        }

        public Criteria andAccstateNotLike(String value) {
            addCriterion("AccState not like", value, "accstate");
            return (Criteria) this;
        }

        public Criteria andAccstateIn(List<String> values) {
            addCriterion("AccState in", values, "accstate");
            return (Criteria) this;
        }

        public Criteria andAccstateNotIn(List<String> values) {
            addCriterion("AccState not in", values, "accstate");
            return (Criteria) this;
        }

        public Criteria andAccstateBetween(String value1, String value2) {
            addCriterion("AccState between", value1, value2, "accstate");
            return (Criteria) this;
        }

        public Criteria andAccstateNotBetween(String value1, String value2) {
            addCriterion("AccState not between", value1, value2, "accstate");
            return (Criteria) this;
        }

        public Criteria andBalancedateIsNull() {
            addCriterion("BalanceDate is null");
            return (Criteria) this;
        }

        public Criteria andBalancedateIsNotNull() {
            addCriterion("BalanceDate is not null");
            return (Criteria) this;
        }

        public Criteria andBalancedateEqualTo(Date value) {
            addCriterionForJDBCDate("BalanceDate =", value, "balancedate");
            return (Criteria) this;
        }

        public Criteria andBalancedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("BalanceDate <>", value, "balancedate");
            return (Criteria) this;
        }

        public Criteria andBalancedateGreaterThan(Date value) {
            addCriterionForJDBCDate("BalanceDate >", value, "balancedate");
            return (Criteria) this;
        }

        public Criteria andBalancedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BalanceDate >=", value, "balancedate");
            return (Criteria) this;
        }

        public Criteria andBalancedateLessThan(Date value) {
            addCriterionForJDBCDate("BalanceDate <", value, "balancedate");
            return (Criteria) this;
        }

        public Criteria andBalancedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BalanceDate <=", value, "balancedate");
            return (Criteria) this;
        }

        public Criteria andBalancedateIn(List<Date> values) {
            addCriterionForJDBCDate("BalanceDate in", values, "balancedate");
            return (Criteria) this;
        }

        public Criteria andBalancedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("BalanceDate not in", values, "balancedate");
            return (Criteria) this;
        }

        public Criteria andBalancedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BalanceDate between", value1, value2, "balancedate");
            return (Criteria) this;
        }

        public Criteria andBalancedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BalanceDate not between", value1, value2, "balancedate");
            return (Criteria) this;
        }

        public Criteria andBalancemoneyIsNull() {
            addCriterion("BalanceMoney is null");
            return (Criteria) this;
        }

        public Criteria andBalancemoneyIsNotNull() {
            addCriterion("BalanceMoney is not null");
            return (Criteria) this;
        }

        public Criteria andBalancemoneyEqualTo(Integer value) {
            addCriterion("BalanceMoney =", value, "balancemoney");
            return (Criteria) this;
        }

        public Criteria andBalancemoneyNotEqualTo(Integer value) {
            addCriterion("BalanceMoney <>", value, "balancemoney");
            return (Criteria) this;
        }

        public Criteria andBalancemoneyGreaterThan(Integer value) {
            addCriterion("BalanceMoney >", value, "balancemoney");
            return (Criteria) this;
        }

        public Criteria andBalancemoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("BalanceMoney >=", value, "balancemoney");
            return (Criteria) this;
        }

        public Criteria andBalancemoneyLessThan(Integer value) {
            addCriterion("BalanceMoney <", value, "balancemoney");
            return (Criteria) this;
        }

        public Criteria andBalancemoneyLessThanOrEqualTo(Integer value) {
            addCriterion("BalanceMoney <=", value, "balancemoney");
            return (Criteria) this;
        }

        public Criteria andBalancemoneyIn(List<Integer> values) {
            addCriterion("BalanceMoney in", values, "balancemoney");
            return (Criteria) this;
        }

        public Criteria andBalancemoneyNotIn(List<Integer> values) {
            addCriterion("BalanceMoney not in", values, "balancemoney");
            return (Criteria) this;
        }

        public Criteria andBalancemoneyBetween(Integer value1, Integer value2) {
            addCriterion("BalanceMoney between", value1, value2, "balancemoney");
            return (Criteria) this;
        }

        public Criteria andBalancemoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("BalanceMoney not between", value1, value2, "balancemoney");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNull() {
            addCriterion("Principal is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNotNull() {
            addCriterion("Principal is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalEqualTo(Integer value) {
            addCriterion("Principal =", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotEqualTo(Integer value) {
            addCriterion("Principal <>", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThan(Integer value) {
            addCriterion("Principal >", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThanOrEqualTo(Integer value) {
            addCriterion("Principal >=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThan(Integer value) {
            addCriterion("Principal <", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThanOrEqualTo(Integer value) {
            addCriterion("Principal <=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalIn(List<Integer> values) {
            addCriterion("Principal in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotIn(List<Integer> values) {
            addCriterion("Principal not in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalBetween(Integer value1, Integer value2) {
            addCriterion("Principal between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotBetween(Integer value1, Integer value2) {
            addCriterion("Principal not between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andInterestIsNull() {
            addCriterion("Interest is null");
            return (Criteria) this;
        }

        public Criteria andInterestIsNotNull() {
            addCriterion("Interest is not null");
            return (Criteria) this;
        }

        public Criteria andInterestEqualTo(Integer value) {
            addCriterion("Interest =", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotEqualTo(Integer value) {
            addCriterion("Interest <>", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThan(Integer value) {
            addCriterion("Interest >", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThanOrEqualTo(Integer value) {
            addCriterion("Interest >=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThan(Integer value) {
            addCriterion("Interest <", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThanOrEqualTo(Integer value) {
            addCriterion("Interest <=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestIn(List<Integer> values) {
            addCriterion("Interest in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotIn(List<Integer> values) {
            addCriterion("Interest not in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestBetween(Integer value1, Integer value2) {
            addCriterion("Interest between", value1, value2, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotBetween(Integer value1, Integer value2) {
            addCriterion("Interest not between", value1, value2, "interest");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CreateDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterionForJDBCDate("CreateDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CreateDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("CreateDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CreateDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterionForJDBCDate("CreateDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CreateDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterionForJDBCDate("CreateDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CreateDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CreateDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CreateDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andDestorydateIsNull() {
            addCriterion("DestoryDate is null");
            return (Criteria) this;
        }

        public Criteria andDestorydateIsNotNull() {
            addCriterion("DestoryDate is not null");
            return (Criteria) this;
        }

        public Criteria andDestorydateEqualTo(Date value) {
            addCriterionForJDBCDate("DestoryDate =", value, "destorydate");
            return (Criteria) this;
        }

        public Criteria andDestorydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("DestoryDate <>", value, "destorydate");
            return (Criteria) this;
        }

        public Criteria andDestorydateGreaterThan(Date value) {
            addCriterionForJDBCDate("DestoryDate >", value, "destorydate");
            return (Criteria) this;
        }

        public Criteria andDestorydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DestoryDate >=", value, "destorydate");
            return (Criteria) this;
        }

        public Criteria andDestorydateLessThan(Date value) {
            addCriterionForJDBCDate("DestoryDate <", value, "destorydate");
            return (Criteria) this;
        }

        public Criteria andDestorydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DestoryDate <=", value, "destorydate");
            return (Criteria) this;
        }

        public Criteria andDestorydateIn(List<Date> values) {
            addCriterionForJDBCDate("DestoryDate in", values, "destorydate");
            return (Criteria) this;
        }

        public Criteria andDestorydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("DestoryDate not in", values, "destorydate");
            return (Criteria) this;
        }

        public Criteria andDestorydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DestoryDate between", value1, value2, "destorydate");
            return (Criteria) this;
        }

        public Criteria andDestorydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DestoryDate not between", value1, value2, "destorydate");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNull() {
            addCriterion("ModifyDate is null");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNotNull() {
            addCriterion("ModifyDate is not null");
            return (Criteria) this;
        }

        public Criteria andModifydateEqualTo(Date value) {
            addCriterionForJDBCDate("ModifyDate =", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ModifyDate <>", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThan(Date value) {
            addCriterionForJDBCDate("ModifyDate >", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ModifyDate >=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThan(Date value) {
            addCriterionForJDBCDate("ModifyDate <", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ModifyDate <=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateIn(List<Date> values) {
            addCriterionForJDBCDate("ModifyDate in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ModifyDate not in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ModifyDate between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ModifyDate not between", value1, value2, "modifydate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}