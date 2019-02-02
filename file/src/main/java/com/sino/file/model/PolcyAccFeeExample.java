package com.sino.file.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PolcyAccFeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PolcyAccFeeExample() {
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

        public Criteria andCostmoneyIsNull() {
            addCriterion("CostMoney is null");
            return (Criteria) this;
        }

        public Criteria andCostmoneyIsNotNull() {
            addCriterion("CostMoney is not null");
            return (Criteria) this;
        }

        public Criteria andCostmoneyEqualTo(Integer value) {
            addCriterion("CostMoney =", value, "costmoney");
            return (Criteria) this;
        }

        public Criteria andCostmoneyNotEqualTo(Integer value) {
            addCriterion("CostMoney <>", value, "costmoney");
            return (Criteria) this;
        }

        public Criteria andCostmoneyGreaterThan(Integer value) {
            addCriterion("CostMoney >", value, "costmoney");
            return (Criteria) this;
        }

        public Criteria andCostmoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("CostMoney >=", value, "costmoney");
            return (Criteria) this;
        }

        public Criteria andCostmoneyLessThan(Integer value) {
            addCriterion("CostMoney <", value, "costmoney");
            return (Criteria) this;
        }

        public Criteria andCostmoneyLessThanOrEqualTo(Integer value) {
            addCriterion("CostMoney <=", value, "costmoney");
            return (Criteria) this;
        }

        public Criteria andCostmoneyIn(List<Integer> values) {
            addCriterion("CostMoney in", values, "costmoney");
            return (Criteria) this;
        }

        public Criteria andCostmoneyNotIn(List<Integer> values) {
            addCriterion("CostMoney not in", values, "costmoney");
            return (Criteria) this;
        }

        public Criteria andCostmoneyBetween(Integer value1, Integer value2) {
            addCriterion("CostMoney between", value1, value2, "costmoney");
            return (Criteria) this;
        }

        public Criteria andCostmoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("CostMoney not between", value1, value2, "costmoney");
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

        public Criteria andPaydateIsNull() {
            addCriterion("PayDate is null");
            return (Criteria) this;
        }

        public Criteria andPaydateIsNotNull() {
            addCriterion("PayDate is not null");
            return (Criteria) this;
        }

        public Criteria andPaydateEqualTo(Date value) {
            addCriterionForJDBCDate("PayDate =", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PayDate <>", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateGreaterThan(Date value) {
            addCriterionForJDBCDate("PayDate >", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PayDate >=", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateLessThan(Date value) {
            addCriterionForJDBCDate("PayDate <", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PayDate <=", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateIn(List<Date> values) {
            addCriterionForJDBCDate("PayDate in", values, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PayDate not in", values, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PayDate between", value1, value2, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PayDate not between", value1, value2, "paydate");
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