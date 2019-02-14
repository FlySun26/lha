package com.lhxm2.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ZbPinglunExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZbPinglunExample() {
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

        public Criteria andZpIdIsNull() {
            addCriterion("zp_id is null");
            return (Criteria) this;
        }

        public Criteria andZpIdIsNotNull() {
            addCriterion("zp_id is not null");
            return (Criteria) this;
        }

        public Criteria andZpIdEqualTo(Integer value) {
            addCriterion("zp_id =", value, "zpId");
            return (Criteria) this;
        }

        public Criteria andZpIdNotEqualTo(Integer value) {
            addCriterion("zp_id <>", value, "zpId");
            return (Criteria) this;
        }

        public Criteria andZpIdGreaterThan(Integer value) {
            addCriterion("zp_id >", value, "zpId");
            return (Criteria) this;
        }

        public Criteria andZpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("zp_id >=", value, "zpId");
            return (Criteria) this;
        }

        public Criteria andZpIdLessThan(Integer value) {
            addCriterion("zp_id <", value, "zpId");
            return (Criteria) this;
        }

        public Criteria andZpIdLessThanOrEqualTo(Integer value) {
            addCriterion("zp_id <=", value, "zpId");
            return (Criteria) this;
        }

        public Criteria andZpIdIn(List<Integer> values) {
            addCriterion("zp_id in", values, "zpId");
            return (Criteria) this;
        }

        public Criteria andZpIdNotIn(List<Integer> values) {
            addCriterion("zp_id not in", values, "zpId");
            return (Criteria) this;
        }

        public Criteria andZpIdBetween(Integer value1, Integer value2) {
            addCriterion("zp_id between", value1, value2, "zpId");
            return (Criteria) this;
        }

        public Criteria andZpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("zp_id not between", value1, value2, "zpId");
            return (Criteria) this;
        }

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andZbIdIsNull() {
            addCriterion("zb_id is null");
            return (Criteria) this;
        }

        public Criteria andZbIdIsNotNull() {
            addCriterion("zb_id is not null");
            return (Criteria) this;
        }

        public Criteria andZbIdEqualTo(Integer value) {
            addCriterion("zb_id =", value, "zbId");
            return (Criteria) this;
        }

        public Criteria andZbIdNotEqualTo(Integer value) {
            addCriterion("zb_id <>", value, "zbId");
            return (Criteria) this;
        }

        public Criteria andZbIdGreaterThan(Integer value) {
            addCriterion("zb_id >", value, "zbId");
            return (Criteria) this;
        }

        public Criteria andZbIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("zb_id >=", value, "zbId");
            return (Criteria) this;
        }

        public Criteria andZbIdLessThan(Integer value) {
            addCriterion("zb_id <", value, "zbId");
            return (Criteria) this;
        }

        public Criteria andZbIdLessThanOrEqualTo(Integer value) {
            addCriterion("zb_id <=", value, "zbId");
            return (Criteria) this;
        }

        public Criteria andZbIdIn(List<Integer> values) {
            addCriterion("zb_id in", values, "zbId");
            return (Criteria) this;
        }

        public Criteria andZbIdNotIn(List<Integer> values) {
            addCriterion("zb_id not in", values, "zbId");
            return (Criteria) this;
        }

        public Criteria andZbIdBetween(Integer value1, Integer value2) {
            addCriterion("zb_id between", value1, value2, "zbId");
            return (Criteria) this;
        }

        public Criteria andZbIdNotBetween(Integer value1, Integer value2) {
            addCriterion("zb_id not between", value1, value2, "zbId");
            return (Criteria) this;
        }

        public Criteria andZpUpidIsNull() {
            addCriterion("zp_upid is null");
            return (Criteria) this;
        }

        public Criteria andZpUpidIsNotNull() {
            addCriterion("zp_upid is not null");
            return (Criteria) this;
        }

        public Criteria andZpUpidEqualTo(Integer value) {
            addCriterion("zp_upid =", value, "zpUpid");
            return (Criteria) this;
        }

        public Criteria andZpUpidNotEqualTo(Integer value) {
            addCriterion("zp_upid <>", value, "zpUpid");
            return (Criteria) this;
        }

        public Criteria andZpUpidGreaterThan(Integer value) {
            addCriterion("zp_upid >", value, "zpUpid");
            return (Criteria) this;
        }

        public Criteria andZpUpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("zp_upid >=", value, "zpUpid");
            return (Criteria) this;
        }

        public Criteria andZpUpidLessThan(Integer value) {
            addCriterion("zp_upid <", value, "zpUpid");
            return (Criteria) this;
        }

        public Criteria andZpUpidLessThanOrEqualTo(Integer value) {
            addCriterion("zp_upid <=", value, "zpUpid");
            return (Criteria) this;
        }

        public Criteria andZpUpidIn(List<Integer> values) {
            addCriterion("zp_upid in", values, "zpUpid");
            return (Criteria) this;
        }

        public Criteria andZpUpidNotIn(List<Integer> values) {
            addCriterion("zp_upid not in", values, "zpUpid");
            return (Criteria) this;
        }

        public Criteria andZpUpidBetween(Integer value1, Integer value2) {
            addCriterion("zp_upid between", value1, value2, "zpUpid");
            return (Criteria) this;
        }

        public Criteria andZpUpidNotBetween(Integer value1, Integer value2) {
            addCriterion("zp_upid not between", value1, value2, "zpUpid");
            return (Criteria) this;
        }

        public Criteria andZpTextIsNull() {
            addCriterion("zp_text is null");
            return (Criteria) this;
        }

        public Criteria andZpTextIsNotNull() {
            addCriterion("zp_text is not null");
            return (Criteria) this;
        }

        public Criteria andZpTextEqualTo(String value) {
            addCriterion("zp_text =", value, "zpText");
            return (Criteria) this;
        }

        public Criteria andZpTextNotEqualTo(String value) {
            addCriterion("zp_text <>", value, "zpText");
            return (Criteria) this;
        }

        public Criteria andZpTextGreaterThan(String value) {
            addCriterion("zp_text >", value, "zpText");
            return (Criteria) this;
        }

        public Criteria andZpTextGreaterThanOrEqualTo(String value) {
            addCriterion("zp_text >=", value, "zpText");
            return (Criteria) this;
        }

        public Criteria andZpTextLessThan(String value) {
            addCriterion("zp_text <", value, "zpText");
            return (Criteria) this;
        }

        public Criteria andZpTextLessThanOrEqualTo(String value) {
            addCriterion("zp_text <=", value, "zpText");
            return (Criteria) this;
        }

        public Criteria andZpTextLike(String value) {
            addCriterion("zp_text like", value, "zpText");
            return (Criteria) this;
        }

        public Criteria andZpTextNotLike(String value) {
            addCriterion("zp_text not like", value, "zpText");
            return (Criteria) this;
        }

        public Criteria andZpTextIn(List<String> values) {
            addCriterion("zp_text in", values, "zpText");
            return (Criteria) this;
        }

        public Criteria andZpTextNotIn(List<String> values) {
            addCriterion("zp_text not in", values, "zpText");
            return (Criteria) this;
        }

        public Criteria andZpTextBetween(String value1, String value2) {
            addCriterion("zp_text between", value1, value2, "zpText");
            return (Criteria) this;
        }

        public Criteria andZpTextNotBetween(String value1, String value2) {
            addCriterion("zp_text not between", value1, value2, "zpText");
            return (Criteria) this;
        }

        public Criteria andZpTimeIsNull() {
            addCriterion("zp_time is null");
            return (Criteria) this;
        }

        public Criteria andZpTimeIsNotNull() {
            addCriterion("zp_time is not null");
            return (Criteria) this;
        }

        public Criteria andZpTimeEqualTo(Date value) {
            addCriterionForJDBCDate("zp_time =", value, "zpTime");
            return (Criteria) this;
        }

        public Criteria andZpTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("zp_time <>", value, "zpTime");
            return (Criteria) this;
        }

        public Criteria andZpTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("zp_time >", value, "zpTime");
            return (Criteria) this;
        }

        public Criteria andZpTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("zp_time >=", value, "zpTime");
            return (Criteria) this;
        }

        public Criteria andZpTimeLessThan(Date value) {
            addCriterionForJDBCDate("zp_time <", value, "zpTime");
            return (Criteria) this;
        }

        public Criteria andZpTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("zp_time <=", value, "zpTime");
            return (Criteria) this;
        }

        public Criteria andZpTimeIn(List<Date> values) {
            addCriterionForJDBCDate("zp_time in", values, "zpTime");
            return (Criteria) this;
        }

        public Criteria andZpTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("zp_time not in", values, "zpTime");
            return (Criteria) this;
        }

        public Criteria andZpTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("zp_time between", value1, value2, "zpTime");
            return (Criteria) this;
        }

        public Criteria andZpTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("zp_time not between", value1, value2, "zpTime");
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