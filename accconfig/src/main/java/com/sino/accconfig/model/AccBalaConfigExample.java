package com.sino.accconfig.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AccBalaConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccBalaConfigExample() {
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

        public Criteria andAcccodeIsNull() {
            addCriterion("AccCode is null");
            return (Criteria) this;
        }

        public Criteria andAcccodeIsNotNull() {
            addCriterion("AccCode is not null");
            return (Criteria) this;
        }

        public Criteria andAcccodeEqualTo(String value) {
            addCriterion("AccCode =", value, "acccode");
            return (Criteria) this;
        }

        public Criteria andAcccodeNotEqualTo(String value) {
            addCriterion("AccCode <>", value, "acccode");
            return (Criteria) this;
        }

        public Criteria andAcccodeGreaterThan(String value) {
            addCriterion("AccCode >", value, "acccode");
            return (Criteria) this;
        }

        public Criteria andAcccodeGreaterThanOrEqualTo(String value) {
            addCriterion("AccCode >=", value, "acccode");
            return (Criteria) this;
        }

        public Criteria andAcccodeLessThan(String value) {
            addCriterion("AccCode <", value, "acccode");
            return (Criteria) this;
        }

        public Criteria andAcccodeLessThanOrEqualTo(String value) {
            addCriterion("AccCode <=", value, "acccode");
            return (Criteria) this;
        }

        public Criteria andAcccodeLike(String value) {
            addCriterion("AccCode like", value, "acccode");
            return (Criteria) this;
        }

        public Criteria andAcccodeNotLike(String value) {
            addCriterion("AccCode not like", value, "acccode");
            return (Criteria) this;
        }

        public Criteria andAcccodeIn(List<String> values) {
            addCriterion("AccCode in", values, "acccode");
            return (Criteria) this;
        }

        public Criteria andAcccodeNotIn(List<String> values) {
            addCriterion("AccCode not in", values, "acccode");
            return (Criteria) this;
        }

        public Criteria andAcccodeBetween(String value1, String value2) {
            addCriterion("AccCode between", value1, value2, "acccode");
            return (Criteria) this;
        }

        public Criteria andAcccodeNotBetween(String value1, String value2) {
            addCriterion("AccCode not between", value1, value2, "acccode");
            return (Criteria) this;
        }

        public Criteria andBalatypeIsNull() {
            addCriterion("BalaType is null");
            return (Criteria) this;
        }

        public Criteria andBalatypeIsNotNull() {
            addCriterion("BalaType is not null");
            return (Criteria) this;
        }

        public Criteria andBalatypeEqualTo(String value) {
            addCriterion("BalaType =", value, "balatype");
            return (Criteria) this;
        }

        public Criteria andBalatypeNotEqualTo(String value) {
            addCriterion("BalaType <>", value, "balatype");
            return (Criteria) this;
        }

        public Criteria andBalatypeGreaterThan(String value) {
            addCriterion("BalaType >", value, "balatype");
            return (Criteria) this;
        }

        public Criteria andBalatypeGreaterThanOrEqualTo(String value) {
            addCriterion("BalaType >=", value, "balatype");
            return (Criteria) this;
        }

        public Criteria andBalatypeLessThan(String value) {
            addCriterion("BalaType <", value, "balatype");
            return (Criteria) this;
        }

        public Criteria andBalatypeLessThanOrEqualTo(String value) {
            addCriterion("BalaType <=", value, "balatype");
            return (Criteria) this;
        }

        public Criteria andBalatypeLike(String value) {
            addCriterion("BalaType like", value, "balatype");
            return (Criteria) this;
        }

        public Criteria andBalatypeNotLike(String value) {
            addCriterion("BalaType not like", value, "balatype");
            return (Criteria) this;
        }

        public Criteria andBalatypeIn(List<String> values) {
            addCriterion("BalaType in", values, "balatype");
            return (Criteria) this;
        }

        public Criteria andBalatypeNotIn(List<String> values) {
            addCriterion("BalaType not in", values, "balatype");
            return (Criteria) this;
        }

        public Criteria andBalatypeBetween(String value1, String value2) {
            addCriterion("BalaType between", value1, value2, "balatype");
            return (Criteria) this;
        }

        public Criteria andBalatypeNotBetween(String value1, String value2) {
            addCriterion("BalaType not between", value1, value2, "balatype");
            return (Criteria) this;
        }

        public Criteria andBalacycIsNull() {
            addCriterion("BalaCyc is null");
            return (Criteria) this;
        }

        public Criteria andBalacycIsNotNull() {
            addCriterion("BalaCyc is not null");
            return (Criteria) this;
        }

        public Criteria andBalacycEqualTo(String value) {
            addCriterion("BalaCyc =", value, "balacyc");
            return (Criteria) this;
        }

        public Criteria andBalacycNotEqualTo(String value) {
            addCriterion("BalaCyc <>", value, "balacyc");
            return (Criteria) this;
        }

        public Criteria andBalacycGreaterThan(String value) {
            addCriterion("BalaCyc >", value, "balacyc");
            return (Criteria) this;
        }

        public Criteria andBalacycGreaterThanOrEqualTo(String value) {
            addCriterion("BalaCyc >=", value, "balacyc");
            return (Criteria) this;
        }

        public Criteria andBalacycLessThan(String value) {
            addCriterion("BalaCyc <", value, "balacyc");
            return (Criteria) this;
        }

        public Criteria andBalacycLessThanOrEqualTo(String value) {
            addCriterion("BalaCyc <=", value, "balacyc");
            return (Criteria) this;
        }

        public Criteria andBalacycLike(String value) {
            addCriterion("BalaCyc like", value, "balacyc");
            return (Criteria) this;
        }

        public Criteria andBalacycNotLike(String value) {
            addCriterion("BalaCyc not like", value, "balacyc");
            return (Criteria) this;
        }

        public Criteria andBalacycIn(List<String> values) {
            addCriterion("BalaCyc in", values, "balacyc");
            return (Criteria) this;
        }

        public Criteria andBalacycNotIn(List<String> values) {
            addCriterion("BalaCyc not in", values, "balacyc");
            return (Criteria) this;
        }

        public Criteria andBalacycBetween(String value1, String value2) {
            addCriterion("BalaCyc between", value1, value2, "balacyc");
            return (Criteria) this;
        }

        public Criteria andBalacycNotBetween(String value1, String value2) {
            addCriterion("BalaCyc not between", value1, value2, "balacyc");
            return (Criteria) this;
        }

        public Criteria andInitdateIsNull() {
            addCriterion("INITDate is null");
            return (Criteria) this;
        }

        public Criteria andInitdateIsNotNull() {
            addCriterion("INITDate is not null");
            return (Criteria) this;
        }

        public Criteria andInitdateEqualTo(Date value) {
            addCriterionForJDBCDate("INITDate =", value, "initdate");
            return (Criteria) this;
        }

        public Criteria andInitdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("INITDate <>", value, "initdate");
            return (Criteria) this;
        }

        public Criteria andInitdateGreaterThan(Date value) {
            addCriterionForJDBCDate("INITDate >", value, "initdate");
            return (Criteria) this;
        }

        public Criteria andInitdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("INITDate >=", value, "initdate");
            return (Criteria) this;
        }

        public Criteria andInitdateLessThan(Date value) {
            addCriterionForJDBCDate("INITDate <", value, "initdate");
            return (Criteria) this;
        }

        public Criteria andInitdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("INITDate <=", value, "initdate");
            return (Criteria) this;
        }

        public Criteria andInitdateIn(List<Date> values) {
            addCriterionForJDBCDate("INITDate in", values, "initdate");
            return (Criteria) this;
        }

        public Criteria andInitdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("INITDate not in", values, "initdate");
            return (Criteria) this;
        }

        public Criteria andInitdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("INITDate between", value1, value2, "initdate");
            return (Criteria) this;
        }

        public Criteria andInitdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("INITDate not between", value1, value2, "initdate");
            return (Criteria) this;
        }

        public Criteria andRatetypeIsNull() {
            addCriterion("RateType is null");
            return (Criteria) this;
        }

        public Criteria andRatetypeIsNotNull() {
            addCriterion("RateType is not null");
            return (Criteria) this;
        }

        public Criteria andRatetypeEqualTo(String value) {
            addCriterion("RateType =", value, "ratetype");
            return (Criteria) this;
        }

        public Criteria andRatetypeNotEqualTo(String value) {
            addCriterion("RateType <>", value, "ratetype");
            return (Criteria) this;
        }

        public Criteria andRatetypeGreaterThan(String value) {
            addCriterion("RateType >", value, "ratetype");
            return (Criteria) this;
        }

        public Criteria andRatetypeGreaterThanOrEqualTo(String value) {
            addCriterion("RateType >=", value, "ratetype");
            return (Criteria) this;
        }

        public Criteria andRatetypeLessThan(String value) {
            addCriterion("RateType <", value, "ratetype");
            return (Criteria) this;
        }

        public Criteria andRatetypeLessThanOrEqualTo(String value) {
            addCriterion("RateType <=", value, "ratetype");
            return (Criteria) this;
        }

        public Criteria andRatetypeLike(String value) {
            addCriterion("RateType like", value, "ratetype");
            return (Criteria) this;
        }

        public Criteria andRatetypeNotLike(String value) {
            addCriterion("RateType not like", value, "ratetype");
            return (Criteria) this;
        }

        public Criteria andRatetypeIn(List<String> values) {
            addCriterion("RateType in", values, "ratetype");
            return (Criteria) this;
        }

        public Criteria andRatetypeNotIn(List<String> values) {
            addCriterion("RateType not in", values, "ratetype");
            return (Criteria) this;
        }

        public Criteria andRatetypeBetween(String value1, String value2) {
            addCriterion("RateType between", value1, value2, "ratetype");
            return (Criteria) this;
        }

        public Criteria andRatetypeNotBetween(String value1, String value2) {
            addCriterion("RateType not between", value1, value2, "ratetype");
            return (Criteria) this;
        }

        public Criteria andGuaranteedrateIsNull() {
            addCriterion("GuaranteedRate is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteedrateIsNotNull() {
            addCriterion("GuaranteedRate is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteedrateEqualTo(BigDecimal value) {
            addCriterion("GuaranteedRate =", value, "guaranteedrate");
            return (Criteria) this;
        }

        public Criteria andGuaranteedrateNotEqualTo(BigDecimal value) {
            addCriterion("GuaranteedRate <>", value, "guaranteedrate");
            return (Criteria) this;
        }

        public Criteria andGuaranteedrateGreaterThan(BigDecimal value) {
            addCriterion("GuaranteedRate >", value, "guaranteedrate");
            return (Criteria) this;
        }

        public Criteria andGuaranteedrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GuaranteedRate >=", value, "guaranteedrate");
            return (Criteria) this;
        }

        public Criteria andGuaranteedrateLessThan(BigDecimal value) {
            addCriterion("GuaranteedRate <", value, "guaranteedrate");
            return (Criteria) this;
        }

        public Criteria andGuaranteedrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GuaranteedRate <=", value, "guaranteedrate");
            return (Criteria) this;
        }

        public Criteria andGuaranteedrateIn(List<BigDecimal> values) {
            addCriterion("GuaranteedRate in", values, "guaranteedrate");
            return (Criteria) this;
        }

        public Criteria andGuaranteedrateNotIn(List<BigDecimal> values) {
            addCriterion("GuaranteedRate not in", values, "guaranteedrate");
            return (Criteria) this;
        }

        public Criteria andGuaranteedrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GuaranteedRate between", value1, value2, "guaranteedrate");
            return (Criteria) this;
        }

        public Criteria andGuaranteedrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GuaranteedRate not between", value1, value2, "guaranteedrate");
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