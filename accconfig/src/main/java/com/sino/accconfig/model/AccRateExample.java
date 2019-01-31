package com.sino.accconfig.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AccRateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccRateExample() {
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

        public Criteria andSerialnoIsNull() {
            addCriterion("SerialNo is null");
            return (Criteria) this;
        }

        public Criteria andSerialnoIsNotNull() {
            addCriterion("SerialNo is not null");
            return (Criteria) this;
        }

        public Criteria andSerialnoEqualTo(Long value) {
            addCriterion("SerialNo =", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotEqualTo(Long value) {
            addCriterion("SerialNo <>", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoGreaterThan(Long value) {
            addCriterion("SerialNo >", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoGreaterThanOrEqualTo(Long value) {
            addCriterion("SerialNo >=", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoLessThan(Long value) {
            addCriterion("SerialNo <", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoLessThanOrEqualTo(Long value) {
            addCriterion("SerialNo <=", value, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoIn(List<Long> values) {
            addCriterion("SerialNo in", values, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotIn(List<Long> values) {
            addCriterion("SerialNo not in", values, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoBetween(Long value1, Long value2) {
            addCriterion("SerialNo between", value1, value2, "serialno");
            return (Criteria) this;
        }

        public Criteria andSerialnoNotBetween(Long value1, Long value2) {
            addCriterion("SerialNo not between", value1, value2, "serialno");
            return (Criteria) this;
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

        public Criteria andRateIsNull() {
            addCriterion("Rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("Rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(BigDecimal value) {
            addCriterion("Rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(BigDecimal value) {
            addCriterion("Rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(BigDecimal value) {
            addCriterion("Rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(BigDecimal value) {
            addCriterion("Rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<BigDecimal> values) {
            addCriterion("Rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<BigDecimal> values) {
            addCriterion("Rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Rate not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("StartDate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("StartDate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterionForJDBCDate("StartDate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("StartDate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("StartDate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("StartDate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterionForJDBCDate("StartDate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("StartDate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterionForJDBCDate("StartDate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("StartDate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("StartDate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("StartDate not between", value1, value2, "startdate");
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

        public Criteria andEnddateIsNull() {
            addCriterion("EndDate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("EndDate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterionForJDBCDate("EndDate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("EndDate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterionForJDBCDate("EndDate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EndDate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterionForJDBCDate("EndDate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("EndDate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterionForJDBCDate("EndDate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("EndDate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EndDate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("EndDate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andMakedateIsNull() {
            addCriterion("MakeDate is null");
            return (Criteria) this;
        }

        public Criteria andMakedateIsNotNull() {
            addCriterion("MakeDate is not null");
            return (Criteria) this;
        }

        public Criteria andMakedateEqualTo(Date value) {
            addCriterionForJDBCDate("MakeDate =", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("MakeDate <>", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateGreaterThan(Date value) {
            addCriterionForJDBCDate("MakeDate >", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MakeDate >=", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateLessThan(Date value) {
            addCriterionForJDBCDate("MakeDate <", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("MakeDate <=", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateIn(List<Date> values) {
            addCriterionForJDBCDate("MakeDate in", values, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("MakeDate not in", values, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MakeDate between", value1, value2, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("MakeDate not between", value1, value2, "makedate");
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