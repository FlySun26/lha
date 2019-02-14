package com.lhxm2.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PinglunExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PinglunExample() {
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

        public Criteria andPlIdIsNull() {
            addCriterion("pl_id is null");
            return (Criteria) this;
        }

        public Criteria andPlIdIsNotNull() {
            addCriterion("pl_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlIdEqualTo(Integer value) {
            addCriterion("pl_id =", value, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdNotEqualTo(Integer value) {
            addCriterion("pl_id <>", value, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdGreaterThan(Integer value) {
            addCriterion("pl_id >", value, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pl_id >=", value, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdLessThan(Integer value) {
            addCriterion("pl_id <", value, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdLessThanOrEqualTo(Integer value) {
            addCriterion("pl_id <=", value, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdIn(List<Integer> values) {
            addCriterion("pl_id in", values, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdNotIn(List<Integer> values) {
            addCriterion("pl_id not in", values, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdBetween(Integer value1, Integer value2) {
            addCriterion("pl_id between", value1, value2, "plId");
            return (Criteria) this;
        }

        public Criteria andPlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pl_id not between", value1, value2, "plId");
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

        public Criteria andDtIdIsNull() {
            addCriterion("dt_id is null");
            return (Criteria) this;
        }

        public Criteria andDtIdIsNotNull() {
            addCriterion("dt_id is not null");
            return (Criteria) this;
        }

        public Criteria andDtIdEqualTo(Integer value) {
            addCriterion("dt_id =", value, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdNotEqualTo(Integer value) {
            addCriterion("dt_id <>", value, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdGreaterThan(Integer value) {
            addCriterion("dt_id >", value, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dt_id >=", value, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdLessThan(Integer value) {
            addCriterion("dt_id <", value, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdLessThanOrEqualTo(Integer value) {
            addCriterion("dt_id <=", value, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdIn(List<Integer> values) {
            addCriterion("dt_id in", values, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdNotIn(List<Integer> values) {
            addCriterion("dt_id not in", values, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdBetween(Integer value1, Integer value2) {
            addCriterion("dt_id between", value1, value2, "dtId");
            return (Criteria) this;
        }

        public Criteria andDtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dt_id not between", value1, value2, "dtId");
            return (Criteria) this;
        }

        public Criteria andPlUpidIsNull() {
            addCriterion("pl_upid is null");
            return (Criteria) this;
        }

        public Criteria andPlUpidIsNotNull() {
            addCriterion("pl_upid is not null");
            return (Criteria) this;
        }

        public Criteria andPlUpidEqualTo(Integer value) {
            addCriterion("pl_upid =", value, "plUpid");
            return (Criteria) this;
        }

        public Criteria andPlUpidNotEqualTo(Integer value) {
            addCriterion("pl_upid <>", value, "plUpid");
            return (Criteria) this;
        }

        public Criteria andPlUpidGreaterThan(Integer value) {
            addCriterion("pl_upid >", value, "plUpid");
            return (Criteria) this;
        }

        public Criteria andPlUpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pl_upid >=", value, "plUpid");
            return (Criteria) this;
        }

        public Criteria andPlUpidLessThan(Integer value) {
            addCriterion("pl_upid <", value, "plUpid");
            return (Criteria) this;
        }

        public Criteria andPlUpidLessThanOrEqualTo(Integer value) {
            addCriterion("pl_upid <=", value, "plUpid");
            return (Criteria) this;
        }

        public Criteria andPlUpidIn(List<Integer> values) {
            addCriterion("pl_upid in", values, "plUpid");
            return (Criteria) this;
        }

        public Criteria andPlUpidNotIn(List<Integer> values) {
            addCriterion("pl_upid not in", values, "plUpid");
            return (Criteria) this;
        }

        public Criteria andPlUpidBetween(Integer value1, Integer value2) {
            addCriterion("pl_upid between", value1, value2, "plUpid");
            return (Criteria) this;
        }

        public Criteria andPlUpidNotBetween(Integer value1, Integer value2) {
            addCriterion("pl_upid not between", value1, value2, "plUpid");
            return (Criteria) this;
        }

        public Criteria andPlTextIsNull() {
            addCriterion("pl_text is null");
            return (Criteria) this;
        }

        public Criteria andPlTextIsNotNull() {
            addCriterion("pl_text is not null");
            return (Criteria) this;
        }

        public Criteria andPlTextEqualTo(String value) {
            addCriterion("pl_text =", value, "plText");
            return (Criteria) this;
        }

        public Criteria andPlTextNotEqualTo(String value) {
            addCriterion("pl_text <>", value, "plText");
            return (Criteria) this;
        }

        public Criteria andPlTextGreaterThan(String value) {
            addCriterion("pl_text >", value, "plText");
            return (Criteria) this;
        }

        public Criteria andPlTextGreaterThanOrEqualTo(String value) {
            addCriterion("pl_text >=", value, "plText");
            return (Criteria) this;
        }

        public Criteria andPlTextLessThan(String value) {
            addCriterion("pl_text <", value, "plText");
            return (Criteria) this;
        }

        public Criteria andPlTextLessThanOrEqualTo(String value) {
            addCriterion("pl_text <=", value, "plText");
            return (Criteria) this;
        }

        public Criteria andPlTextLike(String value) {
            addCriterion("pl_text like", value, "plText");
            return (Criteria) this;
        }

        public Criteria andPlTextNotLike(String value) {
            addCriterion("pl_text not like", value, "plText");
            return (Criteria) this;
        }

        public Criteria andPlTextIn(List<String> values) {
            addCriterion("pl_text in", values, "plText");
            return (Criteria) this;
        }

        public Criteria andPlTextNotIn(List<String> values) {
            addCriterion("pl_text not in", values, "plText");
            return (Criteria) this;
        }

        public Criteria andPlTextBetween(String value1, String value2) {
            addCriterion("pl_text between", value1, value2, "plText");
            return (Criteria) this;
        }

        public Criteria andPlTextNotBetween(String value1, String value2) {
            addCriterion("pl_text not between", value1, value2, "plText");
            return (Criteria) this;
        }

        public Criteria andPlTimeIsNull() {
            addCriterion("pl_time is null");
            return (Criteria) this;
        }

        public Criteria andPlTimeIsNotNull() {
            addCriterion("pl_time is not null");
            return (Criteria) this;
        }

        public Criteria andPlTimeEqualTo(Date value) {
            addCriterion("pl_time =", value, "plTime");
            return (Criteria) this;
        }

        public Criteria andPlTimeNotEqualTo(Date value) {
            addCriterion("pl_time <>", value, "plTime");
            return (Criteria) this;
        }

        public Criteria andPlTimeGreaterThan(Date value) {
            addCriterion("pl_time >", value, "plTime");
            return (Criteria) this;
        }

        public Criteria andPlTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pl_time >=", value, "plTime");
            return (Criteria) this;
        }

        public Criteria andPlTimeLessThan(Date value) {
            addCriterion("pl_time <", value, "plTime");
            return (Criteria) this;
        }

        public Criteria andPlTimeLessThanOrEqualTo(Date value) {
            addCriterion("pl_time <=", value, "plTime");
            return (Criteria) this;
        }

        public Criteria andPlTimeIn(List<Date> values) {
            addCriterion("pl_time in", values, "plTime");
            return (Criteria) this;
        }

        public Criteria andPlTimeNotIn(List<Date> values) {
            addCriterion("pl_time not in", values, "plTime");
            return (Criteria) this;
        }

        public Criteria andPlTimeBetween(Date value1, Date value2) {
            addCriterion("pl_time between", value1, value2, "plTime");
            return (Criteria) this;
        }

        public Criteria andPlTimeNotBetween(Date value1, Date value2) {
            addCriterion("pl_time not between", value1, value2, "plTime");
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