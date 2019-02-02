package com.sino.file.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BalanceTraceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BalanceTraceExample() {
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