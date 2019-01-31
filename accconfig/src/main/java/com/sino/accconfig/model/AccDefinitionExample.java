package com.sino.accconfig.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AccDefinitionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccDefinitionExample() {
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

        public Criteria andRiskcodeIsNull() {
            addCriterion("RiskCode is null");
            return (Criteria) this;
        }

        public Criteria andRiskcodeIsNotNull() {
            addCriterion("RiskCode is not null");
            return (Criteria) this;
        }

        public Criteria andRiskcodeEqualTo(String value) {
            addCriterion("RiskCode =", value, "riskcode");
            return (Criteria) this;
        }

        public Criteria andRiskcodeNotEqualTo(String value) {
            addCriterion("RiskCode <>", value, "riskcode");
            return (Criteria) this;
        }

        public Criteria andRiskcodeGreaterThan(String value) {
            addCriterion("RiskCode >", value, "riskcode");
            return (Criteria) this;
        }

        public Criteria andRiskcodeGreaterThanOrEqualTo(String value) {
            addCriterion("RiskCode >=", value, "riskcode");
            return (Criteria) this;
        }

        public Criteria andRiskcodeLessThan(String value) {
            addCriterion("RiskCode <", value, "riskcode");
            return (Criteria) this;
        }

        public Criteria andRiskcodeLessThanOrEqualTo(String value) {
            addCriterion("RiskCode <=", value, "riskcode");
            return (Criteria) this;
        }

        public Criteria andRiskcodeLike(String value) {
            addCriterion("RiskCode like", value, "riskcode");
            return (Criteria) this;
        }

        public Criteria andRiskcodeNotLike(String value) {
            addCriterion("RiskCode not like", value, "riskcode");
            return (Criteria) this;
        }

        public Criteria andRiskcodeIn(List<String> values) {
            addCriterion("RiskCode in", values, "riskcode");
            return (Criteria) this;
        }

        public Criteria andRiskcodeNotIn(List<String> values) {
            addCriterion("RiskCode not in", values, "riskcode");
            return (Criteria) this;
        }

        public Criteria andRiskcodeBetween(String value1, String value2) {
            addCriterion("RiskCode between", value1, value2, "riskcode");
            return (Criteria) this;
        }

        public Criteria andRiskcodeNotBetween(String value1, String value2) {
            addCriterion("RiskCode not between", value1, value2, "riskcode");
            return (Criteria) this;
        }

        public Criteria andAcctypeIsNull() {
            addCriterion("Acctype is null");
            return (Criteria) this;
        }

        public Criteria andAcctypeIsNotNull() {
            addCriterion("Acctype is not null");
            return (Criteria) this;
        }

        public Criteria andAcctypeEqualTo(String value) {
            addCriterion("Acctype =", value, "acctype");
            return (Criteria) this;
        }

        public Criteria andAcctypeNotEqualTo(String value) {
            addCriterion("Acctype <>", value, "acctype");
            return (Criteria) this;
        }

        public Criteria andAcctypeGreaterThan(String value) {
            addCriterion("Acctype >", value, "acctype");
            return (Criteria) this;
        }

        public Criteria andAcctypeGreaterThanOrEqualTo(String value) {
            addCriterion("Acctype >=", value, "acctype");
            return (Criteria) this;
        }

        public Criteria andAcctypeLessThan(String value) {
            addCriterion("Acctype <", value, "acctype");
            return (Criteria) this;
        }

        public Criteria andAcctypeLessThanOrEqualTo(String value) {
            addCriterion("Acctype <=", value, "acctype");
            return (Criteria) this;
        }

        public Criteria andAcctypeLike(String value) {
            addCriterion("Acctype like", value, "acctype");
            return (Criteria) this;
        }

        public Criteria andAcctypeNotLike(String value) {
            addCriterion("Acctype not like", value, "acctype");
            return (Criteria) this;
        }

        public Criteria andAcctypeIn(List<String> values) {
            addCriterion("Acctype in", values, "acctype");
            return (Criteria) this;
        }

        public Criteria andAcctypeNotIn(List<String> values) {
            addCriterion("Acctype not in", values, "acctype");
            return (Criteria) this;
        }

        public Criteria andAcctypeBetween(String value1, String value2) {
            addCriterion("Acctype between", value1, value2, "acctype");
            return (Criteria) this;
        }

        public Criteria andAcctypeNotBetween(String value1, String value2) {
            addCriterion("Acctype not between", value1, value2, "acctype");
            return (Criteria) this;
        }

        public Criteria andAccnameIsNull() {
            addCriterion("AccName is null");
            return (Criteria) this;
        }

        public Criteria andAccnameIsNotNull() {
            addCriterion("AccName is not null");
            return (Criteria) this;
        }

        public Criteria andAccnameEqualTo(String value) {
            addCriterion("AccName =", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameNotEqualTo(String value) {
            addCriterion("AccName <>", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameGreaterThan(String value) {
            addCriterion("AccName >", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameGreaterThanOrEqualTo(String value) {
            addCriterion("AccName >=", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameLessThan(String value) {
            addCriterion("AccName <", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameLessThanOrEqualTo(String value) {
            addCriterion("AccName <=", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameLike(String value) {
            addCriterion("AccName like", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameNotLike(String value) {
            addCriterion("AccName not like", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameIn(List<String> values) {
            addCriterion("AccName in", values, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameNotIn(List<String> values) {
            addCriterion("AccName not in", values, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameBetween(String value1, String value2) {
            addCriterion("AccName between", value1, value2, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameNotBetween(String value1, String value2) {
            addCriterion("AccName not between", value1, value2, "accname");
            return (Criteria) this;
        }

        public Criteria andInfoIsNull() {
            addCriterion("Info is null");
            return (Criteria) this;
        }

        public Criteria andInfoIsNotNull() {
            addCriterion("Info is not null");
            return (Criteria) this;
        }

        public Criteria andInfoEqualTo(String value) {
            addCriterion("Info =", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotEqualTo(String value) {
            addCriterion("Info <>", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThan(String value) {
            addCriterion("Info >", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThanOrEqualTo(String value) {
            addCriterion("Info >=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThan(String value) {
            addCriterion("Info <", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThanOrEqualTo(String value) {
            addCriterion("Info <=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLike(String value) {
            addCriterion("Info like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotLike(String value) {
            addCriterion("Info not like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoIn(List<String> values) {
            addCriterion("Info in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotIn(List<String> values) {
            addCriterion("Info not in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoBetween(String value1, String value2) {
            addCriterion("Info between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotBetween(String value1, String value2) {
            addCriterion("Info not between", value1, value2, "info");
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